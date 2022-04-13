package services;

import java.io.InterruptedIOException;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import scala.concurrent.duration.Duration;
import akka.AkkaException;
import akka.actor.AbstractActor.Receive;
import akka.actor.AbstractLoggingActor;
import akka.actor.ActorInterruptedException;
import akka.actor.ActorRef;
import akka.actor.OneForOneStrategy;
import akka.actor.Props;
import akka.actor.SupervisorStrategy;
import akka.japi.pf.DeciderBuilder;
import play.libs.ws.*;
import javax.inject.Inject;

public class ServiceActorSupervisor extends AbstractLoggingActor{
	private final WSClient ws;

    @Inject
    public ServiceActorSupervisor(WSClient ws) {
        this.ws = ws;
    }
	@Override
	public Receive createReceive() {
		 final ActorRef child = context().actorOf(FreelancerAPIcallsActorService.props(ws));
	        return receiveBuilder()
	                .match(FreelancerAPIcallsActorService.SearchProjectsApi.class, any -> {
	                    child.forward(any, getContext());
	                })
	                .build();
	}
	public static final OneForOneStrategy STRATEGYForHandlingException = new OneForOneStrategy(
            10,
            Duration.create("10 seconds"),
            DeciderBuilder
                    .match(InterruptedIOException.class, e -> SupervisorStrategy.escalate())
                    .match(ActorInterruptedException.class, e -> SupervisorStrategy.escalate())
                    .match(InterruptedException.class, e -> SupervisorStrategy.escalate())
                    .match(ExecutionException.class, e -> SupervisorStrategy.escalate())
                    .match(NullPointerException.class, e -> SupervisorStrategy.restart())
                    .match(CompletionException.class, e -> SupervisorStrategy.escalate())
                    .build());

    @Override
    public SupervisorStrategy supervisorStrategy() {
        return STRATEGYForHandlingException;
    }

    public static Props props(WSClient ws) {
        return Props.create(ServiceActorSupervisor.class, ws);
    }

}
