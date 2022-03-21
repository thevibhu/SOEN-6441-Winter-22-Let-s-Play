package dao;

import java.util.ArrayList;

/** Represents Shows reults of the classes and fields returned from API user to get User Projects
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class UserProjectDetails {
	/**
	 * @param true_location Location of the User Project
	 */
	public TrueLocation true_location;
	
	/**
	 * @param id Id of the User Project
	 */
	public int id;
	
	/**
	 * @param owner_id Owner ID of the User Project
	 */
    public int owner_id;
    
    /**
	 * @param title Title of the User Project
	 */
    public String title;
    
    /**
	 * @param status Status of the User Project
	 */
    public String status;
    
    /**
	 * @param seo_url SEO URL of the User Project
	 */
    public String seo_url;
    
    /**
	 * @param currency Currency for the User Project
	 */
    public Currency currency;
    
    /**
	 * @param submitdate Submitted Date of the User Project
	 */
    public int submitdate;
    
    /**
	 * @param preview_description Preview Description of the User Project
	 */
    public String preview_description;
    
    /**
	 * @param deleted Deleted User Project
	 */
    public boolean deleted;
    
    /**
	 * @param nonpublic Not public Project
	 */
    public boolean nonpublic;
    
    /**
	 * @param hidebids Hides Bid of the Project
	 */
    public boolean hidebids;
    
    /**
     * @param type Type of the Project
     */
    public String type;
    
    /**
     * @param bidperiod Bid Period of the Project
     */
    public int bidperiod;
    
    /**
     * @param budget Budget of the Project
     */
    public Budget budget;
    
    /**
     * @param fetatured Features of the Project
     */
    public boolean featured;
    
    /**
     * @param urgent Type of Delivery 
     */
    public boolean urgent;
    
    /**
     * @param bid_stats Bid Stats of the Project
     */
    public BidStats bid_stats;
    
    /**
     * @param time_submitted Time of Submission for the Project
     */
    public int time_submitted;
    
    /**
     * @param upgrades Upgrade required for the Project
     */
    public Upgrades upgrades;
    
    /**
     * @param language Language for the Project
     */
    public String language;
    
    /**
     * @param hireme User to be hired for the Project
     */
    public boolean hireme;
    
    /**
     * @param frontend_project_status UI status of the Project
     */
    public String frontend_project_status;
    
    /**
     * @param location Location of the User Project
     */
    public Location location;
    
    /**
     * @param local Local Project for the User
     */
    public boolean local;
    
    /**
     * @param negotiated User negotiated for the Project 
     */
    public boolean negotiated;
    
    /**
     * @param time_free_bids_expire Free Time expiry for the Project 
     */
    public int time_free_bids_expire;
    
    /**
     * @param pool_ids Array of Pool Ids for the Project 
     */
    public ArrayList<String> pool_ids;
    
    /**
     * @param enterprise_ids Array of Enterprise Ids for the Project 
     */
    public ArrayList<Object> enterprise_ids;
    
    /**
     * @param is_escrow_project Escrow Project or not 
     */
    public boolean is_escrow_project;
    
    /**
     * @param is_seller_kyc_required Seller's KYC required for the Project or not 
     */
    public boolean is_seller_kyc_required;
    
    /**
     * @param is_buyer_kyc_required Buyer's KYC required for the Project or not 
     */
    public boolean is_buyer_kyc_required;
    
    /**
     * @param project_reject_reason Reason for Reject
     */
    public ProjectRejectReason project_reject_reason;
    
    /**
     * @param sub_status Submission Status
     */
    public String sub_status;
    
    /**
     * @param hourly_project_info Hourly Information for the Project
     */
    public Object hourly_project_info;

	/** gets Location of the project.
   	 * @version 1.0
   	 * @return Location of the project.
   	 * @since 1.0
   	*/
    public TrueLocation getTrue_location() {
		return true_location;
	}

	/** sets the Location of the project.
   	 * @version 1.0
   	 * @param true_location Location of the project.
   	 * @since 1.0
   	*/
	public void setTrue_location(TrueLocation true_location) {
		this.true_location = true_location;
	}
	
	/** gets Id of the project.
   	 * @version 1.0
   	 * @return Id of the project.
   	 * @since 1.0
   	*/
	public int getId() {
		return id;
	}
	
	/** sets the ID of the project.
   	 * @version 1.0
   	 * @param id Location of the project.
   	 * @since 1.0
   	*/
	public void setId(int id) {
		this.id = id;
	}
	
	/** gets status of the project.
   	 * @version 1.0
   	 * @return status of the project.
   	 * @since 1.0
   	*/
	public String getStatus() {
		return status;
	}
	
	/** sets status of the project.
   	 * @version 1.0
   	 * @param status status of the project.
   	 * @since 1.0
   	*/
	public void setStatus(String status) {
		this.status = status;
	}
	
	/** gets URL of the project.
   	 * @version 1.0
   	 * @return URL of the project.
   	 * @since 1.0
   	*/
	public String getSeo_url() {
		return seo_url;
	}
	
	/** sets URL of the project.
   	 * @version 1.0
   	 * @param seo_url URL of the project.
   	 * @since 1.0
   	*/
	public void setSeo_url(String seo_url) {
		this.seo_url = seo_url;
	}
	
	/** gets Currency of the project.
   	 * @version 1.0
   	 * @return Currency of the project.
   	 * @since 1.0
   	*/
	public Currency getCurrency() {
		return currency;
	}
	
	/** sets Currency of the project.
   	 * @version 1.0
   	 * @param currency Currency of the project.
   	 * @since 1.0
   	*/
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	/** gets Submitted Date of the project.
   	 * @version 1.0
   	 * @return Submission Date of the project.
   	 * @since 1.0
   	*/
	public int getSubmitdate() {
		return submitdate;
	}
	
	/** sets Submitted Date of the project.
   	 * @version 1.0
   	 * @param submitdate Submission Date of the project.
   	 * @since 1.0
   	*/
	public void setSubmitdate(int submitdate) {
		this.submitdate = submitdate;
	}
	
	/** gets Preview Description of the project.
   	 * @version 1.0
   	 * @return Preview Description of the project.
   	 * @since 1.0
   	*/
	public String getPreview_description() {
		return preview_description;
	}
	
	/** sets Preview Description of the project.
   	 * @version 1.0
   	 * @param preview_description Preview Description of the project.
   	 * @since 1.0
   	*/
	public void setPreview_description(String preview_description) {
		this.preview_description = preview_description;
	}
	
	/** gets whether Project Delected or not.
   	 * @version 1.0
   	 * @return Whether project deleted or not.
   	 * @since 1.0
   	*/
	public boolean isDeleted() {
		return deleted;
	}
	
	/** sets whether Project Delected or not.
   	 * @version 1.0
   	 * @param deleted Whether project deleted or not.
   	 * @since 1.0
   	*/
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	/** gets whether Project is Public or not.
   	 * @version 1.0
   	 * @return Whether project is Public or not.
   	 * @since 1.0
   	*/
	public boolean isNonpublic() {
		return nonpublic;
	}
	
	/** sets whether Project is Public or not.
   	 * @version 1.0
   	 * @param nonpublic Whether project is Public or not.
   	 * @since 1.0
   	*/
	public void setNonpublic(boolean nonpublic) {
		this.nonpublic = nonpublic;
	}
	
	/** gets whether Project Hides Bid or not.
   	 * @version 1.0
   	 * @return Whether project Hides Bid or not.
   	 * @since 1.0
   	*/
	public boolean isHidebids() {
		return hidebids;
	}
	
	/** sets whether Project Hides Bid or not.
   	 * @version 1.0
   	 * @param hidebids Whether project Hides Bid or not.
   	 * @since 1.0
   	*/
	public void setHidebids(boolean hidebids) {
		this.hidebids = hidebids;
	}
	
	/** gets Bid Period of the Project.
   	 * @version 1.0
   	 * @return Bid Period of the project.
   	 * @since 1.0
   	*/
	public int getBidperiod() {
		return bidperiod;
	}
	
	/** sets Bid Period of the Project.
   	 * @version 1.0
   	 * @param bidperiod Bid Period of the project.
   	 * @since 1.0
   	*/
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
	public int getTime_submitted() {
		return time_submitted;
	}
	public void setTime_submitted(int time_submitted) {
		this.time_submitted = time_submitted;
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
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
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
	public ArrayList<Object> getEnterprise_ids() {
		return enterprise_ids;
	}
	public void setEnterprise_ids(ArrayList<Object> enterprise_ids) {
		this.enterprise_ids = enterprise_ids;
	}
	
	/** gets Whether it is Escrow Project or not.
   	 * @version 1.0
   	 * @return Is Escrow Project or not.
   	 * @since 1.0
   	*/
	public boolean isIs_escrow_project() {
		return is_escrow_project;
	}
	
	/** sets Whether it is Escrow Project or not.
   	 * @version 1.0
   	 * @return is_escrow_project Is Escrow Project or not.
   	 * @since 1.0
   	*/
	public void setIs_escrow_project(boolean is_escrow_project) {
		this.is_escrow_project = is_escrow_project;
	}
	
	/** gets Whether Seller's KYC is required for the Project.
   	 * @version 1.0
   	 * @return Whether Seller's KYC is required for the Project.
   	 * @since 1.0
   	*/
	public boolean isIs_seller_kyc_required() {
		return is_seller_kyc_required;
	}
	
	/** sets Whether Seller's KYC is required for the Project.
   	 * @version 1.0
   	 * @param is_seller_kyc_required Whether Seller's KYC is required for the Project.
   	 * @since 1.0
   	*/
	public void setIs_seller_kyc_required(boolean is_seller_kyc_required) {
		this.is_seller_kyc_required = is_seller_kyc_required;
	}
	
	/** gets Whether Buyer's KYC is required for the Project.
   	 * @version 1.0
   	 * @return Whether Buyer's KYC is required for the Project.
   	 * @since 1.0
   	*/
	public boolean isIs_buyer_kyc_required() {
		return is_buyer_kyc_required;
	}
	
	/** sets Whether Buyer's KYC is required for the Project.
   	 * @version 1.0
   	 * @param is_buyer_kyc_required Whether Buyer's KYC is required for the Project.
   	 * @since 1.0
   	*/
	public void setIs_buyer_kyc_required(boolean is_buyer_kyc_required) {
		this.is_buyer_kyc_required = is_buyer_kyc_required;
	}
	
	/** gets Reject Reason of the Project.
   	 * @version 1.0
   	 * @return Rejection Reason of the project.
   	 * @since 1.0
   	*/
	public ProjectRejectReason getProject_reject_reason() {
		return project_reject_reason;
	}
	
	/** sets Reject Reason of the Project.
   	 * @version 1.0
   	 * @param project_reject_reason Rejection Reason of the project.
   	 * @since 1.0
   	*/
	public void setProject_reject_reason(ProjectRejectReason project_reject_reason) {
		this.project_reject_reason = project_reject_reason;
	}
	
	/** gets Status of the Project.
   	 * @version 1.0
   	 * @return Status of the project.
   	 * @since 1.0
   	*/
	public String getSub_status() {
		return sub_status;
	}
	
	/** sets Status of the Project.
   	 * @version 1.0
   	 * @param sub_status Status of the project.
   	 * @since 1.0
   	*/
	public void setSub_status(String sub_status) {
		this.sub_status = sub_status;
	}
	
	/** gets Hourly Project Information.
   	 * @version 1.0
   	 * @return Hourly Project Information of the project.
   	 * @since 1.0
   	*/
	public Object getHourly_project_info() {
		return hourly_project_info;
	}
	
	/** sets Hourly Project Information.
   	 * @version 1.0
   	 * @param hourly_project_info Hourly Project Information of the project.
   	 * @since 1.0
   	*/
	public void setHourly_project_info(Object hourly_project_info) {
		this.hourly_project_info = hourly_project_info;
	}
	
	/** gets Title of the project.
   	 * @version 1.0
   	 * @return Title of the project.
   	 * @since 1.0
   	*/
	public String getTitle() {
		return title;
	}
	
	/** sets Title of the project.
   	 * @version 1.0
   	 * @param title Title of the project.
   	 * @since 1.0
   	*/
	public void setTitle(String title) {
		this.title = title;
	}
	
	/** gets Type of the Project.
   	 * @version 1.0
   	 * @return Type of the project.
   	 * @since 1.0
   	*/
	public String getType() {
		return type;
	}
	
	/** sets Type of the Project.
   	 * @version 1.0
   	 * @param type Type of the project.
   	 * @since 1.0
   	*/
	public void setType(String type) {
		this.type = type;
	}
	
	/** gets Owner ID of the Project.
   	 * @version 1.0
   	 * @return Owner Id of the project.
   	 * @since 1.0
   	*/
	public int getOwner_id() {
		return owner_id;
	}
	
	/** sets Owner ID of the Project.
   	 * @version 1.0
   	 * @param owner_id Owner Id of the project.
   	 * @since 1.0
   	*/
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
    
}
