package services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import akka.testkit.javadsl.TestKit;
import dao.ProjectResponse;

import org.mockito.MockitoAnnotations;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.bcel.internal.generic.NEW;

import play.libs.ws.*;
import akka.actor.ActorSystem;
import akka.actor.*;
import static org.hamcrest.CoreMatchers.*;

import java.io.*;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import services.FreeLancelotWordStatsActor.*;
import services.FreelanceLotGlobalStats.*;
import services.FreeLancelotActorService.*;
import play.libs.ws.WSClient;


public class FreelancelotActorTest {
    @Mock
    private WSClient ws;

    @Mock
    static ActorSystem systemMock;

    // @InjectMocks private StatisticsHelper help;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    /**
	 * A test to check Search Helper Actor of a string.
	 * @author Vaibhav Verma
	 * @throws InterruptedIOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @throws JsonProcessingException when it occurs
	 * @version 2.0
	 * @since 1.0
	 */
    @Test
    public void testSearchActor() throws InterruptedException, ExecutionException, JsonProcessingException,
            InterruptedIOException, IOException {
        String data = "I java java";
        ProjectResponse projectResults = new ProjectResponse();
        systemMock = ActorSystem.create();
        new TestKit(systemMock) {
            {
                final ActorRef tar = systemMock.actorOf(FreeLancelotActorService.props(ws));
                tar.tell(new FreeLancelotActorService.projectSearchActorClass("java"), getRef());
            }
        };
    }

    /**
	 * A test to check word stats of a string.
	 * @author Gurpreet Singh
	 * @throws InterruptedIOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @throws JsonProcessingException when it occurs
	 * @version 2.0
	 * @since 1.0
	 */
    @Test
    public void testWordActor() throws InterruptedException, ExecutionException, JsonProcessingException,
            InterruptedIOException, IOException {
        
        systemMock = ActorSystem.create();
        new TestKit(systemMock) {
            {
                final ActorRef tar = systemMock.actorOf(FreeLancelotWordStatsActor.props(ws));
                tar.tell(new FreeLancelotWordStatsActor.wordStatsActorClass("java"), getRef());

            }
        };
    }

    /**
	 * A test to check global word stats of a string.
	 * @author Gurpreet Singh
	 * @throws InterruptedIOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @throws JsonProcessingException when it occurs
	 * @version 2.0
	 * @since 1.0
	 */
    @Test
    public void testGlobalActor() throws InterruptedException, ExecutionException, JsonProcessingException,
            InterruptedIOException, IOException {
        
    	List<ProjectResponse> l = new ArrayList<ProjectResponse>();
		ProjectResponse p = new ProjectResponse();
		p.setPrevDescriptor("preview descriptor");
		l.add(p);
		HashMap<String,List<ProjectResponse>> hm = new HashMap<String,List<ProjectResponse>>();
		hm.put("key", l);
    	
        systemMock = ActorSystem.create();
        new TestKit(systemMock) {
            {
                final ActorRef tar = systemMock.actorOf(FreelanceLotGlobalStats.props(ws));
                tar.tell(new FreelanceLotGlobalStats.globalStatsActorClass(hm), getRef());

            }
        };
    }

    @Test
    public void testSkillActor(){
        //TestProbe<SkillsActorService> probe = testKit.createTestProbe(SkillsActorService.class);
        systemMock = ActorSystem.create();
        new TestKit(systemMock){
            {
            List<ProjectResponse> result;
            final ActorRef skillActor = systemMock.actorOf((SkillsActorService.props(ws)));
            skillActor.tell(new SkillsActorService.SkillSearchActorClass("java"), getRef());
            /*SkillsActorService.SkillSearchResponse obj = probe.receiveMessage(Duration.ofSeconds(120));
            result = obj.result;
            result.forEach(project -> Assert.assertTrue(project.skills.contains("java")));*/
            }
        };
    }

    /**
	 * A test to check User Profile using Owner Id
	 * @author Gurpreet Singh
	 * @throws InterruptedIOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @throws JsonProcessingException when it occurs
	 * @version 2.0
	 * @since 1.0
	 */

    @Test
    public void testUserProfile() throws InterruptedException, ExecutionException, JsonProcessingException,
            InterruptedIOException, IOException {

        systemMock = ActorSystem.create();
        new TestKit(systemMock) {
            {
                final ActorRef tar = systemMock.actorOf(UserProfileDisplayActor.props(ws));
                tar.tell(new UserProfileDisplayActor.UserProfileActorClass(12345) , getRef());

            }
        };
    }

    /**
	 * A test to check User Latest projects using owner id
	 * @author Gagandeep Kaur
	 * @throws InterruptedIOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @throws JsonProcessingException when it occurs
	 * @version 2.0
	 * @since 1.0
	 */

    @Test
    public void testUserProject() throws InterruptedException, ExecutionException, JsonProcessingException,
            InterruptedIOException, IOException {

        systemMock = ActorSystem.create();
        new TestKit(systemMock) {
            {
                final ActorRef tar = systemMock.actorOf(UserProjectDisplayActor.props(ws));
                tar.tell(new UserProjectDisplayActor.UserProjectActorClass(12345) , getRef());

            }
        };
    }
}

