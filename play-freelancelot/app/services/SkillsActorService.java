package services;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dao.FreelancerResult;
import dao.ProjectResponse;
import play.libs.ws.WSClient;
import scala.compat.java8.FutureConverters;

import java.util.concurrent.CompletableFuture;

import static akka.pattern.Patterns.ask;

/**
 * This is an actor for searching projects with a specific Skill. This actor extends AbstractLoggingActor. This actor has a WSCLient and uses it to communicate with the Supervisor actor.
 * It has an inner class called SkillSearchActorClass which contains a string keyword for searching. It also contains a prop method for instance creation
 * @author Felipe Kosin Jorge
 */
public class SkillsActorService extends AbstractLoggingActor {
    private final WSClient ws;

    public SkillsActorService(WSClient ws) {
        super();
        this.ws = ws;
    }

    /**
     * Inner class inside SkillsActorService. This class contains a String key which is used in searching active projects.
     * @author Felipe Kosin Jorge
     */
    public static class SkillSearchActorClass {
        final private String key;

        public SkillSearchActorClass(String key) {
            this.key = key;
        }
        public static Behavior<SkillSearchActorClass> create(){
            return Behaviors.setup(context -> Behaviors.empty());
        }
    }

    /**
     * Akka Method to receive a message and create a response.
     * @return
     * @author Felipe Kosin Jorge
     */
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(SkillSearchActorClass.class,this::skills)
                .build();
    }

    /**
     * Creates an instance of this class with the given ws.
     * @param ws given WSClient for instance creation
     * @return an instance of this actor class.
     * @author Felipe Kosin Jorge
     */
    public static Props props(WSClient ws){
        return Props.create(SkillsActorService.class,ws);
    }

    public static Behavior<SkillsActorService> create(){
        return Behaviors.setup(context -> Behaviors.empty());
    }

    /**
     * This function queries the API for active projects and only returns the projects with the specific skill the user has searched for.
     * @param skill is a SkillSearchActorClass which contains a String keyword which is to be used in the search parameter.
     * @author Felipe Kosin Jorge
     */
    @SuppressWarnings("unchecked")
    public void skills(SkillSearchActorClass skill) {
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
