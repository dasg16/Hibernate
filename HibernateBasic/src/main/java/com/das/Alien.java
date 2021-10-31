package com.das;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//@Entity(name="alient_test")
//@Table(name="alient_test")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Entity
public class Alien {

	@Id
	public String aID;
	public String aName;
	// @Column(name = "aColor")
	public String sColor;
	public Properties aProperties;

	public Properties getaProperties() {
		return aProperties;
	}

	public void setaProperties(Properties aProperties) {
		this.aProperties = aProperties;
	}

	// @Transient
	public String getaID() {
		return aID;
	}

	public void setaID(String aID) {
		this.aID = aID;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	@Override
	public String toString() {
		return "Alien [aID=" + aID + ", aName=" + aName + ", sColor=" + sColor + "]";
	}

}
