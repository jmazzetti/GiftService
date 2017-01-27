package com.giftservice.protocol.request;

/**
 * Created by josemazzetti on 25/01/2017.
 */
public class FlagGiftCategoryRequest {

    private Integer id;
    private Boolean flag;

    public FlagGiftCategoryRequest() {
    }

    public FlagGiftCategoryRequest(Integer id, Boolean flag) {
        this.id = id;
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}
