package dao;

public class User{
	 public String status;
	 public UserProfile result;
	 public String request_id;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserProfile getResult() {
		return result;
	}
	public void setResult(UserProfile result) {
		this.result = result;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
}
