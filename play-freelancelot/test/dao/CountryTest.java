package dao;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * This class is used to test Country
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class CountryTest {

	
	/**
	 * This method is used to test Country
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Country c = new Country( );
		c.setName("name");
		assertEquals("name", c.name);
	}

}
