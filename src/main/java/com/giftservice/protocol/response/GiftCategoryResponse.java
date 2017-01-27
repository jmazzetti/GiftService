package com.giftservice.protocol.response;

import java.util.List;

/**
 * Created by josemazzetti on 25/01/2017.
 */
public class GiftCategoryResponse {

    private String result;
    private List<Category> listCategory;

    public List<Category> getListCategory() {
        return listCategory;
    }

    public void setListCategory(List<Category> listCategory) {
        this.listCategory = listCategory;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
