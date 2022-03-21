package dao;

/** Represents true location of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class TrueLocation{
	
	/**
	 * @param country Country for the Location
	 */
	public Country country;

	/** gets the country for the Location.
   	 * @version 1.0
   	 * @return the country for the Location
   	 * @since 1.0
     */
	public Country getCountry() {
		return country;
	}

	/** sets the country for the Location.
   	 * @version 1.0
   	 * @param country the country for the Location
   	 * @since 1.0
     */
	public void setCountry(Country country) {
		this.country = country;
	}
	}