package dao;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * This class is used to test Location
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class LocationTest {

	/**
	 * This method is used to test Location
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Country c = new Country();
		Location l = new Location();
		l.setCountry(c);
		assertNotNull(l.getCountry());
	}

}
