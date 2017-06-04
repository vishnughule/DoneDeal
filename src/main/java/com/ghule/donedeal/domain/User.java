package com.ghule.donedeal.domain;

public class User {

	private Integer id;

	private String userName;

	private String firstName;

	private String lastName;

	private String email;

	private Integer zipCode;

	private CommonRowDetails commonRowDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public CommonRowDetails getCommonRowDetails() {
		return commonRowDetails;
	}

	public void setCommonRowDetails(CommonRowDetails commonRowDetails) {
		this.commonRowDetails = commonRowDetails;
	}

}
