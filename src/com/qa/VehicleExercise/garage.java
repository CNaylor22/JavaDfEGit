package com.qa.vehicleexercise;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> garage = new ArrayList<>();

	public void add(Vehicle input) {
		garage.add(input);
	}

	public void printList() {
		for (int i = 0; i < garage.size(); i++)
			System.out.println(garage.get(i));
	}
//	or
//	for (Vehicle vehicle : garage) {
//			System.out.println(vehicle);

	public void calculateBill() {
		for (Vehicle vehicle : garage) 
			vehicle.calculateBill();
		
	}

	public void removeByType(String type) {

		List<Vehicle> toBeRemoved = new ArrayList<>();
		
	

		for (Vehicle vehicle : garage) {

			if (vehicle.getClass().getSimpleName().equals(type)) 
				toBeRemoved.add(vehicle);

				for (Vehicle vehicle1 : toBeRemoved) 

					garage.remove(vehicle1); 
					System.out.println();
					System.out.println("Vehicle removed"); }
				
				}

	public void emptyGarage() {			
				garage.clear();
				System.out.println("The Garage was emptied");
				
				}
}