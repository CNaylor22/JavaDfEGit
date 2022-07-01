package com.qa.solid.dependencyinversion;

public class BackendDeveloper implements Developer {
	
	 public void develop() {
	        writeJava();
	 }
	 public void writeJava() {
		 System.out.println("C# is just Microsoft Java anyway.");
	    }
}
