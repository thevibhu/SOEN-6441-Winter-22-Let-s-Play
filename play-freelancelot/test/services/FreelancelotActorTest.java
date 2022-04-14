package services;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.testkit.javadsl.TestKit;
import dao.ProjectResponse;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;

import java.util.List;

public class FreelancelotActorTest {
	 @ClassRule public static final TestKitJunitResource testKit = new TestKitJunitResource();
	 
	/*@Test
	public void test() {
		 TestProbe<FreeLancelotActorService.projectSearchActorClass> probe =
				    testKit.createTestProbe(FreeLancelotActorService.projectSearchActorClass.class);
		 ActorRef<FreeLancelotActorService.Command> actor = testKit.spawn(FreeLancelotActorService.create("group", "device"));
		 actor.tell(new FreeLancelotActorService.streamProjects(new FreeLancelotActorService.projectSearchActorClass("java")));
		 ArrayList<Project> response = probe.receiveMessage();
	}*/


	/**
	 * testkit skill test. Checking to see whether projects returned by the actor will contain the specific skill passed in.
	 * Tested single word, multiple words (spaces) and empty values.
	 */
	@Test
	public void testIt(){
		ActorSystem system = ActorSystem.create();
		new TestKit(system){
			{
			TestProbe<SkillsActorService.SkillSearchActorClass> probe = testKit.createTestProbe(SkillsActorService.SkillSearchActorClass.class);
			//ActorRef<SkillsActorService.SkillSearchActorClass> skillActor = testKit.spawn(SkillsActorService.SkillSearchActorClass.create());
			List<ProjectResponse> result;

			final Props props = Props.create(SkillsActorService.SkillSearchActorClass.class);
			final ActorRef skillActor = system.actorOf(props);
			//final TestKit probe = new TestKit(system);

			skillActor.tell("Java", getRef());
			result = (List<ProjectResponse>) probe.receiveMessage();
			result.forEach(projectResponse -> Assert.assertTrue(projectResponse.skills.contains("Java")));

			skillActor.tell("Graphic Design", getRef());
			result = (List<ProjectResponse>) probe.receiveMessage();
			result.forEach(projectResponse -> Assert.assertTrue(projectResponse.skills.contains("Graphic Design")));

			skillActor.tell("", getRef());
			result = (List<ProjectResponse>) probe.receiveMessage();
			Assert.assertEquals(10,result.size());

			}
		};
	}

}
