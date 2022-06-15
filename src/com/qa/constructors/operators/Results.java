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
	System.out.println("Total: " + this.physics);
	}
}