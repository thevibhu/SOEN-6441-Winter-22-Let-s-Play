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
import play.libs.ws.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	
	private HttpExecutionContext httpExecutionContext;
	private final HashMap<String, List<ProjectResponse>> cache;
    
    @Inject
	public HomeController(HttpExecutionContext httpExecutionContext, WSClient ws) {
    	this.httpExecutionContext = httpExecutionContext;
    	cache = new HashMap<String, List<ProjectResponse>>();
    }
    /** searchResult.result.projects.toString()
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public CompletionStage<Result> index(Http.Request request, String keyWord) throws IOException{
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        
        System.out.println(" GET KEY ::: " + request.session().get(keyWord).isPresent());
        
        System.out.println("Session :  "+ request.session().data());
        System.out.println("Hash Table:" + cache);
        
        
        
        //if(request.session().get(keyWord+"_result").isPresent()){
        if(request.session().data().containsKey(keyWord+"_result")){
        	System.out.println("Inside ::: if ");
            completableFuture.complete(request.session().get(keyWord+"_result").get());
            return completableFuture
                    .thenApplyAsync(response -> ok(views.html.index.render(cache.get(keyWord), request, keyWord, cache)));
        } else{
            return FreeLancelotService.streamProjects(keyWord)
                    .thenApplyAsync(response->{
                    	if(((List<ProjectResponse>)response).size() > 0) {
                            cache.put(keyWord, ((List<ProjectResponse>) response));
                            return ok(views.html.index.render((List<ProjectResponse>)response,request,keyWord,cache)).addingToSession(request, keyWord+"_result", keyWord);
                        }
                        return ok(views.html.index.render((List<ProjectResponse>)response,request,keyWord,cache));
                    });
            
        }
    }
    
    public CompletionStage<Result> stats(String prevDescriptor) throws IOException{
    	return FreeLancelotService.wordStats(prevDescriptor).thenApplyAsync(
    			response -> ok(views.html.stats.render(response))
    	);
    } 
  
}
