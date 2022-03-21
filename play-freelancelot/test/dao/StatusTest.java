package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This class is used to test Status
 * @author Vaibhav, Gagandeep, Felipe, Gurpreet
 * @version 1.0
 * @since 1.0
 */
public class StatusTest {
	
	/**
	 * This method is used to test Status
	 * @author Vaibhav, Gagandeep, Felipe, Gurpreet
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Status sat = new Status();
		sat.setEmail_verified(false);
		assertEquals(false,sat.isEmail_verified());
	}

}
