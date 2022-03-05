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
	 public String educational_level;		
	
	public ProjectResponse(int owner_id, int time_submitted, String title, String project_type,
			List<String> skills, String educational_level) {
		super();
		this.owner_id = owner_id;
		this.time_submitted = new SimpleDateFormat("MMMM d, yyyy")
				.format(new Date(time_submitted * 1000L));
		this.title = title;
		this.project_type = project_type;
		this.skills = skills;
		this.educational_level = educational_level;
	}
}
