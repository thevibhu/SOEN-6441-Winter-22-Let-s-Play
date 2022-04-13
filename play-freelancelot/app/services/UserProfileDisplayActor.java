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
import dao.UserDetails;
import scala.compat.java8.FutureConverters;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static akka.pattern.Patterns.ask;
import dao.FreelancerResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import dao.Project;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import com.fasterxml.jackson.databind.DeserializationFeature;

/** This Actor class holds all the business logic which is used by the controller in order to fetch useful data about the User
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/

 
public class UserProfileDisplayActor extends AbstractLoggingActor{
	
	ObjectMapper mapper;
	private final WSClient ws;

	@Inject
	public UserProfileDisplayActor(WSClient ws) {
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
	
	public static Props props(WSClient ws) {
        return Props.create(UserProfileDisplayActor.class, ws);
    }
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
                .match(UserProfileDisplayActor.UserProfileActorClass.class, this::userProfile)
                .build();
	}
	
	/** This method is used to get the data from API and send to frontend
	 * @author  Gagandeep Kaur
	 * @return it returns the Object of UserDetails which is used by the response
	 * @version 1.0
	 * @since 1.0
	*/
	
	public void userProfile(UserProfileActorClass obj) {
	    final ActorRef senderRef = sender();
	    
	    try {
	    	FreeLancelotService.getUser(obj.owner_id)
	    	.thenAccept(response -> senderRef.tell((UserDetails) response, self()));
	    } catch (Exception ex) {
            System.out.println("UserProfile !!!!!!   - Exception :" + ex);
        }
	}
}

