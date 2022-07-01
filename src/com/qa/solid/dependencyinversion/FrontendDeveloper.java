package com.qa.solid.dependencyinversion;

public class FrontendDeveloper implements Developer {

	public void develop(){
       writeJavaScript();
	}
		public void writeJavaScript() {
		System.out.println("JavaScript is used everywhere anyway.");
    }
}
