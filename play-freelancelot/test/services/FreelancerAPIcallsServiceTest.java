package services;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.junit.Test;

import dao.Project;

public class FreelancerAPIcallsServiceTest {

	@Test
	public void testGetActiveProjects() throws IOException {
		//FreelancerAPIcallsService call = mock(FreelancerAPIcallsService.class);
		
		//when(call.getActiveProjects("")).thenReturn(object);  
		
		CompletableFuture<List<Project>> future = FreelancerAPIcallsService.getActiveProjects("");
		
	}

}
