package dao;

/** Represents budget of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Budget{
	public double minimum;
	public double maximum;
	
	/** gets Minimum budget of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return returns the Minimum budget of object
	 * @since 1.0
	*/
	public double getMinimum() {
		return minimum;
	}
	
	/** sets Minimum budget of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param minimum is the budget to be set
	 * @since 1.0
	*/
	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}
	
	/** gets Maximum budget of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @return returns the Maximum budget of object
	 * @since 1.0
	*/
	public double getMaximum() {
		return maximum;
	}
	
	/** sets Maximum budget of a project.
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param maximum is the budget to be set
	 * @since 1.0
	*/
	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}
	}