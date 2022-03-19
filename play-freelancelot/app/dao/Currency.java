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
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getExchange_rate() {
		return exchange_rate;
	}
	public void setExchange_rate(double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isIs_external() {
		return is_external;
	}
	public void setIs_external(boolean is_external) {
		this.is_external = is_external;
	}
	public boolean isIs_escrowcom_supported() {
		return is_escrowcom_supported;
	}
	public void setIs_escrowcom_supported(boolean is_escrowcom_supported) {
		this.is_escrowcom_supported = is_escrowcom_supported;
	}
	}
