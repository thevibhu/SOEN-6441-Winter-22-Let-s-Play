package dao;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * This class is used to test Category
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class CategoryTest {

	
	
	/**
	 * This method is used to test Category
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Category c = new Category();
		c.setId(7);
		c.setName("ronaldo");
		assertEquals(7, c.getId());
		assertEquals("ronaldo",c.getName());
	}

}
