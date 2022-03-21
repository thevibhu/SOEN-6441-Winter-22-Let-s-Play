package dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This class is used to test user
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
public class UserTest {
	
	
	/**
	 * This method is used to test user
	 * @author Gagandeep Kaur
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		User u= new User();
		UserProfile us= new UserProfile();
		u.setStatus("status");
		u.setRequest_id("someId");
		u.setResult(us);
		assertEquals("status",u.getStatus());
		assertEquals("someId",u.getRequest_id());
		assertEquals(us,u.getResult());
	}
}
