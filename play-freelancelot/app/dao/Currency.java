package dao;

/** Represents the currency of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Currency{
	 public int id;
	 public String code;
	 public String sign;
	 public String name;
	 public double exchange_rate;
	 public String country;
	 public boolean is_external;
	 public boolean is_escrowcom_supported;
	 
	 
	 /** gets id of the currency
	   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
	   	 * @version 1.0
	   	 * @return id of the currency
	   	 * @since 1.0
	   	*/
	public int getId() {
		return id;
	}
	
	 /** sets id of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param id of the currency
   	 * @since 1.0
   	*/
	public void setId(int id) {
		this.id = id;
	}
	
	 /** gets code of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return code of the currency
   	 * @since 1.0
   	*/
	public String getCode() {
		return code;
	}
	
	/** sets code of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param code of the currency
   	 * @since 1.0
   	*/
	public void setCode(String code) {
		this.code = code;
	}
	
	/** gets sign of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return sign of the currency
   	 * @since 1.0
   	*/
	public String getSign() {
		return sign;
	}
	
	/** sets sign of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param sign of the currency
   	 * @since 1.0
   	*/
	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	/** gets name of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return name of the currency
   	 * @since 1.0
   	*/
	public String getName() {
		return name;
	}
	
	/** sets name of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param name of the currency
   	 * @since 1.0
   	*/
	public void setName(String name) {
		this.name = name;
	}
	
	/** gets exchange_rate of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return exchange_rate of the currency
   	 * @since 1.0
   	*/
	public double getExchange_rate() {
		return exchange_rate;
	}
	
	/** sets exchange_rate of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param exchange_rate of the currency
   	 * @since 1.0
   	*/
	public void setExchange_rate(double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}
	
	/** gets the country of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return country of the currency
   	 * @since 1.0
   	*/
	public String getCountry() {
		return country;
	}
	
	/** sets the country of the currency
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param country of the currency
   	 * @since 1.0
   	*/
	public void setCountry(String country) {
		this.country = country;
	}
	
	/** checks if is external
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return is_external
   	 * @since 1.0
   	*/
	public boolean isIs_external() {
		return is_external;
	}
	
	/** sets is external
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param is_external
   	 * @since 1.0
   	*/
	public void setIs_external(boolean is_external) {
		this.is_external = is_external;
	}
	
	/** checks if is escrowcom_supported
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @return escrowcom_supported
   	 * @since 1.0
   	*/
	public boolean isIs_escrowcom_supported() {
		return is_escrowcom_supported;
	}
	
	/** sets  is escrowcom_supported
   	 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
   	 * @version 1.0
   	 * @param escrowcom_supported 
   	 * @since 1.0
   	*/
	public void setIs_escrowcom_supported(boolean is_escrowcom_supported) {
		this.is_escrowcom_supported = is_escrowcom_supported;
	}
	}
