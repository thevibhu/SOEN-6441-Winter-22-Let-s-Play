package services;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import play.libs.ws.*;

import java.io.IOException;

import javax.inject.Inject;


/** This class holds all the external API calls to Freelancer.com
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 2.0
 * @since 1.0
*/

public class FreelancerAPIcallsActorService extends AbstractLoggingActor{
	 private final WSClient ws;

	    @Inject
	    public FreelancerAPIcallsActorService(WSClient ws) {
	        this.ws = ws;
	    }
		    
		@Override
		public Receive createReceive() {
			 return receiveBuilder()
		                .match(SearchProjectsApi.class, this::searchProjects)
		                .build();
		}
		
		public static class SearchProjectsApi {
	        private String keyWord;

	        public SearchProjectsApi(String keyWord) {
	            this.keyWord = keyWord;
	        }
	    }
		
		 public static Props props(WSClient ws) {
		        return Props.create(FreelancerAPIcallsActorService.class, ws);
		    }
		 
		 
		 /** This method is used to call the external Freelancer API to get the latest active projects using web sockets
			 * @author Vaibhav Verma
			 * @param keyWord is used by the Freelancer API to fetch projects according to it.
			 * @return it returns the list of projects returned by Freelancer API as a completable future.
			 * @version 2.0
			 * @throws IOException it throws IOException
			 * @since 1.0
			*/
		 public void searchProjects(SearchProjectsApi search) {
		        String url_for_request = "https://www.freelancer.com/api/projects/0.1/projects/active/";
		        final ActorRef senderRef = sender();
		        ws.url(url_for_request)
		                .addHeader("freelancer-oauth-v1", "WTHMHvTf8zHCJOGm4mRvTgq05sgw4H")
		                .addQueryParameter("query", String.valueOf(search.keyWord))
		                .addQueryParameter("limit", "250")
		                .addQueryParameter("job_details", "true")
		                .addQueryParameter("compact", "true")
		                .get()
		                .thenApplyAsync(WSResponse::asJson)
		                .thenAccept(r -> senderRef.tell( r, self()));
		    }

}
