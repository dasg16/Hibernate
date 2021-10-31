package com.das;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	String sRollNumber;
	String sName;
	String sMarks;

	@OneToMany
	List<Laptop> laptop = new ArrayList<Laptop>();

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

//	@OneToOne
//	Laptop laptop;
//
//	public Laptop getLaptop() {
//		return laptop;
//	}
//
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}

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

	@Override
	public String toString() {
		return "Student [sRollNumber=" + sRollNumber + ", sName=" + sName + ", sMarks=" + sMarks + ", laptop=" + laptop
				+ "]";
	}

}
