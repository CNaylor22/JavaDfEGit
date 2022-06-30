package com.qa.solid.singleresponsibility;

public class Runner {

	public static void main(String[] args) {
		
		Car myCar = new Car("black", "A5", 5000);

//		System.out.println(myCar.getMileage());

		Driver driver = new Driver();

		driver.drive(myCar, 500);

//		System.out.println(myCar.getMileage());

		
		Mechanic mechanic = new Mechanic("winterservice", "exhaust", "re-colour" );
		System.out.println("We have modified your car with the following = " + mechanic.getModify ());
		
		
		
		
		Modification myModification = new Modification("blue", "leatherseats", 3);
			System.out.println("We have re-sprayed your car = " + myModification.getModcolour());
		
		
		
		
	} 

}
