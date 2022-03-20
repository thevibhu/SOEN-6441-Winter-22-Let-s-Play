package dao;

import java.util.ArrayList;
import java.util.List;

/** Represents result from the FreelancerAPI call which holds the User Information.
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class Result2 {
	public UserProfile users;

	/** gets the users
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return users class
	 * @since 1.0
	*/
	public UserProfile getUsers() {
		return users;
	}
	/** sets the users
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param users class
	 * @since 1.0
	*/
	public void setUsers(UserProfile users) {
		this.users = users;
	}
}
