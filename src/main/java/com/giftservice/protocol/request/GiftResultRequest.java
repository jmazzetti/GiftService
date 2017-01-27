package com.giftservice.protocol.request;

import com.giftservice.protocol.response.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josemazzetti on 25/01/2017.
 */
public class GiftResultRequest {

    List<Category> categories = new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
