package com.qa.constructors.operators;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
//yellow line is warning you haven't closed scanner example= scanner.close();
		Scanner scan = new Scanner(System.in); 

		boolean flag = true;

		while (flag) {

			System.out.println(" Please enter a Calculator method : ");
			
//			String Addition = scan.nextLine();
			scan.nextLine();

			Calculator calc = new Calculator();

			calc.Addition(4, 7);
			calc.Subtract(25, 12);
			calc.Divide(4, 28);
			calc.Multiply(9, 6);
//		Closed to clear error
		scan.close();
		}
	}
}
