package services;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import akka.testkit.javadsl.TestKit;
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
import dao.Project;
import dao.ProjectResponse;
import play.libs.ws.WSClient;

import org.junit.ClassRule;
import org.junit.Test;

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
	
	 
	@Test
	public void test() {
		String data = "I javascript java";
        systemMock = ActorSystem.create();
        new TestKit(systemMock) {
            {
                final ActorRef tar = systemMock.actorOf(FreeLancelotActorService.props(ws));
                tar.tell(new FreeLancelotActorService.projectSearchActorClass("java"), getRef());

            }
        };
		
		 /*TestProbe<FreeLancelotActorService.projectSearchActorClass> probe =
				    testKit.createTestProbe(FreeLancelotActorService.projectSearchActorClass.class);
		 ActorRef<FreeLancelotActorService.Command> actor = testKit.spawn(FreeLancelotActorService.create("group", "device"));
		 actor.tell(new FreeLancelotActorService.streamProjects(new FreeLancelotActorService.projectSearchActorClass("java")));
		 ArrayList<Project> response = probe.receiveMessage();*/
	}

}
