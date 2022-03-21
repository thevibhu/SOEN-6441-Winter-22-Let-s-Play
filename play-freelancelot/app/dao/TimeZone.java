package dao;


/** Represents Timezone of a project.
 * @author Gagandeep
 * @version 1.0
 * @since 1.0
*/
public class TimeZone {
	
	/**
	 * @param id ID of the Time Zone
	 */
	public int id;
	
	/**
	 * @param country Time Zone of the Country
	 */
	public String country;
	
	/**
	 * @param timezone Time Zone of the Project
	 */
	public String timezone;
	
	/** gets the Id of the Time Zone.
   	 * @version 1.0
   	 * @return Id of the Time Zone.
   	 * @since 1.0
     */
	public int getId() {
		return id;
	}
	
	/** sets the Id of the Time Zone.
   	 * @version 1.0
   	 * @param id Id of the Time Zone.
   	 * @since 1.0
     */
	public void setId(int id) {
		this.id = id;
	}
	
	/** gets the country for the Time Zone.
   	 * @version 1.0
   	 * @return Country for the Time Zone.
   	 * @since 1.0
     */
	public String getCountry() {
		return country;
	}
	
	/** sets the Country for the Time Zone.
   	 * @version 1.0
   	 * @param country Country for the Time Zone.
   	 * @since 1.0
     */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/** gets the Time Zone.
   	 * @version 1.0
   	 * @return the Time Zone.
   	 * @since 1.0
     */
	public String getTimezone() {
		return timezone;
	}
	
	/** sets the Id of the Time Zone.
   	 * @version 1.0
   	 * @param timeZone is the Time Zone.
   	 * @since 1.0
     */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	/** gets the Off Set for the Time Zone.
   	 * @version 1.0
   	 * @return Off Set for the Time Zone.
   	 * @since 1.0
     */
	public float getOffset() {
		return offset;
	}
	
	/** sets the Off Set for the Time Zone.
   	 * @version 1.0
   	 * @param offset Off Set for the Time Zone.
   	 * @since 1.0
     */
	public void setOffset(float offset) {
		this.offset = offset;
	}
	
	/**
	 * @param offset for the Time Zone
	 */
	public float offset;
}
