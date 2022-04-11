package dao;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This class is used to test TrueLocation
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
public class TrueLocationTest {

	
	/**
	 * This method is used to test TrueLocation
	 * @author Gagandeep Kaur
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Country c = new Country();
		TrueLocation l = new TrueLocation();
		l.setCountry(c);
		assertNotNull(l.getCountry());
	}

}
