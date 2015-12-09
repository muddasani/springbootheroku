package org.springboot.domain;

public class User {

    private String requesterDetails;

  public User(String requesterDetails) {
        this.requesterDetails = requesterDetails;
    }

    public String getRequesterDetails() {
        return this.requesterDetails;
    }

}
