package controllers;
import services.FreeLancelotActorService;

import services.FreelanceLotGlobalStats;
import services.FreeLancelotWordStatsActor;
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
import java.util.stream.Collector;
import java.time.Duration;
import dao.FreelancerResult;
import dao.ProjectResponse;
import dao.User;
import dao.UserDetails;
import dao.UserProjectDisplay;
import play.mvc.*;
import services.FreeLancelotService;
import services.FreelancerAPIcallsService;
import services.UserProfileDisplayActor;
import services.UserProjectDisplayActor;
import scala.compat.java8.FutureConverters;
import scala.util.parsing.json.JSONObject;
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
import java.util.concurrent.*;
import java.util.function.*;
import javax.xml.*;
import java.util.*;
import akka.stream.javadsl.*;
import akka.stream.javadsl.Flow;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
 */

public class HomeController extends Controller {
	//static UserDetails userDetails;

	private final HashMap<String, List<ProjectResponse>> cache;
	private HttpExecutionContext httpExecutionContext;
	final ActorRef superActor;
    public static WSClient ws;

	
	/**
	 * This method is used to initialize the cache
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @since 1.0
	 */
    @Inject
	public HomeController(HttpExecutionContext httpExecutionContext,ActorSystem system,WSClient ws) {
    	cache = new HashMap<String, List<ProjectResponse>>();
    	  this.ws = ws;
    	  this.httpExecutionContext = httpExecutionContext;
    	  this.superActor = system.actorOf(SuperVisor.props(ws));
    	  
    }
    
/**
* This method is used to handle the main page as well as all the searches for the active projects depending upon the search string entered by the user 
* @author Vaibhav, Felipe, Gagandeep, Gurpreet
* @param request is the http request which contains session.
* @param keyWord consist of string to be passed to the Freelancer API which then displays the projects.
* @return This returns the HTML to the frontend.
* @throws IOException it throes IOException
* @version 1.0
* @since 1.0. 
*/
    
    public CompletionStage<Result> index(Http.Request request, String keyWord) throws IOException{
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
     
        if(request.session().get(keyWord).isPresent()){
            completableFuture.complete(request.session().get(keyWord).get());
            return completableFuture
                    .thenApplyAsync(response -> ok(views.html.index.render(cache.get(keyWord),request,keyWord,cache)));
        }  else {
                return FutureConverters
                                .toJava(ask(superActor,// call stream projects method here
                                                new FreeLancelotActorService.projectSearchActorClass(keyWord),
                                                5000))
                                .thenApplyAsync(response -> {
                                    if(((List<ProjectResponse>)response).size() > 0) {
                                        cache.put(keyWord, ((List<ProjectResponse>) response));
                                        return ok(views.html.index.render((List<ProjectResponse>)response,request,keyWord,cache)).addingToSession(request, keyWord, keyWord);
                                    }
                                    return ok(views.html.index.render((List<ProjectResponse>)response,request,keyWord,cache));
                                });
        }
    }
    
    
    /**
	 * This method is used to get the user profile
	 * @author Gagandeep Kaur
	 * @param owner_id of the user
	 * @version 1.0
	 * @since 1.0
	 * @return This returns the HTML to the frontend.
	 * @throws IOException If any error occurs during reading data or data in the stream is corrupted.
	 */
   public CompletionStage<Result> profile(int owner_id) throws IOException{
	   //CompletableFuture<String>completableFuture= new CompletableFuture<>();
	  return FutureConverters.toJava(ask(superActor,
			  new UserProfileDisplayActor.UserProfileActorClass(owner_id)
			  ,5000))
			  .thenApplyAsync(
					  res->ok(views.html.profile.render((UserDetails)res)));
					  
					  }

   
   /**
  	 * This method is used to get the user's projects
  	 * @author Gagandeep Kaur
  	 * @param owner_id is the id of project owner
  	 * @version 1.0
  	 * @since 1.0
  	 * @return This returns the HTML to the frontend.
  	 * @throws IOException If any error occurs during reading data or data in the stream is corrupted.
  	 */
   public CompletionStage<Result> userProj(int owner_id) throws IOException{
	   return FutureConverters.toJava(ask(superActor,
			   new UserProjectDisplayActor.UserProjectActorClass(owner_id),
			   5000 )).thenApplyAsync(res->ok(views.html.userProj.render((List<UserProjectDisplay>)res)));
	   
		  
}
  

    /**
     * @author Gurpreet Singh
     * This method/function, gets the information for Preview Description for the selected project.  
     * @param prevDescriptor This String contains Preview Description of the data
     * @return The word count of each word in the Preview Description
     * @throws IOException If any error occurs during reading data or data in the stream is corrupted.
     */
   public CompletionStage<Result> stats(String prevDescriptor) throws IOException{
       return FutureConverters
    		    .toJava(ask(superActor,// call stream projects method here
    		        new FreeLancelotWordStatsActor.wordStatsActorClass(prevDescriptor),10000))
    		            .thenApplyAsync(response -> ok(views.html.stats.render((HashMap<String, Integer>) response))).toCompletableFuture();
   }
    /*public CompletionStage<Result> stats(String prevDescriptor) throws IOException{
    	return FreeLancelotService.wordStats(prevDescriptor).thenApplyAsync(
    			response -> ok(views.html.stats.render(response))
    	);
    }*/ 
    
    /**
     * This method/function, gets the information of all the Preview Descriptions (For every Search).
     * @author Gurpreet Singh
     * @return The word count of each word in the Preview Description of the entire Search.
     * @throws IOException  If any error occurs during reading data or data in the stream is corrupted.
     */
   	public CompletionStage<Result> globalStats() throws IOException{
       return FutureConverters
    		    .toJava(ask(superActor,// call stream projects method here
    		        new FreelanceLotGlobalStats.globalStatsActorClass(cache),10000))
    		            .thenApplyAsync(response -> ok(views.html.stats.render((HashMap<String, Integer>) response))).toCompletableFuture();
   	}
    
   	/*public CompletionStage<Result> globalStats() throws IOException{
    	System.out.println("cache ::: " + cache);
    	return FreeLancelotService.globalWordStats(cache).thenApplyAsync(
    			response -> ok(views.html.stats.render(response))
    			);
    }*/
    
    /**
    * This method is used to handle the main page.
    * @author Vaibhav, Felipe, Gagandeep, Gurpreet
    * @return This returns the HTML to the frontend.
    * @version 1.0
    * @since 1.0. 
    */
    public Result landingPage() {
    	return ok(views.html.landingPage.render());
    }

    /**
     * A controller which is called when the skills route is accessed and calls the specified service to query projects.
     * @author Felipe Kosin Jorge
     * @param skill is the specific skill to be searched.
     * @return A CompletionStage of a Result which will render the skill.html page
     * @throws IOException if it occurs
     */
    public CompletionStage<Result> skills(String skill) throws IOException{
        return FreeLancelotService.skillsFilter(skill.replace("%20"," ")).thenApplyAsync(
                response -> ok(views.html.skills.render(response))
        );
    }
    
    
    //javadoc here
    public WebSocket socket(String keyWord) {
        return WebSocket.Text.accept(
                        request -> {
                                Sink<String, ?> in = Sink.foreach(System.out::println);
                                ObjectMapper o = new ObjectMapper();
                                // Send a single 'Hello!' message and then leave the socket open
                                Source<String, ?> out = null;
                                out = Source.tick(
                                                Duration.ofSeconds(4),
                                                Duration.ofSeconds(4),
                                                FutureConverters.toJava(ask(superActor,
                                                                new FreeLancelotActorService.projectSearchActorClass(
                                                                                keyWord),
                                                                5000))
                                                                .thenApplyAsync(response -> {
                                                                       // if (response.size() > 0) {
                                                                                cache.put(keyWord,
                                                                                                (List<ProjectResponse>) response);
                                                                        //}
                                                                        return response;
                                                                })
                                                                .thenApply(res -> {
                                                                        try {
                                                                                return o.writeValueAsString(
                                                                                                res);
                                                                        } catch (JsonProcessingException e) {
                                                                                e.printStackTrace();
                                                                        }
                                                                        return "";
                                                                }).toCompletableFuture())
                                                .map(CompletableFuture::get);
                                return Flow.fromSinkAndSource(in, out);
                        });
}
}
