package dao;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents upgrades of a project.
 * @author Vaibhav, Felipe, Gagandeep, Gurpreet
 * @version 1.0
 * @since 1.0
*/
public class Upgrades{
 /**
  * @param featured features for the Upgrades
  */
 public boolean featured;
 @JsonProperty("sealed") 
 /**
  * @param mysealed Seal for the Upgrade of the Project
  */
 public boolean mysealed;
 
 /**
  * @param nonpublic Whether Upgrades are Public or Not
  */
 public boolean nonpublic;
 
 /**
  * @param fulltime Full Time or not
  */
 public boolean fulltime;
 
 /**
  * @param urgent Project requires urgent upgrade
  */
 public boolean urgent;
 
 /**
  * @param qualified Project quailified for upgrade
  */
 public boolean qualified;
 @JsonProperty("NDA")
 
 /**
  * @param nDA nDA for the upgrade of the project
  */
 public boolean nDA;
 
 /**
  * @param ip_contract contract for the upgrade of the project
  */
 public boolean ip_contract;
 
 /**
  * @param non_compete non compete for the upgrade of the project
  */
 public boolean non_compete;
 
 /**
  * @param project_management Management for the upgrade of the project
  */
 public boolean project_management;
 
 /**
  * @param pf_only PF for the upgrade of the project
  */
 public boolean pf_only;
 
 /** gets features for the Upgrades.
  * @version 1.0
  * @return features for the Upgrades.
  * @since 1.0
*/ 
public boolean isFeatured() {
	return featured;
}

/** sets features for the Upgrades.
 * @version 1.0
 * @param featured features for the Upgrades.
 * @since 1.0
*/ 
public void setFeatured(boolean featured) {
	this.featured = featured;
}

/** gets mysealed Seal for the Upgrade of the Project.
 * @version 1.0
 * @param Seal for the Upgrade of the Project
 * @since 1.0
*/
public boolean isMysealed() {
	return mysealed;
}

/** sets mysealed Seal for the Upgrade of the Project.
 * @version 1.0
 * @param mysealed Seal for the Upgrade of the Project
 * @since 1.0
*/
public void setMysealed(boolean mysealed) {
	this.mysealed = mysealed;
}

/** gets whether Project is Public or not.
  * @version 1.0
  * @return Whether project is Public or not.
  * @since 1.0
*/
public boolean isNonpublic() {
	return nonpublic;
}

/** sets whether Project is Public or not.
 * @version 1.0
 * @param nonpublic Whether project is Public or not.
 * @since 1.0
*/
public void setNonpublic(boolean nonpublic) {
	this.nonpublic = nonpublic;
}

/** gets Full Time for the upgrade.
 * @version 1.0
 * @return Full Time for the upgrade if required
 * @since 1.0
*/
public boolean isFulltime() {
	return fulltime;
}

/** sets Full Time for the upgrade.
 * @version 1.0
 * @param fulltime Full Time for the upgrade if required
 * @since 1.0
*/
public void setFulltime(boolean fulltime) {
	this.fulltime = fulltime;
}

/** gets Projects for upgrade.
 * @version 1.0
 * @return Project requires urgent upgrade
 * @since 1.0
*/
public boolean isUrgent() {
	return urgent;
}

/** sets Projects for upgrade.
 * @version 1.0
 * @param urgent Project requires urgent upgrade
 * @since 1.0
*/
public void setUrgent(boolean urgent) {
	this.urgent = urgent;
}

/** gets Project quailified for upgrade.
 * @version 1.0
 * @return Project quailified for upgrade
 * @since 1.0
*/
public boolean isQualified() {
	return qualified;
}

/** sets Project quailified for upgrade.
 * @version 1.0
 * @param qualified Project quailified for upgrade
 * @since 1.0
*/
public void setQualified(boolean qualified) {
	this.qualified = qualified;
}

/** gets nDA for the upgrade of the project.
 * @version 1.0
 * @return nDA for the upgrade of the project
 * @since 1.0
*/
public boolean isnDA() {
	return nDA;
}

/** sets nDA for the upgrade of the project.
 * @version 1.0
 * @param nDA nDA for the upgrade of the project
 * @since 1.0
*/
public void setnDA(boolean nDA) {
	this.nDA = nDA;
}

/** gets contract for the upgrade of the project.
 * @version 1.0
 * @return contract for the upgrade of the project
 * @since 1.0
*/
public boolean isIp_contract() {
	return ip_contract;
}

/** sets contract for the upgrade of the project.
 * @version 1.0
 * @param ip_contract contract for the upgrade of the project
 * @since 1.0
*/
public void setIp_contract(boolean ip_contract) {
	this.ip_contract = ip_contract;
}

/** gets Management for the upgrade of the project.
 * @version 1.0
 * @return non compete for the upgrade of the project
 * @since 1.0
*/
public boolean isNon_compete() {
	return non_compete;
}

/** sets non compete for the upgrade of the project
 * @version 1.0
 * @param non_compete non compete for the upgrade of the project
 * @since 1.0
*/
public void setNon_compete(boolean non_compete) {
	this.non_compete = non_compete;
}

/** gets Management for the upgrade of the project.
 * @version 1.0
 * @return Management for the upgrade of the project
 * @since 1.0
*/
public boolean isProject_management() {
	return project_management;
}

/** sets Management for the upgrade of the project.
 * @version 1.0
 * @param project_management Management for the upgrade of the project
 * @since 1.0
*/
public void setProject_management(boolean project_management) {
	this.project_management = project_management;
}

/** gets PF for the upgrade of the Project.
 * @version 1.0
 * @return PF for the upgrade of the Project
 * @since 1.0
*/
public boolean isPf_only() {
	return pf_only;
}

/** sets PF for the upgrade of the Project.
	 * @version 1.0
	 * @param pf_only PF for the upgrade of the Project
	 * @since 1.0
 */
public void setPf_only(boolean pf_only) {
	this.pf_only = pf_only;
}
}
