package com.giftservice.protocol.request;

import com.giftservice.protocol.response.SwipeDecision;

import java.util.List;

/**
 * Created by josemazzetti on 25/01/2017.
 */
public class SwipeRequest {

    private List<SwipeDecision> swipeDecisionList;

    public List<SwipeDecision> getSwipeDecisionList() {
        return swipeDecisionList;
    }

    public void setSwipeDecisionList(List<SwipeDecision> swipeDecisionList) {
        this.swipeDecisionList = swipeDecisionList;
    }
}
