package dao;

/** Represents Shows reults of the classes and fields returned from API user to get User Information
 * @author  Gagandeep Kaur
 * @version 1.0
 * @since 1.0
*/
public class UserProjects {
    public String status;
    public ResultProjects result;
    public String request_id;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ResultProjects getResult() {
		return result;
	}
	public void setResult(ResultProjects result) {
		this.result = result;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
}
