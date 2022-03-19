package dao;

import java.util.ArrayList;

/** Represents the result of Freelancer API used to get latest active projects.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class FreelancerResult {
	 public FreelancerResult() {
		super();
	}
	public FreelancerResult(String status, Result result, String request_id) {
		super();
		this.status = status;
		this.result = result;
		this.request_id = request_id;
	}
	public String status;
	 public Result result;
	 public String request_id;
	 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	
}
