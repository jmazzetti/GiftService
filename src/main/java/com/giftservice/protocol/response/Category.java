package com.giftservice.protocol.response;

/**
 * Created by josemazzetti on 27/01/2017.
 */
public class Category {

    private int id;
    private String categoryName;
    private String url;
    private boolean flag;

    public Category(int id, String categoryName, String url) {
        this.id = id;
        this.categoryName = categoryName;
        this.url = url;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
