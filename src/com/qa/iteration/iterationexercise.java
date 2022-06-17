//package com.qa.iteration;
//
//public class iterationexercise {
//	public static void main(String[] args) {
//		for (int a = 100; a < 200; a++) {
//			System.out.println("This is line" + (" ") + a);
//		}
//	}
//}

//package com.qa.iteration;
//
//public class iterationexercise {
//	public static void main(String[] args) {
//		int loopCount = 0;
//		boolean notEnoughLoops = true;
//
//		while (notEnoughLoops) {
//			System.out.println("Another loop");
//			loopCount++;
//
//			if (loopCount > 273) {
//				notEnoughLoops = false;
//			}
//		}
//
//		System.out.println("There's too many loops, Argh!!!!");
//	}
//
//



package com.qa.iteration;

public class iterationexercise {
	public static void main(String[] args) {
		for (int a = 100; a <= 200; a++) {

			if (a % 2 == 0) {
				System.out.println(a + "-");
			} else {
				System.out.println(a + "*");
			}

		}
	}

}
