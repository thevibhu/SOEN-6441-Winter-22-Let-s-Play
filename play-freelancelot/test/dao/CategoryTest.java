package dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class CategoryTest {

	@Test
	public void test() {
		Category c = new Category();
		c.setId(7);
		c.setName("ronaldo");
		assertEquals(7, c.getId());
		assertEquals("ronaldo",c.getName());
	}

}
