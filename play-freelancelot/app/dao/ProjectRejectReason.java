package dao;

/** Represents the reason for rejection of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class ProjectRejectReason {
	public String description;
	public String message;
	public String getDescription() {
		return description;
	}
	
	/** sets the reject description of project
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param description of the reject.
	 * @since 1.0
	*/
	public void setDescription(String description) {
		this.description = description;
	}
	/** gets the reject message of project
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param message of the reject.
	 * @since 1.0
	*/
	public String getMessage() {
		return message;
	}
	/** sets the reject message of project
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return message of the reject.
	 * @since 1.0
	*/
	public void setMessage(String message) {
		this.message = message;
	}
	
}
