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

/** This class holds all the external API calls to Freelancer
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class FreelancerAPIcallsService {
	
	
	/** This method is used to call the external Freelancer API to get the latest active projects
	 * @author Vaibhav
	 * @param keyWord is used by the Freelancer API to fetch projects according to it.
	 * @return it returns the list of projects returned by Freelancer API as a completable future.
	 * @version 1.0
	 * @throws IOException it throes IOException
	 * @since 1.0
	*/
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
}
