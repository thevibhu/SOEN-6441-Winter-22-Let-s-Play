package services;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URI;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.FreelancerResult;

import dao.Project;

import dao.User;
import dao.UserProfile;
import dao.UserProjectDetails;
import dao.UserProjects;

public class FreelancerAPIcallsService {
	public static  CompletableFuture<List<Project>>  getActiveProjects(String keyWord) throws IOException {
        CompletableFuture<List<Project>> future = new CompletableFuture<>();
	
        StringBuilder stringBuilder = new StringBuilder("https://www.freelancer.com/api/projects/0.1/projects/active/");
        stringBuilder.append("?query=");
        stringBuilder.append(URLEncoder.encode(keyWord, "UTF-8"));
        stringBuilder.append("&limit=");
        stringBuilder.append(URLEncoder.encode("10", "UTF-8"));
        stringBuilder.append("&compact=");
        stringBuilder.append(URLEncoder.encode("true", "UTF-8"));
        stringBuilder.append("&job_details=");
        stringBuilder.append(URLEncoder.encode("true", "UTF-8"));
		
        URL url = new URL(stringBuilder.toString());
		
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("freelancer-oauth-v1", "WTHMHvTf8zHCJOGm4mRvTgq05sgw4H");
		InputStream responseStream = connection.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		FreelancerResult res = mapper.readValue(responseStream, FreelancerResult.class);
		((CompletableFuture<List<Project>>) future).complete(res.result.projects);
		return future;
    }
	public static  CompletableFuture<UserProfile>  getUserDetails(int owner_id) throws IOException {
    CompletableFuture<UserProfile> user = new CompletableFuture();
     StringBuilder stringBuilder = new StringBuilder("https://www.freelancer.com/api/users/0.1/users/");
     stringBuilder.append("/");
     stringBuilder.append(URLEncoder.encode(String.valueOf(owner_id), "UTF-8"));
     stringBuilder.append("/");
     stringBuilder.append("?&compact=");
     stringBuilder.append(URLEncoder.encode("true", "UTF-8"));
     stringBuilder.append("&avatar=");
     stringBuilder.append(URLEncoder.encode("true", "UTF-8"));
    
     URL url = new URL(stringBuilder.toString());
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("freelancer-oauth-v1", "WTHMHvTf8zHCJOGm4mRvTgq05sgw4H");
		
		InputStream responseStream = connection.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		User root = mapper.readValue(responseStream, User.class);
		((CompletableFuture<UserProfile>)user).complete( root.result);
		return user;
	}
	
	public static  CompletableFuture<List<UserProjectDetails>>  getUserProjects(int owner_id) throws IOException {
	    CompletableFuture<List<UserProjectDetails>> userProjects = new CompletableFuture();
	     StringBuilder stringBuilder = new StringBuilder("https://www.freelancer.com/api/projects/0.1/projects/");
	     stringBuilder.append("?owners[]=");
	     stringBuilder.append(URLEncoder.encode(String.valueOf(owner_id), "UTF-8"));
	     stringBuilder.append("?&compact=");
	     stringBuilder.append(URLEncoder.encode("true", "UTF-8"));
	     stringBuilder.append("&limit=");
	     stringBuilder.append(URLEncoder.encode("10", "UTF-8"));
	    
	     URL url = new URL(stringBuilder.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("freelancer-oauth-v1", "WTHMHvTf8zHCJOGm4mRvTgq05sgw4H");
			
			InputStream responseStream = connection.getInputStream();
			ObjectMapper mapper = new ObjectMapper();
			 UserProjects root = mapper.readValue(responseStream, UserProjects.class);
			((CompletableFuture<List<UserProjectDetails>>)userProjects).complete(root.result.projects);
			return userProjects;
		}
}  
