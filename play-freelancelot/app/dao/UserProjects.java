package dao;

/** Represents Shows reults of the classes and fields returned from API user to get User Information
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class UserProjects {
	/**
	 * @param status Status of the User Project
	 */
    public String status;
    
    /**
	 * @param result Resultant Data of the User Project
	 */
    public ResultProjects result;
    
    /**
	 * @param request_id Request ID of the User Project
	 */
    public String request_id;
    
    /** gets the status of the project.
   	 * @version 1.0
   	 * @return status of the project.
   	 * @since 1.0
     */
	public String getStatus() {
		return status;
	}
	
	/** sets the status of the project.
   	 * @version 1.0
   	 * @param status status of the project
   	 * @since 1.0
     */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/** gets the Resultant Data of the project.
   	 * @version 1.0
   	 * @return Data of the project.
   	 * @since 1.0
     */
	public ResultProjects getResult() {
		return result;
	}
	
	/** sets the resultant data of the project.
   	 * @version 1.0
   	 * @param result result of the project
   	 * @since 1.0
     */
	public void setResult(ResultProjects result) {
		this.result = result;
	}
	
	/** gets the Request ID of the project.
   	 * @version 1.0
   	 * @return Request ID of the project.
   	 * @since 1.0
     */
	public String getRequest_id() {
		return request_id;
	}
	
	/** sets the Request ID of the project.
   	 * @version 1.0
   	 * @param request_id Id of the project
   	 * @since 1.0
     */
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
}
