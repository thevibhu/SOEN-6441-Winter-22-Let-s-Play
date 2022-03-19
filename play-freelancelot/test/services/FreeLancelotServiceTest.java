package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.Assert;
import org.junit.Test;

import dao.Job;
import dao.Project;
import dao.ProjectResponse;

public class FreeLancelotServiceTest {

//	@Test
//	public void streamProjectsTest() throws IOException, InterruptedException, ExecutionException {
//		CompletableFuture<List<ProjectResponse>> future = new CompletableFuture<>();
//		future.complete(FreeLancelotService.streamProjects(""));
//		assertNotNull(future.get().get(0));
//		
//	}
	
	@Test
	public void checkEducationalLevelTest() {
		assertEquals("College Graduate", FreeLancelotService.checkEducationalLevel(10));
		assertEquals("Law School Graduate", FreeLancelotService.checkEducationalLevel(0));
		assertEquals("Some College", FreeLancelotService.checkEducationalLevel(32));
		assertEquals("High School", FreeLancelotService.checkEducationalLevel(52));
		assertEquals("9th grade", FreeLancelotService.checkEducationalLevel(62));
		assertEquals("8th grade", FreeLancelotService.checkEducationalLevel(67));
		assertEquals("7th grade", FreeLancelotService.checkEducationalLevel(72));
		assertEquals("6th grade", FreeLancelotService.checkEducationalLevel(82));
		assertEquals("5th grade", FreeLancelotService.checkEducationalLevel(92));
		assertEquals("Early", FreeLancelotService.checkEducationalLevel(122));
		
	}
	
	@Test
	public void getEducationalLevelTest() {
		assertEquals("7th grade", FreeLancelotService.getEducationalLevel("hello this is a test that is obviously not perfect"));	
	}
	
	@Test
	public void getFleschIndexTest() {
		assertEquals((int)999, (int)FreeLancelotService.getfleschIndex(""));	
	}
	
	@Test
	public void getFkglTest() {
		assertEquals((int)999, (int)FreeLancelotService.getFKGL(""));	
		assertEquals((int)20, (int)FreeLancelotService.getFKGL("Hello this is another test"));	
	}
	
	@Test
	public void convertJobDetailsTest() {
		Job j = new Job();
		Job j2 = new Job();
		j.setName("php");
		j2.setName("scala");
		ArrayList<Job> list = new ArrayList<Job>();
		list.add(j);
		list.add(j2);
		List<String> x = FreeLancelotService.convertJobDetails(list);
		assertEquals("php", x.get(0));	
		assertEquals("scala", x.get(1));	
	}

	/**
	 * A test to check if the skill filter service filters projects according to the skill passed.
	 * @author Felipe Kosin Jorge
	 */
	@Test
	public void skillsFilterTest() throws IOException, ExecutionException, InterruptedException {
		List<ProjectResponse> result = FreeLancelotService.skillsFilter("Java").get();

		result.forEach(projectResponse -> Assert.assertTrue(projectResponse.skills.contains("Java")));
	}
}
