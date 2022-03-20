package dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {
	
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
