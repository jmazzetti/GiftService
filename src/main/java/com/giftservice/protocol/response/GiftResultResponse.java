package com.giftservice.protocol.response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josemazzetti on 27/01/2017.
 */
public class GiftResultResponse {

    private String result;
    List<AmazonDetail> amazonDetails = new ArrayList<>();

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<AmazonDetail> getAmazonDetails() {
        return amazonDetails;
    }

    public void setAmazonDetails(List<AmazonDetail> amazonDetails) {
        this.amazonDetails = amazonDetails;
    }
}
