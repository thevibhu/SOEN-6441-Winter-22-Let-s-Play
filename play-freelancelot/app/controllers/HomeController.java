package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.security.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import dao.FreelancerResult;
import dao.ProjectResponse;
import play.mvc.*;
import services.FreeLancelotService;

import play.mvc.Http.Session;
import play.mvc.Http;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.Json;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.*;
import scala.compat.java8.FutureConverters;
import akka.actor.*;
import static akka.pattern.Patterns.ask;
import akka.stream.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
 */
public class HomeController extends Controller {
	
	private HttpExecutionContext httpExecutionContext;
	private final HashMap<String, List<ProjectResponse>> cache;
    
    @Inject
	public HomeController(HttpExecutionContext httpExecutionContext) {
    	this.httpExecutionContext = httpExecutionContext;
    	cache = new HashMap<String, List<ProjectResponse>>();
    }
    
/**
* This method is used to handle the main page as well as all the searches for the active projects depending upon the search string entered by the user 
* @author Vaibhav, Felipe, Gagandeep, Gurpreet
* @param request is the http request which contains session.
* @param keyWord consist of string to be passed to the Freelancer API which then displays the projects.
* @return returns MVC result when the future is completed.
* @throws IOException it throes IOException
* @version 1.0
* @since 1.0. 
*/
    public CompletionStage<Result> index(Http.Request request, String keyWord) throws IOException{
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        
        System.out.println(" GET KEY ::: " + request.session().get(keyWord).isPresent());
        
        System.out.println("Session :  "+ request.session().data());
        System.out.println("Hash Table:" + cache);
        
        
        
        if(request.session().get(keyWord).isPresent()){
        //if(request.session().data().containsKey(keyWord+"_result")){
        	System.out.println("Inside ::: if ");
            completableFuture.complete(request.session().get(keyWord).get());
            return completableFuture
                    .thenApplyAsync(response -> ok(views.html.index.render(cache.get(keyWord),request,keyWord,cache)));
        } else {
        		return FreeLancelotService.streamProjects(keyWord)
                        .thenApplyAsync(response->{
                        	if(((List<ProjectResponse>)response).size() > 0) {
                        		System.out.println("Response ::: " + response);
                                cache.put(keyWord, ((List<ProjectResponse>) response));
                                return ok(views.html.index.render((List<ProjectResponse>)response,request,keyWord,cache)).addingToSession(request, keyWord, keyWord);
                            }
                            return ok(views.html.index.render((List<ProjectResponse>)response,request,keyWord,cache));
                       });
        }
    }
    
    
    
    
    
    
    
    
    
    
    /**
     * This method/function, gets the information for Preview Description for the selected project.  
     * @param prevDescriptor This String contains Preview Description of the data
     * @return The word count of each word in the Preview Description
     * @throws IOException If any error occurs during reading data or data in the stream is corrupted.
     */
    public CompletionStage<Result> stats(String prevDescriptor) throws IOException{
    	return FreeLancelotService.wordStats(prevDescriptor).thenApplyAsync(
    			response -> ok(views.html.stats.render(response))
    	);
    } 
    
    /**
     * This method/function, gets the information of all the Preview Descriptions (For every Search).
     * @return The word count of each word in the Preview Description of the entire Search.
     * @throws IOException If any error occurs during reading data or data in the stream is corrupted.
     */
    public CompletionStage<Result> globalStats() throws IOException{
    	System.out.println("cache ::: " + cache);
    	return FreeLancelotService.globalWordStats(cache).thenApplyAsync(
    			response -> ok(views.html.stats.render(response))
    			);
    }
    
    /**
    * This method is used to handle the main page.
    * @author Vaibhav, Felipe, Gagandeep, Gurpreet
    * @return It returns mvc result.
    * @version 1.0
    * @since 1.0. 
    */
    public Result landingPage() {
    	return ok(views.html.landingPage.render());
    }
    
}
