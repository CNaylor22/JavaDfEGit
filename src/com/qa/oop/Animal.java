package com.qa.oop;

public class Animal {

	private String name;
	private String colour;
	private int age;
	private double weight;
// generate constructor > Right Click Source> Generate
	public Animal(String name, String colour, int age, double weight) {
		super();
		this.name = name;
		this.colour = colour;
		this.age = age;
		this.weight = weight;

	}
// getters and setters > Right Click> Source > Generate
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
