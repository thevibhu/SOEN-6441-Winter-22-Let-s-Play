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
		proj.setTitle("title");
		proj.setOwner_id(1);
		proj.setType("SomeType");
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
		UserProjectDisplay p = new UserProjectDisplay("title",1, "SomeType", 1);
		assertEquals(1, p.getOwner_id());
		assertEquals("SomeType", p.getType());
		assertEquals("title", p.getTitle());
	}
}
