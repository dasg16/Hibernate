package com.das;

import javax.persistence.Embeddable;

@Embeddable
public class Properties {

	String alienBreedType;
	String alienNature;
	String alienFoodType;

	public String getAlienBreedType() {
		return alienBreedType;
	}

	public void setAlienBreedType(String alienBreedType) {
		this.alienBreedType = alienBreedType;
	}

	public String getAlienNature() {
		return alienNature;
	}

	public void setAlienNature(String alienNature) {
		this.alienNature = alienNature;
	}

	public String getAlienFoodType() {
		return alienFoodType;
	}

	public void setAlienFoodType(String alienFoodType) {
		this.alienFoodType = alienFoodType;
	}

}
