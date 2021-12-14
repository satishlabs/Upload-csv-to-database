package com.satishlabs.csv.dto;

public class AccountDetailsDTO {
	private int id;
	private int accountNumber;
	private String firstname;
	private String lastname;
	private String account_type;
	private String email;
	private String address;
	private String zipcode;
	
	
	public AccountDetailsDTO() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getAccount_type() {
		return account_type;
	}


	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
