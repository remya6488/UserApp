package org.project.userapp.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "Users")
public class User {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String mailId;
	private List<Address> addresses;
	private List<Contact> contacts;
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param mailId
	 */
	public User(String id, String firstName, String lastName, String mailId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mailId = mailId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
