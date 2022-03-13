package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class BudgetTest {

	@Test
	public void test() {
		Budget b = new Budget();
		b.setMaximum(1000);
		b.setMinimum(100);
		assertEquals(100, (int)b.getMinimum());
		assertEquals(1000,(int)b.getMaximum());
	}

}
