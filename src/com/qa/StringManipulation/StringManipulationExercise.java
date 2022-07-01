package com.qa.stringmanipulation;

public class StringManipulationExercise {

	public void ExerciseOne() {

		String firstString = "yesterday it was raining";
		String secondString = "today it is sunny.";
		System.out.println(firstString.toUpperCase() + ", " + secondString.toUpperCase());
/////////////////////////
		String firstSubString = secondString.substring(0, 11);
		String secondSubString = firstString.substring(16, 24);
		System.out.println(firstSubString + secondSubString);

//	///////////////////////////	

//		String strExercise = "Hello, my name is Claire!";
//		
//		System.out.println (strExercise.word);
	}
}



