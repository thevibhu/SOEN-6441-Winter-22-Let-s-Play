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


	
		
}
