package dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * This class is used to test UserProjectDisplay
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
public class UserProjectDisplayTest {
	
	

/**
 * This method is used to test UserProjectDisplay
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
	@Test
	public void test() {
		UserProjectDisplay proj = new UserProjectDisplay();
		proj.setTime_submitted(0);
		proj.setTitle("title");
		proj.setOwner_id(1);
		proj.setType("SomeType");
		assertEquals("December 31, 1969", proj.getTime_submitted());
		assertEquals(1, proj.getOwner_id());
		assertEquals("SomeType", proj.getType());
		assertEquals("title", proj.getTitle());
	}
	
	/**
	 * This method is used to test UserProjectDisplay constructor
	 * @author Gagandeep Kaur
	 */
	@Test
	public void testConstructor() {
		UserProjectDisplay p = new UserProjectDisplay("title", 0, "SomeType", 1);
		assertEquals("December 31, 1969", p.getTime_submitted());
		assertEquals(1, p.getOwner_id());
		assertEquals("SomeType", p.getType());
		assertEquals("title", p.getTitle());
	}
}
