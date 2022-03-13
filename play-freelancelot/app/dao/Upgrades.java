package dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Upgrades{
 public boolean featured;
 @JsonProperty("sealed") 
 public boolean mysealed;
 public boolean nonpublic;
 public boolean fulltime;
 public boolean urgent;
 public boolean qualified;
 @JsonProperty("NDA") 
 public boolean nDA;
 public boolean ip_contract;
 public boolean non_compete;
 public boolean project_management;
 public boolean pf_only;
public boolean isFeatured() {
	return featured;
}
public void setFeatured(boolean featured) {
	this.featured = featured;
}
public boolean isMysealed() {
	return mysealed;
}
public void setMysealed(boolean mysealed) {
	this.mysealed = mysealed;
}
public boolean isNonpublic() {
	return nonpublic;
}
public void setNonpublic(boolean nonpublic) {
	this.nonpublic = nonpublic;
}
public boolean isFulltime() {
	return fulltime;
}
public void setFulltime(boolean fulltime) {
	this.fulltime = fulltime;
}
public boolean isUrgent() {
	return urgent;
}
public void setUrgent(boolean urgent) {
	this.urgent = urgent;
}
public boolean isQualified() {
	return qualified;
}
public void setQualified(boolean qualified) {
	this.qualified = qualified;
}
public boolean isnDA() {
	return nDA;
}
public void setnDA(boolean nDA) {
	this.nDA = nDA;
}
public boolean isIp_contract() {
	return ip_contract;
}
public void setIp_contract(boolean ip_contract) {
	this.ip_contract = ip_contract;
}
public boolean isNon_compete() {
	return non_compete;
}
public void setNon_compete(boolean non_compete) {
	this.non_compete = non_compete;
}
public boolean isProject_management() {
	return project_management;
}
public void setProject_management(boolean project_management) {
	this.project_management = project_management;
}
public boolean isPf_only() {
	return pf_only;
}
public void setPf_only(boolean pf_only) {
	this.pf_only = pf_only;
}
}
