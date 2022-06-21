package com.qa.oop;

public class Runner {

	public static void main(String[] args) {

//		Animal dog = new Animal("Bruce", "Tri", 7, 15.0);
//
//		System.out.println(dog.getName());
//		dog.setName("Bruno");
//
//		System.out.println(dog.getName());
	
		dog bob = new dog("Bruce", "Tri", 7, 15.0);
	System.out.println(bob.getAge());
	}

}