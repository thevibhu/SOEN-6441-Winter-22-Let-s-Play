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
}
