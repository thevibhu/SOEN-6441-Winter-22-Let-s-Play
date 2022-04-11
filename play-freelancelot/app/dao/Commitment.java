package dao;

/** Represents commitment of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Commitment {
	public int hours;
    public String interval;
    
    
    /** gets hours of the project.
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return hours of the project.
   	 * @since 1.0
   	*/
	public int getHours() {
		return hours;
	}
	
	 /** sets hours of the project.
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param hours of the project.
   	 * @since 1.0
   	*/
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	/** gets interval of the project.
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return interval of the project.
   	 * @since 1.0
   	*/
	public String getInterval() {
		return interval;
	}
	
	/** sets interval of the project.
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param interval of the project.
   	 * @since 1.0
   	*/
	public void setInterval(String interval) {
		this.interval = interval;
	}
}
