package services;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import dao.Project;

import dao.ProjectResponse;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import play.api.test.WsTestClient;
import play.libs.ws.WSClient;
import play.test.WSTestClient;

public class FreelancelotActorTest {
	 @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();
	 
	@Test
	public void test() {
		 TestProbe<FreeLancelotActorService.projectSearchActorClass> probe =
				    testKit.createTestProbe(FreeLancelotActorService.projectSearchActorClass.class);
		 ActorRef<FreeLancelotActorService.Command> actor = testKit.spawn(FreeLancelotActorService.create("group", "device"));
		 actor.tell(new FreeLancelotActorService.streamProjects(new FreeLancelotActorService.projectSearchActorClass("java")));
		 ArrayList<Project> response = probe.receiveMessage();
	}


	/**
	 * testkit skill test. Checking to see whether projects returned by the actor will contain the specific skill passed in.
	 * Tested single word, multiple words (spaces) and empty values.
	 */
	@Test
	public void SkillsActorTest(){
		TestProbe<SkillsActorService.SkillSearchActorClass> probe = testKit.createTestProbe(SkillsActorService.SkillSearchActorClass.class);
		ActorRef<SkillsActorService.SkillSearchActorClass> skillActor = testKit.spawn(SkillsActorService.create((WSClient) new WSTestClient()));

		List<ProjectResponse> result;

		skillActor.tell(new SkillsActorService.SkillSearchActorClass("Java"));
		result = probe.receiveMessage();
		result.forEach(projectResponse -> Assert.assertTrue(projectResponse.skills.contains("Java")));

		skillActor.tell(new SkillsActorService.SkillSearchActorClass("Graphic Design"));
		result = probe.receiveMessage();
		result.forEach(projectResponse -> Assert.assertTrue(projectResponse.skills.contains("Graphic Design")));

		skillActor.tell(new SkillsActorService.SkillSearchActorClass(""));
		result = probe.receiveMessage();
		Assert.assertEquals(10,result.size());

	}
}
