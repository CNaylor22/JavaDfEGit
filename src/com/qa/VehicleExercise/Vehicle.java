package com.qa.vehicleexercise;

public class Vehicle {

	public String make;
	public String model;
	public String colour;

//	Constructor
	public Vehicle(String make, String model, String colour) {
		super();
		this.make = make;
		this.model = model;
		this.colour = colour;

	}

	public Vehicle(String string) {

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void calculateBill() {
		System.out.println("");
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", colour=" + colour + "]";
	}

	

	}


