package dao;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * This class is used to test FreelancerResult
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class FreelancerResultTest {

	
	/**
	 * This class is used to test FreelancerResult getters and setters
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		FreelancerResult f = new FreelancerResult();
		f.setRequest_id("req");
		Result r = new Result();
		r.setTotal_count(1);
		f.setResult(r);
		f.setStatus("status");
		assertEquals("req", f.getRequest_id());
		assertEquals(1, f.getResult().getTotal_count());
		assertEquals("status", f.getStatus());
	}
	
	/**
	 * This class is used to test FreelancerResult constructor
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 */
	@Test
	public void testConstructor() {
		Result r = new Result();
		r.setTotal_count(1);
		FreelancerResult f = new FreelancerResult("status", r, "req");
		assertEquals("req", f.getRequest_id());
		assertEquals(1, f.getResult().getTotal_count());
		assertEquals("status", f.getStatus());
	}

}
