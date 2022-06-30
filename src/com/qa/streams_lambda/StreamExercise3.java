package com.qa.streams_lambda;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Stream;


public class StreamExercise3 {
	public static void main(String[] args) {
		
		List<Integer> myNumberList = new ArrayList<>(); 

		myNumberList.add(48);
		myNumberList.add(744);
		myNumberList.add(2);
		myNumberList.add(57);
		myNumberList.add(12);
		
	
		Stream<Integer> myNumberStream = myNumberList.stream();
		
//		int max = myNumberStream.max((i, j) -> i.compareTo(j)).get();
//		System.out.println(max);

		
		//	or	advanced option
		int max = myNumberStream.max(Integer::compare).get();
		System.out.println(max);
		
//		for min use .min in above
		
		
		
//
//		OptionalInt myNumberStream = myNumberList.stream().mapToInt(Integer::intValue).max();
//		System.out.println(" max value  :"  );
	
	
//	Question 4 removes odd numbers, keeps even
		
		myNumberStream.filter(num -> num % 2 ==0 ).forEach(num -> System.out.println(num));
		
//		keeps odd numbers
		myNumberStream.filter(num -> num % 2 !=0 ).forEach(num -> System.out.println(num));
	
//		Question 5
//		Sum of list of numbers
//		int sum = myNumberStream.mapToInt(Integer :: intValue).sum();
	
		int sum = myNumberStream.reduce((num1, num2) -> num1 + num2).get();
	System.out.println(sum);
	
//	
	
	myNumberStream.map(num -> (int)Math.pow(num, 2)).filter(num -> num % 2 != 0).min((num1, num2) -> Integer.compare(num1, num2));
	
	}
}
