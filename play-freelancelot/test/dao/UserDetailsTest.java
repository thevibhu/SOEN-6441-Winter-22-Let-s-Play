package dao;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * This class is used to test UserDetails
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
public class UserDetailsTest {
	
	/**
	 * This method is used to test UserDetails
	 * @author Gagandeep Kaur
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test(){
		UserDetails userdet = new UserDetails();
			userdet.setUsername("abby");
			userdet.setPublic_name("abby");
			userdet.setId(1);
			userdet.setAvatar_large("something");
			userdet.setDisplay_name("something");
			userdet.setRole("somethingelse");
			userdet.setChosen_role("somethingelseelse");
		
	}
	
	
	/**
	 * This method is used to test UserDetails constructor
	 * @author Gagandeep Kaur 
	 */
	@Test
	public void testContructor() {
	
	UserDetails userdet = new UserDetails("abby", "abby", 1, "something", "something", "somethingelse", "seo");
	assertEquals("abby", userdet.getUsername());
	assertEquals("abby", userdet.getPublic_name());
	assertEquals(1, userdet.getId());
	assertEquals("something", userdet.getAvatar_large());
	assertEquals("something", userdet.getDisplay_name());
	assertEquals("somethingelse",userdet.getRole());
	assertEquals("seo", userdet.getChosen_role());
	
	}
}




