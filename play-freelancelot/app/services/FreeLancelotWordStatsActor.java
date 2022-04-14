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
import java.util.HashMap;
import java.util.List;
import dao.Project;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import com.fasterxml.jackson.databind.DeserializationFeature;

/** This Actor class holds is used to fetch data for Word Stats 
 * @author  Gurpreet Singh
 * @version 2.0
 * @since 1.0
*/
public class FreeLancelotWordStatsActor extends AbstractLoggingActor{
	
	ObjectMapper mapper;
	private final WSClient ws;

	@Inject
	public FreeLancelotWordStatsActor(WSClient ws) {
		this.ws = ws;
	    mapper = new ObjectMapper();
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	        //context.getLog().info("Device actor {}-{} started");
	}
	
	public static class wordStatsActorClass {
		final private String prevDescriptor;

        public wordStatsActorClass(String prevDescriptor) {
            this.prevDescriptor = prevDescriptor;
        }
	}
	
	public static Props props(WSClient ws) {
        return Props.create(FreeLancelotWordStatsActor.class, ws);
    }
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
                .match(FreeLancelotWordStatsActor.wordStatsActorClass.class, this::wordStatistics)
                .build();
	}
	
	/** This method is used to get the data from API for word Stats
	 * @author  Gurpreet Singh
	 * @version 2.0
	 * @since 1.0
	*/
	public void wordStatistics(wordStatsActorClass obj) {
	    final ActorRef senderRef = sender();
	    
	    try {
	    	FreeLancelotService.wordStats(obj.prevDescriptor)
	    	.thenAccept(response -> senderRef.tell((HashMap<String, Integer>) response, self()));
	    } catch (Exception ex) {
            System.out.println("Preview Descriptor !!!!!!   - Exception :" + ex);
        }
	}
}
