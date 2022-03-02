package controllers;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import dao.FreelancerResult;
import play.mvc.*;
import services.freeLancerService;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() throws IOException{
    	FreelancerResult searchResult = freeLancerService.getActiveProjects();
    	return ok(searchResult.result.projects.toString()); 

    }
  
//       public void getActiveProjects(String keyword) throws InterruptedException, ExecutionException {
//    	   freeLancerService.getActiveProjects();
//   }

}
