package com.qa.streams_lambda;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Stream;

public class StreamExercise2 {

	public static void main(String[] args) {
		    
			
			
			List<Integer> myNumberList = new ArrayList<>(); 

			myNumberList.add(3);
			myNumberList.add(4);
			myNumberList.add(7);
			myNumberList.add(8);
			myNumberList.add(12);
	
			Stream<Integer> myNumberStream = myNumberList.stream();
	
			int sum = myNumberStream.reduce((num1, num2) -> num1 * num2).get();
			System.out.println(sum);
			
	}
}