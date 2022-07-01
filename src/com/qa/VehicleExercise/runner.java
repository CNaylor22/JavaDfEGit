package com.qa.vehicleexercise;

public class Runner {

	public static void main(String[] args) {

		Car CarOne = new Car("Ford", "Capri", "Red", 4, true);
		Motorbike BikeOne = new Motorbike("Triumph", "Bonneville", "Black", "Petrol", 2);
		Van VanOne = new Van("VW", "Campervan", "White", 4, true);

		Garage garage = new Garage();

		garage.add(CarOne);
		garage.add(BikeOne);
		garage.add(VanOne);

//		System.out.println(CarOne);
//		System.out.println(BikeOne);
//		System.out.println(VanOne);

		garage.printList();

		garage.calculateBill();

		garage.removeByType("Car");
		garage.printList();
	}

}
