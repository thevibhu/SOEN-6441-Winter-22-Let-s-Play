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
