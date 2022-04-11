package dao;


/** Represents status of a project.
 * @author Gagandeep
 * @version 1.0
 * @since 1.0
*/
public class Status {
	public boolean email_verified;

	  /** checks if email is verified
			 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
			 * @version 1.0
			 * @return email_verified check
			 * @since 1.0
			*/
	public boolean isEmail_verified() {
		return email_verified;
	}
	 /** sets if email is verified
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param email_verified check
	 * @since 1.0
	*/
	public void setEmail_verified(boolean email_verified) {
		this.email_verified = email_verified;
	}
}
