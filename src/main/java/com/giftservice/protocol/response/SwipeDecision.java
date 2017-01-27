package com.giftservice.protocol.response;

/**
 * Created by josemazzetti on 27/01/2017.
 */
public class SwipeDecision {

    private String amazonID;
    private Boolean swipeDecision;


    public SwipeDecision(String amazonID, Boolean swipeDecision) {
        this.amazonID = amazonID;
        this.swipeDecision = swipeDecision;
    }

    public String getAmazonID() {
        return amazonID;
    }

    public void setAmazonID(String amazonID) {
        this.amazonID = amazonID;
    }

    public Boolean getSwipeDecision() {
        return swipeDecision;
    }

    public void setSwipeDecision(Boolean swipeDecision) {
        this.swipeDecision = swipeDecision;
    }
}
