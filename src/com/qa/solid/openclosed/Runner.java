package com.qa.solid.openclosed;

public class Runner {

	public static void main(String[] args) {

	Greeter greeter = new Greeter();
	
	
	
	
	greeter.setGreetingType("casual");
	System.out.println(greeter.greet());
	}
}