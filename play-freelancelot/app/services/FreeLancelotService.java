package services;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.FreelancerResult;
import dao.Job;
import dao.Project;
import dao.ProjectResponse;


public class FreeLancelotService {
	public static  CompletableFuture<List<ProjectResponse>>  streamProjects(String keyWord) throws IOException {
		return FreelancerAPIcallsService.getActiveProjects(keyWord).thenApplyAsync(
				projects -> {
					List<ProjectResponse> projRes = projects.stream()
							//.flatMap(list->projRes.getJobs.stream())
							.map(p -> new ProjectResponse(p.getOwner_id(), p.getTime_submitted(),p.getTitle(), p.getProject_type(), convertJobDetails(p.getJobs())  ))
							.collect(Collectors.toList());
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

}
