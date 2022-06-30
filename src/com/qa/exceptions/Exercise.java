package com.qa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {

	public void divisionQuestion() {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Please enter two integers: ");

		int numberOne = 0;
		int numberTwo = 0;

		try {
			numberOne = scanner.nextInt();
			numberTwo = scanner.nextInt();
			System.out.println(numberOne / numberTwo);
		} catch (InputMismatchException ime) {
			System.out.println("You have not entered an integer");
		} catch (ArithmeticException ae) {
//			 ae.printStackTrace
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			e.printStackTrace();

			scanner.close();
		}
	}
}