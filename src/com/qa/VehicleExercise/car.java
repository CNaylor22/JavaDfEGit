package com.qa.vehicleexercise;

public class Car extends Vehicle {

	private int numOfWheels;
	private boolean hasAirCon;

	public Car(String make, String model, String colour, int numOfWheels, boolean hasAirCon) {
		super(make, model, colour);
		this.numOfWheels = numOfWheels;
		this.hasAirCon = hasAirCon;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;

	}

	public boolean ishasAirCon() {
		return hasAirCon;

	}

	public void setAirCon(boolean airCon, boolean hasAirCon) {
		this.hasAirCon = hasAirCon;
	
	
	
	}

	@Override
	public String toString() {
		return "Car [numOfWheels=" + numOfWheels + ", hasAirCon=" + hasAirCon + ", Make = " + getMake()
				+ ", Model = " + getModel() + ", Colour= " + getColour() + "]";
	}
	
	
		@Override
		public void calculateBill() {
			System.out.println("The bill for the car is £200");
	
	}

	
	}

