package services;

import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.Assert;
import org.junit.Test;

import dao.Job;
import dao.Project;
import dao.ProjectResponse;

/**
 * This class is used to test service functionality
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class FreeLancelotServiceTest {

	
	/**
	 * A test to check readability level of the string depending upon it flesch index
	 * @author Vaibhav Verma
	 */
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
	
	
	/**
	 * A test to check readability level of a string
	 * @author Vaibhav Verma
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void getEducationalLevelTest() {
		assertEquals("7th grade", FreeLancelotService.getEducationalLevel("hello this is a test that is obviously not perfect"));	
	}
	
	
	/**
	 * A test to check the method that calculates flesh index, fkgl index and edu level of a stream of projects
	 * @author Vaibhav Verma
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void getcalculateFlesch() {
		ProjectResponse p = new ProjectResponse();
		p.setOwner_id(1);
		p.setPrevDescriptor("hello this is a test that is obviously not perfect");
		List<ProjectResponse> list = new ArrayList<ProjectResponse>();
		list.add(p);
		
		List<ProjectResponse> x = FreeLancelotService.calculateFlesch(list.stream());
		
		assertEquals("7th grade", x.get(0).getEdu_level());	
	}
	
	
	/**
	 * A test to check flesch index of a string
	 * @author Vaibhav Verma
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void getFleschIndexTest() {
		assertEquals((int)999, (int)FreeLancelotService.getfleschIndex(""));	
	}
	
	/**
	 * A test to check fkgl index of a string
	 * @author Vaibhav Verma
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void getFkglTest() {
		assertEquals((int)999, (int)FreeLancelotService.getFKGL(""));	
		assertEquals((int)20, (int)FreeLancelotService.getFKGL("Hello this is another test"));	
	}
	
	
	/**
	 * A test to check the jobs can be converted to an array list of strings
	 * @author Vaibhav Verma
	 * @version 1.0
	 * @since 1.0
	 */
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
	 * @throws IOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void skillsFilterTest() throws IOException, ExecutionException, InterruptedException {
		List<ProjectResponse> result = FreeLancelotService.skillsFilter("Java").get();

		result.forEach(projectResponse -> Assert.assertTrue(projectResponse.skills.contains("Java")));
	}
	
	
	/**
	 * A test to check the latest active projects.
	 * @author Vaibhav Verma
	 * @throws IOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void streamProjectsTest() throws IOException, ExecutionException, InterruptedException {
		List<ProjectResponse> result = FreeLancelotService.streamProjects("Java").get();
		assertEquals(true,result.get(0).skills.contains("Java"));
	}
	
	
	/**
	 * A test to check word stats of a string.
	 * @author Gurpreet Singh
	 * @throws IOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void wordStatsTest() throws IOException, ExecutionException, InterruptedException {
		 HashMap<String, Integer> result = FreeLancelotService.wordStats("preview").get();
		assertEquals(1,(int)result.get("preview"));
	}
	
	/**
	 * A test to check global word stats of a string.
	 * @author Gurpreet Singh
	 * @throws IOException when it occurs
	 * @throws ExecutionException when it occurs
	 * @throws InterruptedException when it occurs
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void globalWordStatsTest() throws IOException, ExecutionException, InterruptedException {
		List<ProjectResponse> l = new ArrayList<ProjectResponse>();
		ProjectResponse p = new ProjectResponse();
		p.setPrevDescriptor("preview descriptor");
		l.add(p);
		HashMap<String,List<ProjectResponse>> hm = new HashMap<String,List<ProjectResponse>>();
		hm.put("key", l);
		
		 HashMap<String, Integer> result = FreeLancelotService.globalWordStats(hm).get();
		 assertEquals(1,(int)result.get("preview"));
	}
}
