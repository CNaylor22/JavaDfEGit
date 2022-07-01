package com.qa.vehicleexercise;

public class Van extends Vehicle {

	private int numOfDoors;
	private boolean hasFridge;

	public Van(String make, String model, String colour, int numOfDoors, boolean hasFridge) {
		super(make, model, colour);
		this.numOfDoors = numOfDoors;
		this.hasFridge = hasFridge;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public boolean isHasFridge() {
		return hasFridge;
	}

	public void setHasFridge(boolean hasFridge) {
		this.hasFridge = hasFridge;

	}

	@Override
	public String toString() {
		return "Van [numOfDoors=" + numOfDoors + ", hasFridge=" + hasFridge + ", getMake()=" + getMake()
				+ ", getModel()=" + getModel() + ", getColour()=" + getColour() + "]";
	}
		@Override
		public void calculateBill() {
			System.out.println("The bill for the van is £150");
	
	}
}
