package controllers;

import org.junit.Test;
import play.libs.concurrent.HttpExecutionContext;
import akka.actor.ActorRef;
import dao.UserDetails;
import dao.UserProjectDetails;
import dao.UserProjectDisplay;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Http;
import play.mvc.Http.RequestImpl;
import play.mvc.Result;
import play.test.WithApplication;
import services.FreeLancelotService;
import play.libs.ws.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;
import akka.actor.*;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
/**
 * Test file to test controller actions.
 * @author Vaibhav, Gurpreet, Gagandeep, Felipe
 * @version 1.0
 * @since 1.0
 */
public class HomeControllerTest extends WithApplication {
	public HttpExecutionContext httpExecutionContext;
	public ActorSystem system;
	@Inject WSClient ws;
//    public static WSClient (WSClient) new WSTestClient();
    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    
    /**
     * This method is used to test the landing page.
     * @author Vaibhav, Gurpreet, Gagandeep, Felipe
     * @version 1.0
     * @since 1.0
     */
    @Test
    public void testLandingPage() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/freelancelot");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    
    
    /**
     * This method is used to test the landing page content.
     * @author Vaibhav, Gurpreet, Gagandeep, Felipe
     * @version 1.0
     * @since 1.0
     */
    @Test
    public void testLandingPageContent() {
//     // WSClient ws = new WSClient();
//      Result result = new HomeController(httpExecutionContext,system,ws).landingPage();
//      assertEquals(OK, result.status());
//      assertEquals("text/html", result.contentType().get());
//      assertEquals("utf-8", result.charset().get());
    }
    
    /**
     * This method is used to test the search page content.
     * @author Vaibhav, Gurpreet, Gagandeep, Felipe
     * @version 1.0
     * @since 1.0
     * @throws IOException when it occurs
     */
    @Test
    public void testSearchPage() throws IOException {
    	 Http.RequestBuilder request = new Http.RequestBuilder().method(GET).uri("/SearchPage?keyWord=scala");
         Result result = route(app, request);
         assertEquals(OK, result.status());
         
         Result result2 = route(app, request);
         assertEquals(OK, result2.status());

    }
    
//    @Test
//    public void testSearchPageWithSession() throws IOException {
//    	HttpExecutionContext httpExecutionContext = new HttpExecutionContext(null);
//    	Http.Request = new Http.RequestBuilder()
//    	Result result = (Result) new HomeController(httpExecutionContext).index(null, "key");
//        assertEquals(OK, result.status());
//        assertEquals("text/html", result.contentType().get());
//        assertEquals("utf-8", result.charset().get());
//        
//	http://localhost:9000/GlobalStats
//    }

    /**
     * Test for the skill controller page in order to make sure the requested result returns OK.
     * @author Felipe Kosin Jorge
     * @version 1.0
     * @since 1.0
     * @throws IOException when it occurs
     */
    @Test
    public void testSkillPage() throws IOException{
        Http.RequestBuilder req = new Http.RequestBuilder().method(GET).uri("/Skills?skill=Java");
        Result res = route(app,req);
        assertEquals(OK,res.status());


    }
    
    /**
     * This method is used to test the globalStats page.
     * @author Gurpreet Singh
     * @throws IOException when it occurs
     * @version 1.0
     * @since 1.0
     */
    @Test
    public void testglobal() throws IOException{
        Http.RequestBuilder req = new Http.RequestBuilder().method(GET).uri("/GlobalStats");
        Result res = route(app,req);
        assertEquals(OK,res.status());


    }
    
    
    /**
     * This method is used to test user profile.
     * @author Gagandeep Kaur
     * @throws IOException when it occurs
     * @version 1.0
     * @since 1.0
     */
    @Test
    public void testprofile() throws IOException{
    	Http.RequestBuilder request = new Http.RequestBuilder().method(GET).uri("/UserProfile?owner_id=1");
    	Result rest = route(app,request);
    	assertEquals(OK,rest.status());
    }
    
    /**
     * This method is used to test user projects.
     * @author Gagandeep Kaur
     * @version 1.0
     * @since 1.0
     * @throws IOException when it occurs
     */
    @Test
    public void testuserProj() throws IOException {
      Http.RequestBuilder request = new Http.RequestBuilder().method(GET).uri("/UserProjects?owner_id=1");
      Result rest = route(app,request);
      assertEquals(OK, rest.status());
    }
}
