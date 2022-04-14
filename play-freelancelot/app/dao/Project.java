package dao;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents every detail of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Project{
	 public Project(int id, int owner_id, String title, String status) {
		super();
		this.id = id;
		this.owner_id = owner_id;
		this.title = title;
		this.status = status;
	}
	public Project() {
		super();
	}
	public String sub_status;
	public int id;
	 public int owner_id;
	 public String title;
	 public String status;
	 public String seo_url;
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
	 
	 public String getSeo_url() {
		return seo_url;
	}
	public void setSeo_url(String seo_url) {
		this.seo_url = seo_url;
	}
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
	 public String getPreview_description() {
		return preview_description;
	}
	public void setPreview_description(String preview_description) {
		this.preview_description = preview_description;
	}
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
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public HourlyProjectInfo getHourly_project_info() {
		return hourly_project_info;
	}
	public void setHourly_project_info(HourlyProjectInfo hourly_project_info) {
		this.hourly_project_info = hourly_project_info;
	}
	public int getSubmitdate() {
		return submitdate;
	}
	public void setSubmitdate(int submitdate) {
		this.submitdate = submitdate;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public boolean isNonpublic() {
		return nonpublic;
	}
	public void setNonpublic(boolean nonpublic) {
		this.nonpublic = nonpublic;
	}
	public boolean isHidebids() {
		return hidebids;
	}
	public void setHidebids(boolean hidebids) {
		this.hidebids = hidebids;
	}
	public int getBidperiod() {
		return bidperiod;
	}
	public void setBidperiod(int bidperiod) {
		this.bidperiod = bidperiod;
	}
	public Budget getBudget() {
		return budget;
	}
	public void setBudget(Budget budget) {
		this.budget = budget;
	}
	public boolean isFeatured() {
		return featured;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	public boolean isUrgent() {
		return urgent;
	}
	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}
	public BidStats getBid_stats() {
		return bid_stats;
	}
	public void setBid_stats(BidStats bid_stats) {
		this.bid_stats = bid_stats;
	}
	public int getTime_updated() {
		return time_updated;
	}
	public void setTime_updated(int time_updated) {
		this.time_updated = time_updated;
	}
	public Upgrades getUpgrades() {
		return upgrades;
	}
	public void setUpgrades(Upgrades upgrades) {
		this.upgrades = upgrades;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isHireme() {
		return hireme;
	}
	public void setHireme(boolean hireme) {
		this.hireme = hireme;
	}
	public String getFrontend_project_status() {
		return frontend_project_status;
	}
	public void setFrontend_project_status(String frontend_project_status) {
		this.frontend_project_status = frontend_project_status;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void setTrue_location(TrueLocation true_location) {
		this.true_location = true_location;
	}
	public boolean isLocal() {
		return local;
	}
	public void setLocal(boolean local) {
		this.local = local;
	}
	public boolean isNegotiated() {
		return negotiated;
	}
	public void setNegotiated(boolean negotiated) {
		this.negotiated = negotiated;
	}
	public int getTime_free_bids_expire() {
		return time_free_bids_expire;
	}
	public void setTime_free_bids_expire(int time_free_bids_expire) {
		this.time_free_bids_expire = time_free_bids_expire;
	}
	public ArrayList<String> getPool_ids() {
		return pool_ids;
	}
	public void setPool_ids(ArrayList<String> pool_ids) {
		this.pool_ids = pool_ids;
	}
	
	public void setEnterprise_ids(ArrayList<Object> enterprise_ids) {
		this.enterprise_ids = enterprise_ids;
	}

	public void setEnterprise_metadata_values(ArrayList<Object> enterprise_metadata_values) {
		this.enterprise_metadata_values = enterprise_metadata_values;
	}
	public boolean isIs_escrow_project() {
		return is_escrow_project;
	}
	public void setIs_escrow_project(boolean is_escrow_project) {
		this.is_escrow_project = is_escrow_project;
	}
	public boolean isIs_seller_kyc_required() {
		return is_seller_kyc_required;
	}
	public void setIs_seller_kyc_required(boolean is_seller_kyc_required) {
		this.is_seller_kyc_required = is_seller_kyc_required;
	}
	public boolean isIs_buyer_kyc_required() {
		return is_buyer_kyc_required;
	}
	public void setIs_buyer_kyc_required(boolean is_buyer_kyc_required) {
		this.is_buyer_kyc_required = is_buyer_kyc_required;
	}
	public ProjectRejectReason getProject_reject_reason() {
		return project_reject_reason;
	}
	public void setProject_reject_reason(ProjectRejectReason project_reject_reason) {
		this.project_reject_reason = project_reject_reason;
	}
	}


