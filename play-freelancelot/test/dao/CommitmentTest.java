package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommitmentTest {

	@Test
	public void test() {
		Commitment c = new Commitment();
		c.setHours(7);
		c.setInterval("ronaldo");
		assertEquals(7, c.getHours());
		assertEquals("ronaldo",c.getInterval());
	}

}
