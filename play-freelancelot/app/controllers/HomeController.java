package controllers;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

import dao.FreelancerResult;
import dao.ProjectResponse;
import play.mvc.*;
import services.FreeLancelotService;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /** searchResult.result.projects.toString()
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public CompletionStage<Result> index(String keyWord) throws IOException{
    	return FreeLancelotService.streamProjects(keyWord).thenApplyAsync(res -> ok(views.html.index.render(res))); 

    }
  
//       public void getActiveProjects(String keyword) throws InterruptedException, ExecutionException {
//    	   freeLancerService.getActiveProjects();
//   }

}
