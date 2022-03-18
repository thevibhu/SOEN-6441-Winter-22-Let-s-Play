package dao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;


public class UserProfile{
	  public int id;
	    public String username;
	    public Object suspended;
	    public boolean closed;
	    public Object is_active;
	    public Object force_verify;
	    public String avatar;
	    public Object email;
	    public Object reputation;
	    public Object jobs;
	    public Object profile_description;
	    public Object hourly_rate;
	    public int registration_date;
	    public boolean limited_account;
	    public String display_name;
	    public Object tagline;
	    public Location location;
	    public String avatar_large;
	    public String role;
	    public String chosen_role;
	    public Object employer_reputation;
	    public Status status;
	    public String avatar_cdn;
	    public String avatar_large_cdn;
	    public Currency primary_currency;
	    public Object account_balances;
	    public Object membership_package;
	    public Object qualifications;
	    public Object badges;
	    public String primary_language;
	    public Object search_languages;
	    public Object cover_image;
	    public Object true_location;
	    public Object portfolio_count;
	    public Object preferred_freelancer;
	    public Object support_status;
	    public Object first_name;
	    public Object last_name;
	    public Object mobile_tracking;
	    public Object corporate;
	    public String public_name;
	    public Object corporate_users;
	    public Object is_local;
	    public Object address;
	    public Object company;
	    public Object recommendations;
	    public ArrayList<Object> pool_ids;
	    public ArrayList<Object> enterprise_ids;
	    public Object date_of_birth;
	    public Object escrowcom_account_linked;
	    public boolean escrowcom_interaction_required;
	    public Object marketing_mobile_number;
	    public Object user_sanctions;
	    public Object freelancer_verified_status;
	    public Object secure_phone;
	    public Object directory_follow_preferences;
	    public Object is_payment_confirmation_required;
	    public Object is_nominated_payment_controlled;
	    public Object is_nominated_payment_share_setup_complete;
	    public Object spam_profile;
	    public Object endorsements;
	    public TimeZone timezone;
	    public Object responsiveness;
	    public Object bid_quality_details;
	    public Object test_user;
	    public Object online_offline_status;
	    public Object deposit_methods;
	    public boolean oauth_password_credentials_allowed;
	    public boolean registration_completed;
	    public boolean is_profile_visible;
	    public Object enterprise_metadata_values;
	    public Object mfa;
	    public Object grants;
	    public Object operating_areas;
	    public Object equipment_groups;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public Object getSuspended() {
			return suspended;
		}
		public void setSuspended(Object suspended) {
			this.suspended = suspended;
		}
		public boolean isClosed() {
			return closed;
		}
		public void setClosed(boolean closed) {
			this.closed = closed;
		}
		public Object getIs_active() {
			return is_active;
		}
		public void setIs_active(Object is_active) {
			this.is_active = is_active;
		}
		public Object getForce_verify() {
			return force_verify;
		}
		public void setForce_verify(Object force_verify) {
			this.force_verify = force_verify;
		}
		public String getAvatar() {
			return avatar;
		}
		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
		public Object getEmail() {
			return email;
		}
		public void setEmail(Object email) {
			this.email = email;
		}
		public Object getReputation() {
			return reputation;
		}
		public void setReputation(Object reputation) {
			this.reputation = reputation;
		}
		public Object getJobs() {
			return jobs;
		}
		public void setJobs(Object jobs) {
			this.jobs = jobs;
		}
		public Object getProfile_description() {
			return profile_description;
		}
		public void setProfile_description(Object profile_description) {
			this.profile_description = profile_description;
		}
		public Object getHourly_rate() {
			return hourly_rate;
		}
		public void setHourly_rate(Object hourly_rate) {
			this.hourly_rate = hourly_rate;
		}
		public int getRegistration_date() {
			return registration_date;
		}
		public void setRegistration_date(int registration_date) {
			this.registration_date = registration_date;
		}
		public boolean isLimited_account() {
			return limited_account;
		}
		public void setLimited_account(boolean limited_account) {
			this.limited_account = limited_account;
		}
		public String getDisplay_name() {
			return display_name;
		}
		public void setDisplay_name(String display_name) {
			this.display_name = display_name;
		}
		public Object getTagline() {
			return tagline;
		}
		public void setTagline(Object tagline) {
			this.tagline = tagline;
		}
		public Location getLocation() {
			return location;
		}
		public void setLocation(Location location) {
			this.location = location;
		}
		public String getAvatar_large() {
			return avatar_large;
		}
		public void setAvatar_large(String avatar_large) {
			this.avatar_large = avatar_large;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getChosen_role() {
			return chosen_role;
		}
		public void setChosen_role(String chosen_role) {
			this.chosen_role = chosen_role;
		}
		public Object getEmployer_reputation() {
			return employer_reputation;
		}
		public void setEmployer_reputation(Object employer_reputation) {
			this.employer_reputation = employer_reputation;
		}
		public Status getStatus() {
			return status;
		}
		public void setStatus(Status status) {
			this.status = status;
		}
		public String getAvatar_cdn() {
			return avatar_cdn;
		}
		public void setAvatar_cdn(String avatar_cdn) {
			this.avatar_cdn = avatar_cdn;
		}
		public String getAvatar_large_cdn() {
			return avatar_large_cdn;
		}
		public void setAvatar_large_cdn(String avatar_large_cdn) {
			this.avatar_large_cdn = avatar_large_cdn;
		}
		public Currency getPrimary_currency() {
			return primary_currency;
		}
		public void setPrimary_currency(Currency primary_currency) {
			this.primary_currency = primary_currency;
		}
		public Object getAccount_balances() {
			return account_balances;
		}
		public void setAccount_balances(Object account_balances) {
			this.account_balances = account_balances;
		}
		public Object getMembership_package() {
			return membership_package;
		}
		public void setMembership_package(Object membership_package) {
			this.membership_package = membership_package;
		}
		public Object getQualifications() {
			return qualifications;
		}
		public void setQualifications(Object qualifications) {
			this.qualifications = qualifications;
		}
		public Object getBadges() {
			return badges;
		}
		public void setBadges(Object badges) {
			this.badges = badges;
		}
		public String getPrimary_language() {
			return primary_language;
		}
		public void setPrimary_language(String primary_language) {
			this.primary_language = primary_language;
		}
		public Object getSearch_languages() {
			return search_languages;
		}
		public void setSearch_languages(Object search_languages) {
			this.search_languages = search_languages;
		}
		public Object getCover_image() {
			return cover_image;
		}
		public void setCover_image(Object cover_image) {
			this.cover_image = cover_image;
		}
		public Object getTrue_location() {
			return true_location;
		}
		public void setTrue_location(Object true_location) {
			this.true_location = true_location;
		}
		public Object getPortfolio_count() {
			return portfolio_count;
		}
		public void setPortfolio_count(Object portfolio_count) {
			this.portfolio_count = portfolio_count;
		}
		public Object getPreferred_freelancer() {
			return preferred_freelancer;
		}
		public void setPreferred_freelancer(Object preferred_freelancer) {
			this.preferred_freelancer = preferred_freelancer;
		}
		public Object getSupport_status() {
			return support_status;
		}
		public void setSupport_status(Object support_status) {
			this.support_status = support_status;
		}
		public Object getFirst_name() {
			return first_name;
		}
		public void setFirst_name(Object first_name) {
			this.first_name = first_name;
		}
		public Object getLast_name() {
			return last_name;
		}
		public void setLast_name(Object last_name) {
			this.last_name = last_name;
		}
		public Object getMobile_tracking() {
			return mobile_tracking;
		}
		public void setMobile_tracking(Object mobile_tracking) {
			this.mobile_tracking = mobile_tracking;
		}
		public Object getCorporate() {
			return corporate;
		}
		public void setCorporate(Object corporate) {
			this.corporate = corporate;
		}
		public String getPublic_name() {
			return public_name;
		}
		public void setPublic_name(String public_name) {
			this.public_name = public_name;
		}
		public Object getCorporate_users() {
			return corporate_users;
		}
		public void setCorporate_users(Object corporate_users) {
			this.corporate_users = corporate_users;
		}
		public Object getIs_local() {
			return is_local;
		}
		public void setIs_local(Object is_local) {
			this.is_local = is_local;
		}
		public Object getAddress() {
			return address;
		}
		public void setAddress(Object address) {
			this.address = address;
		}
		public Object getCompany() {
			return company;
		}
		public void setCompany(Object company) {
			this.company = company;
		}
		public Object getRecommendations() {
			return recommendations;
		}
		public void setRecommendations(Object recommendations) {
			this.recommendations = recommendations;
		}
		public ArrayList<Object> getPool_ids() {
			return pool_ids;
		}
		public void setPool_ids(ArrayList<Object> pool_ids) {
			this.pool_ids = pool_ids;
		}
		public ArrayList<Object> getEnterprise_ids() {
			return enterprise_ids;
		}
		public void setEnterprise_ids(ArrayList<Object> enterprise_ids) {
			this.enterprise_ids = enterprise_ids;
		}
		public Object getDate_of_birth() {
			return date_of_birth;
		}
		public void setDate_of_birth(Object date_of_birth) {
			this.date_of_birth = date_of_birth;
		}
		public Object getEscrowcom_account_linked() {
			return escrowcom_account_linked;
		}
		public void setEscrowcom_account_linked(Object escrowcom_account_linked) {
			this.escrowcom_account_linked = escrowcom_account_linked;
		}
		public boolean isEscrowcom_interaction_required() {
			return escrowcom_interaction_required;
		}
		public void setEscrowcom_interaction_required(boolean escrowcom_interaction_required) {
			this.escrowcom_interaction_required = escrowcom_interaction_required;
		}
		public Object getMarketing_mobile_number() {
			return marketing_mobile_number;
		}
		public void setMarketing_mobile_number(Object marketing_mobile_number) {
			this.marketing_mobile_number = marketing_mobile_number;
		}
		public Object getUser_sanctions() {
			return user_sanctions;
		}
		public void setUser_sanctions(Object user_sanctions) {
			this.user_sanctions = user_sanctions;
		}
		public Object getFreelancer_verified_status() {
			return freelancer_verified_status;
		}
		public void setFreelancer_verified_status(Object freelancer_verified_status) {
			this.freelancer_verified_status = freelancer_verified_status;
		}
		public Object getSecure_phone() {
			return secure_phone;
		}
		public void setSecure_phone(Object secure_phone) {
			this.secure_phone = secure_phone;
		}
		public Object getDirectory_follow_preferences() {
			return directory_follow_preferences;
		}
		public void setDirectory_follow_preferences(Object directory_follow_preferences) {
			this.directory_follow_preferences = directory_follow_preferences;
		}
		public Object getIs_payment_confirmation_required() {
			return is_payment_confirmation_required;
		}
		public void setIs_payment_confirmation_required(Object is_payment_confirmation_required) {
			this.is_payment_confirmation_required = is_payment_confirmation_required;
		}
		public Object getIs_nominated_payment_controlled() {
			return is_nominated_payment_controlled;
		}
		public void setIs_nominated_payment_controlled(Object is_nominated_payment_controlled) {
			this.is_nominated_payment_controlled = is_nominated_payment_controlled;
		}
		public Object getIs_nominated_payment_share_setup_complete() {
			return is_nominated_payment_share_setup_complete;
		}
		public void setIs_nominated_payment_share_setup_complete(Object is_nominated_payment_share_setup_complete) {
			this.is_nominated_payment_share_setup_complete = is_nominated_payment_share_setup_complete;
		}
		public Object getSpam_profile() {
			return spam_profile;
		}
		public void setSpam_profile(Object spam_profile) {
			this.spam_profile = spam_profile;
		}
		public Object getEndorsements() {
			return endorsements;
		}
		public void setEndorsements(Object endorsements) {
			this.endorsements = endorsements;
		}
		public TimeZone getTimezone() {
			return timezone;
		}
		public void setTimezone(TimeZone timezone) {
			this.timezone = timezone;
		}
		public Object getResponsiveness() {
			return responsiveness;
		}
		public void setResponsiveness(Object responsiveness) {
			this.responsiveness = responsiveness;
		}
		public Object getBid_quality_details() {
			return bid_quality_details;
		}
		public void setBid_quality_details(Object bid_quality_details) {
			this.bid_quality_details = bid_quality_details;
		}
		public Object getTest_user() {
			return test_user;
		}
		public void setTest_user(Object test_user) {
			this.test_user = test_user;
		}
		public Object getOnline_offline_status() {
			return online_offline_status;
		}
		public void setOnline_offline_status(Object online_offline_status) {
			this.online_offline_status = online_offline_status;
		}
		public Object getDeposit_methods() {
			return deposit_methods;
		}
		public void setDeposit_methods(Object deposit_methods) {
			this.deposit_methods = deposit_methods;
		}
		public boolean isOauth_password_credentials_allowed() {
			return oauth_password_credentials_allowed;
		}
		public void setOauth_password_credentials_allowed(boolean oauth_password_credentials_allowed) {
			this.oauth_password_credentials_allowed = oauth_password_credentials_allowed;
		}
		public boolean isRegistration_completed() {
			return registration_completed;
		}
		public void setRegistration_completed(boolean registration_completed) {
			this.registration_completed = registration_completed;
		}
		public boolean isIs_profile_visible() {
			return is_profile_visible;
		}
		public void setIs_profile_visible(boolean is_profile_visible) {
			this.is_profile_visible = is_profile_visible;
		}
		public Object getEnterprise_metadata_values() {
			return enterprise_metadata_values;
		}
		public void setEnterprise_metadata_values(Object enterprise_metadata_values) {
			this.enterprise_metadata_values = enterprise_metadata_values;
		}
		public Object getMfa() {
			return mfa;
		}
		public void setMfa(Object mfa) {
			this.mfa = mfa;
		}
		public Object getGrants() {
			return grants;
		}
		public void setGrants(Object grants) {
			this.grants = grants;
		}
		public Object getOperating_areas() {
			return operating_areas;
		}
		public void setOperating_areas(Object operating_areas) {
			this.operating_areas = operating_areas;
		}
		public Object getEquipment_groups() {
			return equipment_groups;
		}
		public void setEquipment_groups(Object equipment_groups) {
			this.equipment_groups = equipment_groups;
		}	
	    
	    
	
}
