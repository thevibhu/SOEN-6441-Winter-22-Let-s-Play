package dao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

/** Represents Shows reults of the classes and fields returned from API user to get User Information
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
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

		public String getDisplay_name() {
			return display_name;
		}

		public String getAvatar_large() {
			return avatar_large;
		}
		public void setAvatar_large(String avatar_large) {
			this.avatar_large = avatar_large;
		}
		public String getPublic_name() {
			return public_name;
		}
		public void setPublic_name(String public_name) {
			this.public_name = public_name;
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
    
	
}
