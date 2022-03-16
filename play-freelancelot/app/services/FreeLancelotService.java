package services;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.FreelancerResult;
import dao.Job;
import dao.Project;
import dao.ProjectResponse;

public class FreeLancelotService {
	public static String globalStr = "";
	
	/**
	 * This method transform the Cache Data to String format and returns the data for the Global Stats for every project.
	 * @param cache It contains data of every search request that use had made.
	 * @return The data is return in form of Map for the Global Stats.
     * @throws IOException If any error occurs during reading data or data in the stream is corrupted.
	 */
	public static CompletableFuture<HashMap<String, Integer>> globalWordStats(HashMap<String, List<ProjectResponse>> cache) throws IOException {
		CompletableFuture<HashMap<String, Integer>> future = new CompletableFuture<>();
	
		for (Entry<String, List<ProjectResponse>> data : cache.entrySet()) {
		    /*data.getValue().stream().forEach(x -> {
		    	globalStr = globalStr + " " + x.getPrevDescriptor();
		    });*/
		    		//.reduce("", (a,b) -> a + b.getPrevDescriptor());
			data.getValue().forEach(x -> {
		    	globalStr = globalStr + " " + x.getPrevDescriptor();
		    });
		}
		
		//globalStr = globalStr.substring(0,globalStr.length());		
		//Iterator<List<ProjectResponse>> globalValues = cache.values().iterator();
		
		/*while(globalValues.hasNext()) {
			globalValues.forEachRemaining(x -> {
				System.out.println(x);
				//globalStr = globalStr + " " + ;
			});
			globalValues.next();
		}*/
		
		future = FreeLancelotService.wordStats(globalStr);
		globalStr = "";
		return future;
	}
	
	/**
	 * This method transform the String of searches and returns the data for the Word Stats as per specific project.
	 * @param prevDescriptor This String contains Preview Description of the data.
	 * @return The data is return in form of Map for the Global Stats.
     * @throws IOException If any error occurs during reading data or data in the stream is corrupted.
	 */
	public static CompletableFuture<HashMap<String, Integer>> wordStats(String prevDescriptor) throws IOException {
		CompletableFuture<HashMap<String, Integer>> future = new CompletableFuture<>();
		
		//prevDescriptor = prevDescriptor.replaceAll("[\\[\\](){},.]"," ");
		//prevDescriptor = prevDescriptor.replaceAll("[^a-zA-Z]"," ");
        //.map(x -> x.split("\\s+"))
		List<String> wordList = Stream.of(prevDescriptor)
        		.map(x->x.replaceAll("[^\\w]", " "))
				.map(x -> x.split(" "))
        		.flatMap(Arrays::stream)
        		.collect(Collectors.toList());
		
		//System.out.println("wordList :: " + wordList);
        
		Map<String, Integer > wordCounter = wordList.stream()
            .collect(Collectors.toMap(x -> x.toLowerCase(), x -> 1, Integer::sum));
        
        //System.out.println("wordCounter ::: " + wordCounter);
 
        ((CompletableFuture<HashMap<String, Integer>>) future).complete((HashMap<String, Integer>) wordCounter);
		return future;
	}
	
	public static CompletableFuture<List<ProjectResponse>>  streamProjects(String keyWord) throws IOException {
		return FreelancerAPIcallsService.getActiveProjects(keyWord).thenApplyAsync(
				projects -> {
					List<ProjectResponse> projRes = projects.stream()
							.map(p -> new ProjectResponse(p.getOwner_id(), p.getTime_submitted(),p.getTitle(), p.getProject_type(), convertJobDetails(p.getJobs()),p.getSeo_url(), getfleschIndex(p.getPreview_description()), getFKGL(p.getPreview_description()), getEducationalLevel(p.getPreview_description()), p.getPreview_description()))
							.collect(Collectors.toList());	
					return projRes;
				}
		);
	}
	
	public static  List<String>  convertJobDetails(ArrayList<Job> jobs){
		List<String> skills = jobs.stream()
				.map(p -> p.getName())
				.collect(Collectors.toList());
		return skills;	
	}
	
	public static String getEducationalLevel(String preview_description){
		int fleshIndex = (int)getfleschIndex(preview_description);
		return checkEducationalLevel(fleshIndex);
	}
	
	private static double getfleschIndex(String preview_description) {
		double wordcount = wordCount(preview_description);
		double syllablecount = syllablesCount(preview_description);
		double sentencecount = sentenceCount(preview_description);
		if (preview_description == "" || wordcount == 0 ) {
			return 999;
		}
		return  206.835 - 84.6*(syllablecount/wordcount) - 1.015*(wordcount/sentencecount);
	}
	
	private static double getFKGL(String preview_description) {
		double wordcount = wordCount(preview_description);
		double syllablecount = syllablesCount(preview_description);
		double sentencecount = sentenceCount(preview_description);
		if (preview_description == "" || wordcount == 0 ) {
			return 999;
		}
		return  0.39*(wordcount/sentencecount) + 11.8*(syllablecount/wordcount);
	}

	public static String checkEducationalLevel(double fleschIndex) {
		
		if (fleschIndex <= 0) {
			return "Law School Graduate"; 
		} else if (fleschIndex <= 30 && fleschIndex >0 ) {
			return "College Graduate";
		} else if (fleschIndex <= 51 && fleschIndex >31 ) {
			return "Some College";
		} else if (fleschIndex <= 61 && fleschIndex >51 ) {
			return "High School";
		} else if (fleschIndex <= 66 && fleschIndex >61 ) {
			return "9th grade";
		} else if (fleschIndex <= 71 && fleschIndex >66 ) {
			return "8th grade";
		} else if (fleschIndex <= 81 && fleschIndex >71 ) {
			return "7th grade";
		} else if (fleschIndex <= 91 && fleschIndex >81 ) {
			return "6th grade";
		} else if (fleschIndex <= 100 && fleschIndex >91 ) {
			return "5th grade";
		} else if (fleschIndex >100 ) {
			return "Early";
		}
		return "Unable to compute";
		
	}
	
	public static double sentenceCount(String preview_description) {
		int sentenceCount = 0;
		String[] sentenceList = preview_description.split("[!?.:]+");
		sentenceCount =sentenceCount + sentenceList.length;
		return sentenceCount;
	}
	
	public static double syllablesCount(String preview_description) {
		Pattern p = Pattern.compile("[aeiouy]+[^$e(,.:;!?)]");
		Matcher m = p.matcher(preview_description);
		int syllables = 0;
		while (m.find()){
		    syllables++;
		}
		return syllables;
	}
	
	public static double wordCount(String preview_description) {
		int count=0;
        for(int i=0;i<preview_description.length();i++)  
        {   
            if( ((i>0)&&(preview_description.charAt(i)!=' ')&&(preview_description.charAt(i-1)==' ')) || ((preview_description.charAt(0)!=' ')&&(i==0)) )  
                count++;  
        } 
        return count;
	}
}