package dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class ProjectResponse {
	 public int owner_id;
	 public String time_submitted;
	 public String title;
	 public String project_type; 
	 public List<String> skills;
	 public String seo_url;
	 public int flesch_index;
	 public int fkgl;
	 public String edu_level;
	 public String prevDescriptor;
	 
	 
	 public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public ProjectResponse() {
		super();
	}

	public String getTime_submitted() {
		return time_submitted;
	}

	public void setTime_submitted(int time_submitted) {
		this.time_submitted = new SimpleDateFormat("MMMM d, yyyy")
				.format(new Date(time_submitted * 1000L));
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProject_type() {
		return project_type;
	}

	public void setProject_type(String project_type) {
		this.project_type = project_type;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getSeo_url() {
		return seo_url;
	}

	public void setSeo_url(String seo_url) {
		this.seo_url = seo_url;
	}

	public int getFlesch_index() {
		return flesch_index;
	}

	public void setFlesch_index(int flesch_index) {
		this.flesch_index = flesch_index;
	}

	public int getFkgl() {
		return fkgl;
	}

	public void setFkgl(int fkgl) {
		this.fkgl = fkgl;
	}

	public String getEdu_level() {
		return edu_level;
	}

	public void setEdu_level(String edu_level) {
		this.edu_level = edu_level;
	}

	public String getPrevDescriptor() {
		return prevDescriptor;
	}

	public void setPrevDescriptor(String prevDescriptor) {
		this.prevDescriptor = prevDescriptor;
	}
	 
	public ProjectResponse(int owner_id, int time_submitted, String title, String project_type,
			List<String> skills, String seo_url,double flesh_index,double fkgl, String edu_level, String prevDescriptor) {
		super();
		this.owner_id = owner_id;
		this.time_submitted = new SimpleDateFormat("MMMM d, yyyy")
				.format(new Date(time_submitted * 1000L));
		this.title = title;
		this.project_type = project_type;
		this.skills = skills;
		this.seo_url=seo_url;
		this.fkgl=(int)fkgl;
		this.flesch_index=(int)flesh_index;
		this.edu_level=edu_level;
		this.prevDescriptor = prevDescriptor;
	}
}
