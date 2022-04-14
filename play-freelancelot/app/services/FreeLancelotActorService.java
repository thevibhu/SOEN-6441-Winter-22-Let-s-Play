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
 * @version 2.0
 * @since 1.0
*/
public class FreeLancelotActorService extends AbstractLoggingActor  {
	 public interface Command {}
	 ObjectMapper mapper;
	 private final WSClient ws;
//	 private final String groupId;
//	 private final String deviceId;
	 
	    @Inject
	    public FreeLancelotActorService(WSClient ws) {
	        this.ws = ws;
	        mapper = new ObjectMapper();
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	       // super(context);
//	        this.groupId = groupId;
//	        this.deviceId = deviceId;

	       // context.getLog().info("Device actor {}-{} started", groupId, deviceId);
	    }
	    
//	    public static Behavior<Command> create(String groupId, String deviceId, WSClient ws) {
//	        return Behaviors.setup(context -> new FreeLancelotActorService(ws, context, groupId, deviceId));
//	      }
	    
	    public static class projectSearchActorClass {
	        final private String keyWord;

	        public projectSearchActorClass(String keyWord) {
	            this.keyWord = keyWord;
	        }
	    }
	    

		@Override
		public Receive createReceive() {
			return receiveBuilder()
	                .match(FreeLancelotActorService.projectSearchActorClass.class, this::streamProjects)
	                .build();
		}
		
		public static Props props(WSClient ws) {
	        return Props.create(FreeLancelotActorService.class, ws);
	    }
		
		/** This method is used to get the json data from websocket and use the flesch converter before sending to frontend
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @param jobs is the arraylist of jobs fetched from Freelancer API.
		 * @return it returns the list of strings (skills) which is used by the project response.
		 * @version 2.0
		 * @since 1.0
		*/
		public void streamProjects(projectSearchActorClass obj) {
			//getContext().getLog().info("Recorded");
			
		    final ActorRef senderRef = sender();
		    final ActorRef superVisorActor = context().actorOf(ServiceActorSupervisor.props(ws));

		    ((CompletableFuture) FutureConverters.toJava(
		            ask(superVisorActor, new FreelancerAPIcallsActorService.SearchProjectsApi(obj.keyWord), 5000)))
		            .thenApplyAsync(json -> {
		                FreelancerResult freelancerResult = new FreelancerResult();
		                try {
		                    freelancerResult = mapper.convertValue(json, new TypeReference<FreelancerResult>() {
		                    });
		                } catch (Exception e) {
		                    System.out.println("Unable to parse incoming json object" + e);
		                }
		                //return convertProjects(freelancerResult.result.projects);
		                return freelancerResult.result.projects;
		            }).thenAccept(response -> senderRef.tell((List<Project>) response, self()));
		}
}
