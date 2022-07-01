package com.qa.solid.liskov;

public class Studio {
	public Studio() {
		this.setNumberOfBedrooms(0);
	}

	private void setNumberOfBedrooms(int i) {

	}

	public void setSquareFootage(int sqft) {
		this.setSquareFootage(sqft);
	}
}
