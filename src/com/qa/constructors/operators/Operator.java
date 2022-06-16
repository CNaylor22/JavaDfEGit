package com.qa.constructors.operators;

public class Operator {

	public static void main(String[] args) {
	}
	public void Addition(int numOne, int numTwo) {
		System.out.println(numOne + numTwo);

	}

	public void Subtract(int numOne, int numTwo) {
		System.out.println(numOne - numTwo);
	}

	public void Divide(int numOne, int numTwo) {
		System.out.println(numOne / numTwo);
	
		if(numOne < numTwo ) {
            System.out.println("Cannot be performed");
        } else {
            System.out.println("Successful");
        }
	
	}

	public void Multiply(int numOne, int numTwo) {
		System.out.println(numOne * numTwo);

	}
}
//Calculator edited for task to do if else statement on Divide line