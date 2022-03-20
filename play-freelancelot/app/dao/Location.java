package dao;

/** Represents location of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Location{
	 public Country country;
	 public String city;

	 /** gets the country
		 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
		 * @version 1.0
		 * @return country of the project.
		 * @since 1.0
		*/
	public Country getCountry() {
		return country;
	}

	/** sets the country
	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	 * @version 1.0
	 * @param country of the project.
	 * @since 1.0
	*/
	public void setCountry(Country country) {
		this.country = country;
	}
	}

