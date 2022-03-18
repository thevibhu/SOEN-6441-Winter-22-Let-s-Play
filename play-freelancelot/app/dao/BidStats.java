package dao;

/** Represents bit stats of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class BidStats{
	public int bid_count;
	public int bid_avg;
	 
	 
	 
	 
	public int getBid_count() {
		return bid_count;
	}
	public void setBid_count(int bid_count) {
		this.bid_count = bid_count;
	}
	public int getBid_avg() {
		return bid_avg;
	}
	public void setBid_avg(int bid_avg) {
		this.bid_avg = bid_avg;
	}
	}