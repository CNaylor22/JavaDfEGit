package com.qa.VehicleExercise;

public class Motorbike extends Vehicle {

	private String engineType;
	private int engineSize;

	public Motorbike(String make, String model, String colour, String engineType, int engineSize) {
		super(make, model, colour);
		this.engineType = engineType;
		this.engineSize = engineSize;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;

	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;

	}

	@Override
	public String toString() {
		return "Motorbike [engineType=" + engineType + ", engineSize=" + engineSize + ", getMake()=" + getMake()
				+ ", getModel()=" + getModel() + ", getColour()=" + getColour() + "]";
	}
		@Override
		public void calculateBill() {
			System.out.println("The bill is £35");
	
	
	}
}