package dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.junit.Test;


/**
 * This class is used to test Result
 * @author Vaibhav Verma
 * @version 1.0
 * @since 1.0
 */
public class ResultTest {
	
	/**
	 * This method is used to test Result
	 * @author Vaibhav Verma
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void test() {
		Result r = new Result();
		r.setTotal_count(21);
		ArrayList<Project> projects= new ArrayList<Project>();
		Project p = new Project();
		p.setBidperiod(1);
		projects.add(p);
		r.setProjects(projects);
		assertEquals(21, r.getTotal_count());
		assertEquals(1, r.getProjects().get(0).getBidperiod());
	}
	
	
	/**
	 * This method is used to test Result
	 * @author Vaibhav Verma
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void testConstructor() {
		ArrayList<Project> projects= new ArrayList<Project>();
		Project p = new Project();
		p.setBidperiod(1);
		projects.add(p);
		Result r = new Result(projects, 21);
		assertEquals(21, r.getTotal_count());
		assertEquals(1, r.getProjects().get(0).getBidperiod());
	}

}
