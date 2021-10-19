package com.das;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

	@Id
	String lId;
	String lName;

	public String getlId() {
		return lId;
	}

	public void setlId(String lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
}
