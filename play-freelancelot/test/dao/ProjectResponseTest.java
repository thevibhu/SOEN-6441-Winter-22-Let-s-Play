package dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProjectResponseTest {

	@Test
	public void test() {
		ProjectResponse p = new ProjectResponse();
		p.setEdu_level("early");
		p.setFkgl(150);
		p.setFlesch_index(520);
		p.setOwner_id(1);
		p.setPrevDescriptor("pd");
		p.setProject_type("fixed");
		p.setSeo_url("seo");
		List<String> skills= new ArrayList<String>();
		skills.add("php");
		p.setSkills(skills);
		p.setTime_submitted(0);
		p.setTitle("title");
		
		assertEquals("early", p.getEdu_level());
		assertEquals(150, p.getFkgl());
		assertEquals(520, p.getFlesch_index());
		assertEquals(1, p.getOwner_id());
		assertEquals("pd", p.getPrevDescriptor());
		assertEquals("fixed", p.getProject_type());
		assertEquals("seo", p.getSeo_url());
		assertEquals(skills.get(0), p.getSkills().get(0));
		assertEquals("December 31, 1969", p.getTime_submitted());
		assertEquals("title", p.getTitle());
	}
	
	@Test
	public void testConstructor() {
		ProjectResponse p = new ProjectResponse(1, 0, "title", "fixed", null, "seo", "desc");
		assertEquals(1, p.getOwner_id());
		assertEquals("desc", p.getPrevDescriptor());
		assertEquals("fixed", p.getProject_type());
		assertEquals("seo", p.getSeo_url());
		assertEquals("December 31, 1969", p.getTime_submitted());
		assertEquals("title", p.getTitle());
	}

}
