package dao;


/** Represents Timezone of a project.
 * @author Gagandeep
 * @version 1.0
 * @since 1.0
*/
public class TimeZone {
	public int id;
	public String country;
	public String timezone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public float getOffset() {
		return offset;
	}
	public void setOffset(float offset) {
		this.offset = offset;
	}
	public float offset;
}
