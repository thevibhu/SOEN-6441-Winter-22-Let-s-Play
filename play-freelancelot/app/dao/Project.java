package dao;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Project{
	 public int id;
	 public int owner_id;
	 public String title;
	 public String status;
	 public String seo_url;
	 public Currency currency;
	 public HourlyProjectInfo hourly_project_info;
	 public int submitdate;
	 public ArrayList<Job> getJobs() {
		return jobs;
	}
	public void setJobs(ArrayList<Job> jobs) {
		this.jobs = jobs;
	}
	public String preview_description;
	 public boolean deleted;
	 public boolean nonpublic;
	 public boolean hidebids;
	 public ArrayList<Job> jobs;
	 @JsonProperty("type") 
	 public String project_type;
	 public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
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
	public int getTime_submitted() {
		return time_submitted;
	}
	public void setTime_submitted(int time_submitted) {
		this.time_submitted = time_submitted;
	}
	public int bidperiod;
	 public Budget budget;
	 public boolean featured;
	 public boolean urgent;
	 public BidStats bid_stats;
	 public int time_submitted;
	 public int time_updated;
	 public Upgrades upgrades;
	 public String language;
	 public boolean hireme;
	 public String frontend_project_status;
	 public Location location;
	 public TrueLocation true_location;
	 public boolean local;
	 public boolean negotiated;
	 public int time_free_bids_expire;
	 public ArrayList<String> pool_ids;
	 public ArrayList<Object> enterprise_ids;
	 public ArrayList<Object> enterprise_metadata_values;
	 public boolean is_escrow_project;
	 public boolean is_seller_kyc_required;
	 public boolean is_buyer_kyc_required;
	 public ProjectRejectReason project_reject_reason;
	}


