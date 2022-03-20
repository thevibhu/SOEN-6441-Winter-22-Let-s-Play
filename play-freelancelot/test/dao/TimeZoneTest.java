package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimeZoneTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		TimeZone tz= new TimeZone();
			
		tz.setId(1);
		tz.setCountry("SomeCountry");
		tz.setOffset(0);
		tz.setTimezone("someZone");
		
		assertEquals(1,tz.getId());
		assertEquals("SomeCountry",tz.getCountry());
		assertEquals(0,(int)tz.getOffset());
		assertEquals("someZone",tz.getTimezone());
		
		
	}

}
