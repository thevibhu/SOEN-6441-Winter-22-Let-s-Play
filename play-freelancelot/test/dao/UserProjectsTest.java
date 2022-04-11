package dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * This class is used to test UserProjects
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
public class UserProjectsTest {
	
	
	/**
	 * This method is used to test UserProjects
	 * @author Gagandeep Kaur
	 * @version 1.0
	 * @since 1.0
	 */
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
