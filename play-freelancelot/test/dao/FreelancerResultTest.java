package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class FreelancerResultTest {

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

}
