package org.project.userapp.model;

public class Contact {
	
	private String type;
	private String number;
	/**
	 * @param type
	 * @param number
	 */
	public Contact(String type, String number) {
		super();
		this.type = type;
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

}
