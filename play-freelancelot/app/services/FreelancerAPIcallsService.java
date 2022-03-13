package services;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.FreelancerResult;
import dao.Project;

public class FreelancerAPIcallsService {
	public static  CompletableFuture<List<Project>>  getActiveProjects(String keyWord) throws IOException {
        CompletableFuture<List<Project>> future = new CompletableFuture<>();
//		String url_string ="https://www.freelancer.com/api/projects/0.1/projects/active/?compact=true";
//		String query = String.valueOf("\"" + keyWord + "\"");
//		url_string = url_string + "&query=" + query + "&limit=10" + "&job_details=true";
//		String finalURL = String.valueOf(url_string);
		
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
}
