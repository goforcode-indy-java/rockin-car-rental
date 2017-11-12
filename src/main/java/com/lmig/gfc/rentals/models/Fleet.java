package com.lmig.gfc.rentals.models;

import java.util.ArrayList;

public class Fleet {
	
	private ArrayList<Car> availableCars;
	private ArrayList<Rental> unavailableCars;
	
	public Fleet() {
		availableCars = new ArrayList<Car>();
		unavailableCars = new ArrayList<Rental>();
	}
	
	public void addCar(Car car) {
		availableCars.add(car);
	}
	
	public void makeCarAvailable(int index) {
		Rental rental = unavailableCars.remove(index);
		availableCars.add(rental.getCar());
	}
	
	public void makeCarUnavailable(int index, Person person) {
		Car car = availableCars.remove(index);
		Rental rental = new Rental(person, car);
		unavailableCars.add(rental);
	}

	public ArrayList<Car> getAvailableCars() {
		return availableCars;
	}

	public ArrayList<Rental> getUnavailableCars() {
		return unavailableCars;
	}

}




