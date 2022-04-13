package services;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import play.libs.ws.*;
import javax.inject.Inject;

public class UserProfileAPICallService extends AbstractLoggingActor{
	 private final WSClient ws;

	    @Inject
	    public UserProfileAPICallService(WSClient ws) {
	        this.ws = ws;
	    }
		    
		@Override
		public Receive createReceive() {
			System.out.print("Something");
			 return receiveBuilder()
		                .match(UserProfileApi.class, this::userProfile)
		                .build();
		}
		
		public static class UserProfileApi {
	        private int owner_id;

	        public UserProfileApi(int owner_id) {
	            this.owner_id = owner_id;
	        }
	    }
		
		 public static Props props(WSClient ws) {
		        return Props.create(UserProfileAPICallService.class, ws);
		    }
		 
		 public void userProfile(UserProfileApi owner) {
		        String url_for_request = "https://www.freelancer.com/api/users/0.1/users/"+ String.valueOf(owner.owner_id)+"/?compact=true&avatar=true";
		        System.out.print(url_for_request);
		        final ActorRef senderRef = sender();
		        ws.url(url_for_request)
		                .get()
		                .thenApplyAsync(WSResponse::asJson)
		                .thenAccept(r -> senderRef.tell( r, self()));
		    }

}

