package dao;

/** Represents hourly info of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class HourlyProjectInfo {
	public Commitment commitment;
    public String duration_enum;
    
    
	public Commitment getCommitment() {
		return commitment;
	}
	public void setCommitment(Commitment commitment) {
		this.commitment = commitment;
	}
	public String getDuration_enum() {
		return duration_enum;
	}
	public void setDuration_enum(String duration_enum) {
		this.duration_enum = duration_enum;
	}
}
