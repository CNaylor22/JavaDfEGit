package com.qa.solid.singleresponsibility;

public class Modification {

	private String modcolour;
	private String modinterior;
	private int modenginesize;
	public Modification(String modcolour, String modinterior, int modenginesize) {
		super();
		this.modcolour = modcolour;
		this.modinterior = modinterior;
		this.modenginesize = modenginesize;
	}
	public String getModcolour() {
		return modcolour;
	}
	public void setModcolour(String modcolour) {
		this.modcolour = modcolour;
	}
	public String getModinterior() {
		return modinterior;
	}
	public void setModinterior(String modinterior) {
		this.modinterior = modinterior;
	}
	public int getModenginesize() {
		return modenginesize;
	}
	public void setModenginesize(int modenginesize) {
		this.modenginesize = modenginesize;
	}
	
	
}
