package dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ResultProjectsTest {
@Test
public void test() {
	ResultProjects res = new ResultProjects();
	ArrayList<UserProjectDetails> projects= new ArrayList<UserProjectDetails>();
	UserProjectDetails p = new UserProjectDetails();
	p.setBidperiod(1);
	projects.add(p);
	res.setProjects(projects);
	assertEquals(1, res.getProjects().get(0).getBidperiod());
}
}