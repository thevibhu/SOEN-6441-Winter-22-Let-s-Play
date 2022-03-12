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
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.FreelancerResult;
import dao.Job;
import dao.Project;
import dao.ProjectResponse;

public class FreeLancelotService {
	
	public static CompletableFuture<List<ProjectResponse>>  streamProjects(String keyWord) throws IOException {
		return FreelancerAPIcallsService.getActiveProjects(keyWord).thenApplyAsync(
				projects -> {
					List<ProjectResponse> projRes = projects.stream()
							.map(p -> new ProjectResponse(p.getOwner_id(), p.getTime_submitted(),p.getTitle(), p.getProject_type(), convertJobDetails(p.getJobs()),p.getSeo_url(), getfleschIndex(p.getPreview_description()), getFKGL(p.getPreview_description()), getEducationalLevel(p.getPreview_description())))
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
		//double syllable count = countSyllables(preview_description);
		double syllablecount =0;
		double sentencecount = sentenceCount(preview_description);
		if (preview_description == "" || wordcount == 0 ) {
			return 999;
		}
		return  206.835 - 84.6*(syllablecount/wordcount) - 1.015*(wordcount/sentencecount);
	}
	
	private static double getFKGL(String preview_description) {
		double wordcount = wordCount(preview_description);
		//double syllable count = countSyllables(preview_description);
		double syllablecount =0;
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
		sentenceCount += sentenceList.length;
		return sentenceCount;
	}
	
	public static double wordCount(String preview_description) {
		int count=0;
        char ch[]= new char[preview_description.length()];     
        for(int i=0;i<preview_description.length();i++)  
        {  
            ch[i]= preview_description.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        } 
        return count;
	}
}