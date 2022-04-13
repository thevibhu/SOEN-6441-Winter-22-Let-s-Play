package dao;

import java.util.ArrayList;

/** Represents result from the FreelancerAPI call which holds the list of projects.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Result {
	/** constructor to intialize the object
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return Result class
	 * @since 1.0
	*/
	public Result() {
		super();
	}
	
	/** parameterized constructor to intialize the object
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param projects of the result
	 * @param total_count of the result
	 * @return Result class
	 * @since 1.0
	*/
	public Result(ArrayList<Project> projects, int total_count) {
		super();
		this.projects = projects;
		this.total_count = total_count;
	}
	public ArrayList<Project> projects;
	public int total_count;
	
	/** gets the projects of the result
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return projects of the result
	 * @since 1.0
	*/
	public ArrayList<Project> getProjects() {
		return projects;
	}
	
	/** sets the projects of the result
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param projects of the result
	 * @since 1.0
	*/
	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}
	
	/** gets the total_count of the result
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return total_count of the result
	 * @since 1.0
	*/
	public int getTotal_count() {
		return total_count;
	}
	
	/** gets the total_count of the result
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param total_count of the result
	 * @since 1.0
	*/
	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

}
