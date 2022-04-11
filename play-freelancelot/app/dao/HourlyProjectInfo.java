package dao;

/** Represents hourly info of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class HourlyProjectInfo {
	public Commitment commitment;
    public String duration_enum;
    
    /** gets commitment of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return commitment of a project.
	 * @since 1.0
	*/
	public Commitment getCommitment() {
		return commitment;
	}
	
	/** sets commitment of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param commitment of a project.
	 * @since 1.0
	*/
	public void setCommitment(Commitment commitment) {
		this.commitment = commitment;
	}
	
	/** sets duration_enum of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return duration_enum of a project.
	 * @since 1.0
	*/
	public String getDuration_enum() {
		return duration_enum;
	}
	
	/** gets duration_enum of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param duration_enum of a project.
	 * @since 1.0
	*/
	public void setDuration_enum(String duration_enum) {
		this.duration_enum = duration_enum;
	}
}
