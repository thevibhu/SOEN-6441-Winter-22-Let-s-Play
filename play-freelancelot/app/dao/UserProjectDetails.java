package dao;

import java.util.ArrayList;

public class UserProjectDetails {
	 public TrueLocation true_location;
	public int id;
    public int owner_id;
    public String title;
    public String status;
    public String seo_url;
    public Currency currency;
    public int submitdate;
    public String preview_description;
    public boolean deleted;
    public boolean nonpublic;
    public boolean hidebids;
    public String type;
    public int bidperiod;
    public Budget budget;
    public boolean featured;
    public boolean urgent;
    public BidStats bid_stats;
    public int time_submitted;
    public Upgrades upgrades;
    public String language;
    public boolean hireme;
    public String frontend_project_status;
    public Location location;
    public boolean local;
    public boolean negotiated;
    public int time_free_bids_expire;
    public ArrayList<String> pool_ids;
    public ArrayList<Object> enterprise_ids;
    public boolean is_escrow_project;
    public boolean is_seller_kyc_required;
    public boolean is_buyer_kyc_required;
    public ProjectRejectReason project_reject_reason;
    public String sub_status;
    public Object hourly_project_info;

	
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
    
}
