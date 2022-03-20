package dao;


/** Contains constructor and variable that are used to show the User Inforrmation on HTML page
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/

public class UserDetails {
	
	public String username;
	public int id;
	public String avatar_large;
	public String display_name;
	public String role;
	public String chosen_role;
    public String public_name;

	
	
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getAvatar_large() {
		return avatar_large;
	}



	public void setAvatar_large(String avatar_large) {
		this.avatar_large = avatar_large;
	}



	public String getDisplay_name() {
		return display_name;
	}



	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
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



	public String getPublic_name() {
		return public_name;
	}



	public void setPublic_name(String public_name) {
		this.public_name = public_name;
	}



	public UserDetails(String username,	String public_name, int id, String avatar_large, String display_name, String role, String chosen_role) {
		super();
		this.username = username;
		this.id = id;
		this.avatar_large = avatar_large;
		this.display_name = display_name;
		this.role = role;
		this.chosen_role = chosen_role;
		this.public_name= public_name;
	}



	public UserDetails() {
		
	}


	
		
}
