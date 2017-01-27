package com.giftservice.protocol.request;

public class LoginRequest {

    private String authenticatedFacebookToken;


    public String getAuthenticatedFacebookToken() {
        return authenticatedFacebookToken;
    }

    public void setAuthenticatedFacebookToken(String authenticatedFacebookToken) {
        this.authenticatedFacebookToken = authenticatedFacebookToken;
    }
}
