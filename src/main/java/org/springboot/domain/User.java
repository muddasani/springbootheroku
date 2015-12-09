package org.springboot.domain;

public class User {

    private String requesterDetails;

  public User(String RequesterDetails) {
        this.requesterDetails = requesterDetails;
    }

    public String getRequesterDetails() {
        return requesterDetails;
    }

}
