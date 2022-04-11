package services;

import akka.actor.AbstractLoggingActor;
import akka.actor.*;
import play.libs.ws.*;
import akka.actor.ActorInterruptedException;
import akka.actor.ActorRef;
import akka.actor.Props;
import dao.ProjectResponse;
import scala.compat.java8.FutureConverters;
import java.util.concurrent.CompletableFuture;
import static akka.pattern.Patterns.ask;
import dao.FreelancerResult;
import java.util.List;
import dao.Project;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import com.fasterxml.jackson.databind.DeserializationFeature;

public class FreeLancelotActorService extends AbstractLoggingActor  {
	
	 ObjectMapper mapper;
	 private final WSClient ws;

	    @Inject
	    public FreeLancelotActorService(WSClient ws) {
	        this.ws = ws;
	        mapper = new ObjectMapper();
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    }
	    
	    public static class projectSearchActorClass {
	        final private String keyWord;
	        final private List<ProjectResponse> results;

	        public projectSearchActorClass(String keyWord, List<ProjectResponse> results) {
	            this.keyWord = keyWord;
	            this.results = results;
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
		
		public void streamProjects(projectSearchActorClass obj) {
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
		                return FreeLancelotService.convertProjects(freelancerResult.result.projects);	
		            }).thenAccept(response -> senderRef.tell((List<Project>) response, self()));
		}
}
