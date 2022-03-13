package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class BidStatsTest {

	@Test
	public void test() {
		BidStats b = new BidStats();
		b.setBid_avg(50);
		b.setBid_count(100);
		assertEquals(50, b.getBid_avg());
		assertEquals(100, b.getBid_count());
	}

}
