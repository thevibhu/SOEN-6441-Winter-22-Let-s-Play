package dao;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

public class Project{
	 @Override
	public String toString() {
		return "Project [id=" + id + ", owner_id=" + owner_id + ", title=" + title + ", status=" + status + ", seo_url="
				+ seo_url + ", currency=" + currency + ", hourly_project_info=" + hourly_project_info + ", submitdate="
				+ submitdate + ", preview_description=" + preview_description + ", deleted=" + deleted + ", nonpublic="
				+ nonpublic + ", hidebids=" + hidebids + ", type=" + type + ", bidperiod=" + bidperiod + ", budget="
				+ budget + ", featured=" + featured + ", urgent=" + urgent + ", bid_stats=" + bid_stats
				+ ", time_submitted=" + time_submitted + ", time_updated=" + time_updated + ", upgrades=" + upgrades
				+ ", language=" + language + ", hireme=" + hireme + ", frontend_project_status="
				+ frontend_project_status + ", location=" + location + ", true_location=" + true_location + ", local="
				+ local + ", negotiated=" + negotiated + ", time_free_bids_expire=" + time_free_bids_expire
				+ ", pool_ids=" + pool_ids + ", enterprise_ids=" + enterprise_ids + ", is_escrow_project="
				+ is_escrow_project + ", is_seller_kyc_required=" + is_seller_kyc_required + ", is_buyer_kyc_required="
				+ is_buyer_kyc_required + ", project_reject_reason=" + project_reject_reason + "]";
	}
	public int id;
	 public int owner_id;
	 public String title;
	 public String status;
	 public String seo_url;
	 public Currency currency;
	 public HourlyProjectInfo hourly_project_info;
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
	 public boolean is_escrow_project;
	 public boolean is_seller_kyc_required;
	 public boolean is_buyer_kyc_required;
	 public ProjectRejectReason project_reject_reason;
	}


