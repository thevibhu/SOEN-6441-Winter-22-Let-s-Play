package dao;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This class is used to test ProjectRejectReason
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class ProjectRejectReasonTest {

	
	/**
	 * This method is used to test ProjectRejectReason
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		ProjectRejectReason p = new ProjectRejectReason();
		p.setDescription("des");
		p.setMessage("mes");
		assertEquals("mes", p.getMessage());
		assertEquals("des", p.getDescription());
	}

}
