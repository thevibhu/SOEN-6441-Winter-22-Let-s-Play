package dao;

/** Represents commitment of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Commitment {
	public int hours;
    public String interval;
    
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
}
