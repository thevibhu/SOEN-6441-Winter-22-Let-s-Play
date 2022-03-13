package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class HourlyProjectInfoTest {

	@Test
	public void test() {
		HourlyProjectInfo h = new HourlyProjectInfo();
		Commitment c = new Commitment();
		c.setHours(1);
		h.setCommitment(c);
		h.setDuration_enum("enum");
		assertEquals("enum", h.getDuration_enum());
		assertEquals(1, h.getCommitment().getHours());
	}

}
