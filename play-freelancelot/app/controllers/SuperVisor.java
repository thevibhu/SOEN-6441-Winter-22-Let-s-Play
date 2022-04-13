package controllers;

import akka.actor.*;
import akka.japi.pf.DeciderBuilder;
import akka.japi.pf.ReceiveBuilder;
import akka.actor.ActorInterruptedException;
import java.io.InterruptedIOException;
import java.util.concurrent.*;
import scala.concurrent.duration.Duration;
import java.util.*;
import play.libs.ws.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;

import static akka.actor.SupervisorStrategy.*;
import java.util.concurrent.CompletableFuture;

import akka.actor.Props;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;

import services.FreeLancelotActorService;
import services.FreelanceLotGlobalStats;
import services.FreeLancelotWordStatsActor;

public class SuperVisor extends AbstractLoggingActor {
    private final WSClient ws;

    @Inject
    public SuperVisor(WSClient ws) {
        this.ws = ws;
    }

    @Override
    public Receive createReceive() {

        final ActorRef projectSearchChild = getContext().actorOf(FreeLancelotActorService.props(ws));
        
        final ActorRef projectWordStats = getContext().actorOf(FreeLancelotWordStatsActor.props(ws));
        final ActorRef projectGlobalStats = getContext().actorOf(FreelanceLotGlobalStats.props(ws));

        return receiveBuilder()
                .match(FreeLancelotActorService.projectSearchActorClass.class, any -> {
                    projectSearchChild.forward(any, getContext());
                })
                .match(FreeLancelotWordStatsActor.wordStatsActorClass.class, any -> {
                	projectWordStats.forward(any, getContext());
                })
                .match(FreelanceLotGlobalStats.globalStatsActorClass.class, any -> {
                	projectGlobalStats.forward(any, getContext());
                })
                .build();
    }

    public static final OneForOneStrategy STRATEGYForHandlingException = new OneForOneStrategy(
            10,
            Duration.create("10 seconds"),
            DeciderBuilder
                    .match(InterruptedIOException.class, ex -> escalate())
                    .match(ActorInterruptedException.class, ex -> escalate())
                    .match(InterruptedException.class, ex -> escalate())
                    .match(ExecutionException.class, ex -> escalate())
                    .match(NullPointerException.class, ex -> restart())
                    .match(CompletionException.class, ex -> escalate())
                    .build());

    @Override
    public SupervisorStrategy supervisorStrategy() {
        return STRATEGYForHandlingException;
    }

    public static Props props(WSClient ws) {
        return Props.create(SuperVisor.class, ws);
    }
}