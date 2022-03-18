package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void test() {
		Country c = new Country();
		Location l = new Location();
		l.setCountry(c);
		assertNotNull(l.getCountry());
	}

}
