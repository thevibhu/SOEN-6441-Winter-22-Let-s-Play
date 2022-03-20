package dao;

/** Represents bit stats of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class BidStats{
	public int bid_count;
	public int bid_avg;
	
	
	/** gets bid count of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return returns the bid count of object
	 * @since 1.0
	*/
	public int getBid_count() {
		return bid_count;
	}
	
	/** sets bid count of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param bid_count is the bid count 
	 * @since 1.0
	*/
	public void setBid_count(int bid_count) {
		this.bid_count = bid_count;
	}
	
	/** gets bid avg of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return returns the bid count of object
	 * @since 1.0
	*/
	public int getBid_avg() {
		return bid_avg;
	}
	
	/** sets bid avg of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param bid_avg is the bid avg 
	 * @since 1.0
	*/
	public void setBid_avg(int bid_avg) {
		this.bid_avg = bid_avg;
	}
	}