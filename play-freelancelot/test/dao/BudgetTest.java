package dao;

import static org.junit.Assert.*;

import org.junit.Test;




/**
 * This class is used to test Budget
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class BudgetTest {

	
	
	/**
	 * This method is used to test Budget
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Budget b = new Budget();
		b.setMaximum(1000);
		b.setMinimum(100);
		assertEquals(100, (int)b.getMinimum());
		assertEquals(1000,(int)b.getMaximum());
	}

}
