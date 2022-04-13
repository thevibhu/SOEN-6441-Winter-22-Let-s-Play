package services;

import static org.junit.Assert.*;

import java.util.ArrayList;

import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.actor.testkit.typed.javadsl.TestProbe;
import akka.actor.typed.ActorRef;
import dao.Project;

import org.junit.ClassRule;
import org.junit.Test;

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

}
