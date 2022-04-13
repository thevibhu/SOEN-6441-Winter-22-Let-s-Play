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

public class FreelanceLotGlobalStats extends AbstractLoggingActor{
	
	ObjectMapper mapper;
	private final WSClient ws;

	@Inject
	public FreelanceLotGlobalStats(WSClient ws) {
		this.ws = ws;
	    mapper = new ObjectMapper();
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	        //context.getLog().info("Device actor {}-{} started");
	}
	
	public static class globalStatsActorClass {
		final private HashMap<String, List<ProjectResponse>> cacheResponse ;

        public globalStatsActorClass(HashMap<String, List<ProjectResponse>> cacheResponse) {
            this.cacheResponse = cacheResponse;
        }
	}
	
	public static Props props(WSClient ws) {
        return Props.create(FreelanceLotGlobalStats.class, ws);
    }
	
	@Override
	public Receive createReceive() {
		return receiveBuilder()
                .match(FreelanceLotGlobalStats.globalStatsActorClass.class, this::globalStatistics)
                .build();
	}
	
	public void globalStatistics(globalStatsActorClass obj) {
	    final ActorRef senderRef = sender();
	    
	    try {
	    	FreeLancelotService.globalWordStats(obj.cacheResponse)
	    	.thenAccept(response -> senderRef.tell((HashMap<String, Integer>) response, self()));
	    } catch (Exception ex) {
            System.out.println("Global Preview Descriptor !!!!!!   - Exception :" + ex);
        }
	}
}

