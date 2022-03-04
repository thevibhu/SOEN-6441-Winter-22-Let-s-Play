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
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public String getTime_submitted() {
		return time_submitted;
	}
	public void setTime_submitted(String time_submitted) {
		this.time_submitted = time_submitted;
	}
	public ProjectResponse(int owner_id, int time_submitted, String title, String project_type,
			List<String> skills) {
		super();
		this.owner_id = owner_id;
		this.time_submitted = new SimpleDateFormat("MMMM d, yyyy")
				.format(new Date(time_submitted * 1000L));
		this.title = title;
		this.project_type = project_type;
		this.skills = skills;
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
}

/* 

*/