package org.springboot.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private String RequesterDetails;
	
	private String EmailOut;

	public User() {
	}

	public User(String RequesterDetails, String EmailOut) {
		this.RequesterDetails = RequesterDetails;
		this.EmailOut = EmailOut;
	}

	@JsonProperty("RequesterDetails")
	public String getTheRequesterDetails() {
		return this.RequesterDetails;
	}

	@JsonProperty("EmailOut")
	public String getEmailOut() {
		return this.EmailOut;
	}
	
}
