package dao;

import java.util.ArrayList;

/** Represents the result of Freelancer API used to get latest active projects.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class FreelancerResult {
	
	/** constructor to initialize the object
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return FreelancerResult
   	 * @since 1.0
   	*/
	 public FreelancerResult() {
		super();
	}
	 
	 /** parameterized constructor to initialize the object
	   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	   	 * @version 1.0
	   	 * @return FreelancerResult
	   	 * @param status of the project
	   	 * @param result  of the project
	   	 * @param request_id of the project
	   	 * @since 1.0
	   	*/
	public FreelancerResult(String status, Result result, String request_id) {
		super();
		this.status = status;
		this.result = result;
		this.request_id = request_id;
	}
	public String status;
	 public Result result;
	 public String request_id;
	 
	 
	 /** gets status of a project.
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return returns the status of a project.
		 * @since 1.0
		*/
	public String getStatus() {
		return status;
	}
	
	 /** sets status of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param status sets the status of a project.
	 * @since 1.0
	*/
	public void setStatus(String status) {
		this.status = status;
	}
	
	/** gets result of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return result of a project.
	 * @since 1.0
	*/
	public Result getResult() {
		return result;
	}
	
	/** sets result of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param result of a project.
	 * @since 1.0
	*/
	public void setResult(Result result) {
		this.result = result;
	}
	
	/** gets request_id of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return request_id of a project.
	 * @since 1.0
	*/
	public String getRequest_id() {
		return request_id;
	}
	
	/** sets request_id of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param request_id of a project.
	 * @since 1.0
	*/
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	
}
