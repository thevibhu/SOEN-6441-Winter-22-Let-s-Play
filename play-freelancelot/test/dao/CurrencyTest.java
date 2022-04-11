package dao;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * This class is used to test urrency
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class CurrencyTest {

	

/**
 * This method is used to test urrency
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
	@Test
	public void test() {		
		Currency c = new Currency();
		c.setCode("code");
		c.setCountry("country");
		c.setExchange_rate(50);
		c.setId(1);
		c.setIs_escrowcom_supported(false);
		c.setIs_external(true);
		c.setName("name");
		c.setSign("sign");
		
		assertEquals("code", c.getCode());
		assertEquals("country", c.getCountry());
		assertEquals(50, (int)c.getExchange_rate());
		assertEquals(1,c.getId());
		assertEquals(false, c.isIs_escrowcom_supported());
		assertEquals(true, c.isIs_external());
		assertEquals("name", c.getName());
		assertEquals("sign", c.getSign());
	}

}
