package com.lmig.gfc.rentals.models;

import java.util.ArrayList;

public class Fleet {
	
	private ArrayList<Car> availableCars;
	private ArrayList<Car> unavailableCars;
	
	public Fleet() {
		availableCars = new ArrayList<Car>();
		unavailableCars = new ArrayList<Car>();
	}
	
	public void addCar(Car car) {
		availableCars.add(car);
	}
	
	public void makeCarAvailable(int index) {
		Car car = unavailableCars.remove(index);
		availableCars.add(car);
	}
	
	public void makeCarUnavailable(int index) {
		Car car = availableCars.remove(index);
		unavailableCars.add(car);
	}

	public ArrayList<Car> getAvailableCars() {
		return availableCars;
	}

	public ArrayList<Car> getUnavailableCars() {
		return unavailableCars;
	}

}




