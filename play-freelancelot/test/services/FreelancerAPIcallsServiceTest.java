package services;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.junit.Test;

import dao.FreelancerResult;
import dao.Project;
import dao.Result;

public class FreelancerAPIcallsServiceTest {
	
//	@Mock
//	private FreelancerAPIcallsService s;
//	
	@Test 
	public void testGetActiveProjects() throws IOException , InterruptedException, ExecutionException {
//       // CompletableFuture<List<Project>> future = new CompletableFuture<>();
//		//FreelancerAPIcallsService s =  mockStatic(FreelancerAPIcallsService.class);
//		Project p = new Project(0, 0, "title", "active");
//		ArrayList<Project> projects = new ArrayList<Project>();
//		projects.add(p);
//		when(s.getActiveProjects("key")).thenReturn(CompletableFuture.completedFuture(projects));
//
//		Project p = new Project(0, 0, "title", "active");
//		ArrayList<Project> projects = new ArrayList<Project>();
//		projects.add(p);
//		try (MockedStatic<FreelancerAPIcallsService> theMock = Mockito.mockStatic(FreelancerAPIcallsService.class)) {
//            theMock.when(() -> FreelancerAPIcallsService.getActiveProjects("key"))
//                   .thenReturn(CompletableFuture.completedFuture(projects));
//
//            assertEquals("title", FreelancerAPIcallsService.getActiveProjects("key").get().get(0).getTitle());
//        }
//	    assertEquals(s.getActiveProjects("key").get().get(0).getTitle(),"title");
	    
	   // verify(s).getActiveProjects("key").get().get(0).getTitle();
		
//		MockedStatic<StaticUtils> ser = Mockito.mockStatic(FreelancerAPIcallsService.class);
//		Project p = new Project(0, 0, "title", "active");
//		ArrayList<Project> projects = new ArrayList<Project>();
//		projects.add(p);
//		ser.when(() -> FreelancerAPIcallsService.get)
//        .thenReturn(Arrays.asList(10, 11, 12));
	}

}
