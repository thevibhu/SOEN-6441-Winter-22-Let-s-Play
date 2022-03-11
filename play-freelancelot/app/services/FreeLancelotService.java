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
					// Streams Processing
					List<ProjectResponse> projRes = projects.stream()
							//.flatMap(list->projRes.getJobs.stream())
							.map(p -> new ProjectResponse(p.getOwner_id(), p.getTime_submitted(),p.getTitle(), p.getProject_type(), convertJobDetails(p.getJobs()),getEducationalLevel(p.getPreview_description())))
							.collect(Collectors.toList()); // add stats hyperlink for b part					
					return projRes;
				}
		);
	}
	
	public static  List<String>  convertJobDetails(ArrayList<Job> jobs){
		List<String> skills = jobs.stream()
				.map(p -> p.getName()) // want to use a flatmap above instead
				.collect(Collectors.toList());
		return skills;	
	}
	
	public static String getEducationalLevel(String preview_description){
		double fleshIndex = getfleschIndex(preview_description);
		return checkEducationalLevel(fleshIndex);
	}
	
	private static double getfleschIndex(String preview_description) {
		double wordcount = 0;
		//double syllablecount = countSyllables(preview_description);
		double syllablecount =0;
		double sentencecount = 0;
		int location = 1;
		while(preview_description.indexOf(" ",location) != -1)
			    {
			        location = preview_description.indexOf(" ",location) + 1;
			        wordcount++;
			    }
				wordcount++;
			    location = 0;
			    
			    while(preview_description.indexOf(".",location) != -1)
			    	    {
			    	        location = preview_description.indexOf(".",location) + 1;
			    	        sentencecount++;
			    	    }
			    	    location = 0;
	
		
		if (preview_description == "" || wordcount == 0 ) {
			return 999;
		}
		System.out.println("============================");
		System.out.println(wordcount);
		System.out.println(sentencecount);
		System.out.println("============================");
		return  206.835 - 84.6*(syllablecount/wordcount) - 1.015*(wordcount/sentencecount);
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
	private static double countSyllables(String word) {
	    // start counting
	    int syllableCount = 0;

	    // use a while loop
	    int index = 0;
	    while (index < word.length()) {
	        char letter = word.charAt(index);

	        // if vowel:
	        if (isVowel(letter)) {
	            // specific case of "E"/"e"
	            if (letter == 'E' || letter == 'e') {

	                // 1. last "e" is ignored:
	                if (index == word.length() - 1) {
	                    index++;
	                }
	                // 2. if "ed" finished the word, it is ignored
	                else if (index == word.length() - 2
	                        && (word.charAt(word.length() - 1) == 'd' || word.charAt(word.length() - 1) == 'D')) {
	                    index++;
	                }
	                // 3. this is neither a last "e" or last "ed". Count as a syllable
	                else {
	                    // count one more syllable...
	                    syllableCount++;
	                    // ...and skip consecutive vowel
	                    while (isVowel(letter) && index < word.length() - 1) {
	                        index++;
	                        letter = word.charAt(index);
	                    }
	                }
	            } else {
	                // count one more syllable...
	                syllableCount++;
	                // ...and skip consecutive vowel
	                while (isVowel(letter) && index < word.length() - 1) {
	                    index++;
	                    letter = word.charAt(index);
	                }
	            }
	        }
	        // otherwise, keep going
	        else {
	            index++;
	        }
	    }

	    // return
	    return Math.max(1, syllableCount);
	}
	
	private static boolean isVowel(char letter) {
	    return letter == 'A' || letter == 'a'
	            || letter == 'E' || letter == 'e'
	            || letter == 'O' || letter == 'o'
	            || letter == 'I' || letter == 'i'
	            || letter == 'U' || letter == 'u';
	}

}
