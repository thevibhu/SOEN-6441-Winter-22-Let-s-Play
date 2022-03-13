package dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.junit.Test;

public class ResultTest {

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

}
