package org.springboot.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private String RequesterDetails;

	public User() {
	}

	public User(String RequesterDetails) {
		this.RequesterDetails = RequesterDetails;
	}

	@JsonProperty("RequesterDetails")
	public String getTheRequesterDetails() {
		return this.RequesterDetails;
	}

}
