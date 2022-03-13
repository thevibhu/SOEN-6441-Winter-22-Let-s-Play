package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectRejectReasonTest {

	@Test
	public void test() {
		ProjectRejectReason p = new ProjectRejectReason();
		p.setDescription("des");
		p.setMessage("mes");
		assertEquals("mes", p.getMessage());
		assertEquals("des", p.getDescription());
	}

}
