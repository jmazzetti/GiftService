package com.giftservice.protocol.response;

/**
 * Created by josemazzetti on 27/01/2017.
 */
public class AmazonDetail {

    private int id;
    private String amazonId;
    private String imageURL;
    private Integer price;
    private String amazonUrl;

    public AmazonDetail(int id, String amazonId, String imageURL, Integer price, String amazonUrl) {
        this.id = id;
        this.amazonId = amazonId;
        this.imageURL = imageURL;
        this.price = price;
        this.amazonUrl = amazonUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmazonId() {
        return amazonId;
    }

    public void setAmazonId(String amazonId) {
        this.amazonId = amazonId;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAmazonUrl() {
        return amazonUrl;
    }

    public void setAmazonUrl(String amazonUrl) {
        this.amazonUrl = amazonUrl;
    }
}
