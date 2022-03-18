package controllers;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class HomeControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/freelancelot");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
    
    @Test
    public void testIndex2() throws IOException {
    	 Http.RequestBuilder request = new Http.RequestBuilder().method(GET).uri("/SearchPage?keyWord=scala");
         Result result = route(app, request);
         assertEquals(OK, result.status());
         
         Http.RequestBuilder request2 = new Http.RequestBuilder().method(GET).uri("/SearchPage?keyWord=scala");
         Result result2 = route(app, request2);
         assertEquals(OK, result2.status());

    }
    
    
}
