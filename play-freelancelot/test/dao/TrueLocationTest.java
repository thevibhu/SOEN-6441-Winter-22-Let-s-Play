package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrueLocationTest {

	@Test
	public void test() {
		Country c = new Country();
		TrueLocation l = new TrueLocation();
		l.setCountry(c);
		assertNotNull(l.getCountry());
	}

}
