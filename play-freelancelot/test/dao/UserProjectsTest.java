package dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserProjectsTest {
	@Test
	public void test() {
		UserProjects up = new UserProjects();
		up.setStatus("status");
		up.setRequest_id("someId");
		ResultProjects rest= new ResultProjects();
		up.setResult(rest);
		 assertEquals("status",up.getStatus());
		 assertEquals("someId",up.getRequest_id());
		 assertEquals(rest,up.getResult());
		 
	}
}
