package services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;



public class freeLancerService {
	
	public static  <T> List<T>  getActiveProjects() {
		var client = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder(
			       URI.create("https://www.freelancer.com/api/projects/0.1/projects/active/?compact=true"))
			   .header("freelancer-oauth-v1", "WTHMHvTf8zHCJOGm4mRvTgq05sgw4H")
			   .build();
		var responseFuture = client.sendAsync(request, null);
		try {
			var response = ((CompletableFuture<HttpResponse<Object>>) responseFuture).get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		return null;
    }

}
