package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StatusTest {
	@Test
	public void test() {
		Status sat = new Status();
		sat.setEmail_verified(false);
		assertEquals(false,sat.isEmail_verified());
	}

}
