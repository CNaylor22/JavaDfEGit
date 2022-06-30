package com.qa.solid.singleresponsibility;

public class Mechanic {

	private String service;
	private String fix;
	private String modify;

	public Mechanic(String service, String fix, String modify) {
		super();
		this.service = service;
		this.fix = fix;
		this.modify = modify;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getFix() {
		return fix;
	}

	public void setFix(String fix) {
		this.fix = fix;
	}

	public String getModify() {
		return modify;
	}

	public void setModify(String modify) {
		this.modify = modify;
	}
}
