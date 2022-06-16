package com.qa.constructors.operators;

public class Results {

	public int physics;
	public int chemistry;
	public int biology;
	public int total;
	public int percentage;

	public Results(int physics, int chemistry, int biology) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
		this.total = physics + chemistry + biology;
	}

	public void methodOne() {
		System.out.println("Physics: " + this.physics);
		System.out.println("Chemistry: " + this.chemistry);
		System.out.println("Biology: " + this.biology);
		System.out.println("Total: " + this.total);
		System.out.println();
	}

	public void methodTwo() {
		this.percentage = (total * 100) / 450;
		System.out.println("Percentage: " + this.percentage + "%");

		if (percentage <= 60) {
			System.out.println("Sorry, you haven't passed .");
		} else {
			System.out.println("Congratulations, you've passed!");
		}

		
		
		
	}

}
//Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.

//eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84

//they would have an overall grade of 85.3% (Pass)

//but in this case the student would fail because their physics grade is 54% (Fail)
