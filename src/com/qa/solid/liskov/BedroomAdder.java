package com.qa.solid.liskov;

public class BedroomAdder {

	public void addBedroom(BedroomAddable apartment) {
		apartment.setNumberOfBedrooms(apartment.getNumberOfBedrooms() + 1 );
}
}