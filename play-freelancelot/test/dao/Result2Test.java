package dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Result2Test {
	
	@Test
	public void test(){
		
		Result2 res = new Result2();
		UserProfile pro = new UserProfile();
		res.setUsers(pro);
		assertEquals(pro,res.getUsers());
	}
}
