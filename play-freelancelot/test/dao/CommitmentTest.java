package dao;

import static org.junit.Assert.*;

import org.junit.Test;




/**
 * This class is used to test Commitmen
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class CommitmentTest {

	
	
	/**
	 * This method is used to test Commitmen
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Commitment c = new Commitment();
		c.setHours(7);
		c.setInterval("ronaldo");
		assertEquals(7, c.getHours());
		assertEquals("ronaldo",c.getInterval());
	}

}
