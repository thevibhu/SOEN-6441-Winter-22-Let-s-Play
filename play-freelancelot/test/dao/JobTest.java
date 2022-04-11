package dao;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * This class is used to test Job
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class JobTest {

	

/**
 * This method is used to test Job
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0	
 */
	@Test
	public void test() {
		Job j = new Job();
		Category c = new Category();
		c.setId(1);
		j.setCategory(c);
		j.setId(1);
		j.setName("name");
		j.setLocal(true);
		j.setSeo_url("seo");
		assertEquals(1, j.getId());
		assertEquals(1, j.getCategory().getId());
		assertEquals("name", j.getName());
		assertEquals(true, j.isLocal());
		assertEquals("seo", j.getSeo_url());
	}

}
