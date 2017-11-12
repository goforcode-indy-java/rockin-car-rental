package com.lmig.gfc.rentals.models;

public class Rental {

	private Person renter;
	private Car car;
	
	public Rental(Person renter, Car car) {
		this.renter = renter;
		this.car = car;
	}

	public Person getRenter() {
		return renter;
	}

	public Car getCar() {
		return car;
	}
	
}
