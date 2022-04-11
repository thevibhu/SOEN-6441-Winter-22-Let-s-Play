package dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


/**
 * This class is used to test ResultProjects
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
public class ResultProjectsTest {
	
	

/**
 * This method is used to test ResultProjects
 * @author Gagandeep Kaur
 * @version 1.0
 * @since 1.0
 */
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