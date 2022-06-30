package com.qa.streams_lambda;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Stream;

public class StreamExercise {

	public static void main(String[] args) {

		List<String> myNameList = new ArrayList<>();

		myNameList.add("Michael");
		myNameList.add("Dean");
		myNameList.add("James");
		myNameList.add("Chris");

		Stream<String> myNameStream = myNameList.stream();
		myNameStream.filter(name -> !name.contains("J")).forEach(name -> System.out.println("Hello" + " " + name));
//or		myNameStream.filter(name -> !name.equals("James")).forEach(name -> System.out.println("Hello" + " " + name));
		
	}
}
