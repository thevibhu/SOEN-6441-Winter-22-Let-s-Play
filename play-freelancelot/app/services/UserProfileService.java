package services;

import akka.actor.AbstractLoggingActor;

import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import akka.actor.*;
import play.libs.ws.*;
import akka.actor.ActorInterruptedException;
import akka.actor.ActorRef;
import akka.actor.Props;
import dao.ProjectResponse;
import dao.User;
import dao.UserDetails;
import dao.UserProfile;
import scala.compat.java8.FutureConverters;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static akka.pattern.Patterns.ask;
import dao.FreelancerResult;

import java.util.ArrayList;
import java.util.List;
import dao.Project;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import com.fasterxml.jackson.databind.DeserializationFeature;


/** This Actor class holds all the business logic which is used by the controller in order to fetch useful data
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class UserProfileService extends AbstractLoggingActor  {
	
	 ObjectMapper mapper;
	 private final WSClient ws;

	    @Inject
	    public UserProfileService(WSClient ws) {
	        this.ws = ws;
	        mapper = new ObjectMapper();
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	        //context.getLog().info("Device actor {}-{} started");
	    }
	    
	    public static class UserProfileActorClass {
	        final private int owner_id;

	        public UserProfileActorClass(int owner_id) {
	            this.owner_id = owner_id;
	        }
	    }


		@Override
		public Receive createReceive() {
			return receiveBuilder()
	                .match(UserProfileService.UserProfileActorClass.class, this::userProfile)
	                .build();
		}
		
		public static Props props(WSClient ws) {
	        return Props.create(UserProfileService.class, ws);
	    }
		
		 public static UserDetails getDetails(UserProfile user) {
			 
				UserDetails userd= new UserDetails(user.getUsername(),user.getPublic_name(),user.getId(),user.getAvatar_large(),user.getChosen_role(),
						 user.getDisplay_name(),user.getRole());
				 
			 return userd;
		 }
		
		public void userProfile(UserProfileActorClass obj) {
			
		    final ActorRef senderRef = sender();
		    final ActorRef superVisorActor = context().actorOf(UserProfileSupervisor.props(ws));

		    ((CompletableFuture) FutureConverters.toJava(
		            ask(superVisorActor, new UserProfileAPICallService.UserProfileApi(obj.owner_id), 5000)))
		            .thenApplyAsync(json -> {
		                User user = new User();
		                try {
		                    user = mapper.convertValue(json, new TypeReference<User>() {
		                    });
		                } catch (Exception e) {
		                    System.out.println("Unable to parse incoming json object" + e);
		                }
		                return getDetails(user.result);
		                
		            }).thenAccept(response -> senderRef.tell((UserProfile) response, self()));
		}
}
