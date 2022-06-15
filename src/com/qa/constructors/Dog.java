package com.qa.constructors;

public class Dog {
	
	public String name;
	public String breed;
	public int age;

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public Dog(String name, int age) {
	this.name = name;
	this.age = age;
	}
}