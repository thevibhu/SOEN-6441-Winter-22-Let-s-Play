package dao;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This class is used to test BidStats
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class BidStatsTest {

	
	/**
	 * This method is used to test BidStats
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		BidStats b = new BidStats();
		b.setBid_avg(50);
		b.setBid_count(100);
		assertEquals(50, b.getBid_avg());
		assertEquals(100, b.getBid_count());
	}

}
