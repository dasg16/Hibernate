package com.das;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	String sRollNumber;
	String sName;
	String sMarks;

	public String getsRollNumber() {
		return sRollNumber;
	}

	public void setsRollNumber(String sRollNumber) {
		this.sRollNumber = sRollNumber;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsMarks() {
		return sMarks;
	}

	public void setsMarks(String sMarks) {
		this.sMarks = sMarks;
	}

}
