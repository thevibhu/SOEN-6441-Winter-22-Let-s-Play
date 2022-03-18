package dao;

/** Represents budget of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Budget{
	public double minimum;
	public double maximum;
	
	
	public double getMinimum() {
		return minimum;
	}
	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}
	public double getMaximum() {
		return maximum;
	}
	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}
	}