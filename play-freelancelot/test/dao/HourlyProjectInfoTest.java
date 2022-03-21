package dao;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This class is used to test HourlyProjectInfo
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class HourlyProjectInfoTest {

	
	/**
	 * This method is used to test HourlyProjectInfo
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
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
