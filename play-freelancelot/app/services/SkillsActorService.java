package services;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.typed.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.FreelancerResult;
import dao.ProjectResponse;
import play.libs.ws.WSClient;
import scala.compat.java8.FutureConverters;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static akka.pattern.Patterns.ask;

public class SkillsActorService extends AbstractLoggingActor {
    private final WSClient ws;

    public SkillsActorService(WSClient ws) {
        this.ws = ws;
    }

    public static class SkillSearchActor{
        final private String key;

        public SkillSearchActor(String key) {
            this.key = key;
        }
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(SkillsActorService.SkillSearchActor.class,this::skills)
                .build();
    }

    public static Props props(WSClient ws){
        return Props.create(SkillsActorService.class,ws);
    }

    @SuppressWarnings("unchecked")
    public void skills(SkillSearchActor skill){
        final ActorRef sender = getSender();
        final ActorRef supervisor = getContext().actorOf(ServiceActorSupervisor.props(ws));

        ((CompletableFuture) FutureConverters.toJava(
                ask(supervisor, new FreelancerAPIcallsActorService.SearchProjectsApi(skill.key), 5000)))
                .thenApplyAsync(
                        object -> {
                            FreelancerResult res = new ObjectMapper().convertValue(object, new TypeReference<FreelancerResult>() {});
                            return FreeLancelotService.calculateFlesch(res.result.projects.stream()
                                    .map(p -> new ProjectResponse(p.getOwner_id(), p.getTime_submitted(),p.getTitle(), p.getProject_type(), FreeLancelotService.convertJobDetails(p.getJobs()),p.getSeo_url(), p.getPreview_description()))
                                    .filter(p -> p.skills.contains(skill.key)));
                        }
                )
                .thenAccept(response -> sender.tell(response,self()));
    }
}
