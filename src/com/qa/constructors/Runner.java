package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {

		Dog bruce = new Dog("Bruce", "Cocker Spaniel", 7);

		Dog marley = new Dog("Marley", "Border Collie", 9);

		System.out.println(bruce.name);
		System.out.println(bruce.breed);
		System.out.println(bruce.age);
		System.out.println();
		System.out.println(marley.name);
		System.out.println(marley.breed);
		System.out.println(marley.age);
	}
}
