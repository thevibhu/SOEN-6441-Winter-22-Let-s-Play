package dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

/**
 * This class is used to test Result2
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
public class Result2Test {
	
	
	/**
	 * This method is used to test Result2
	 * @author Gagandeep Kaur
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test(){
		
		Result2 res = new Result2();
		UserProfile pro = new UserProfile();
		res.setUsers(pro);
		assertEquals(pro,res.getUsers());
	}
}
