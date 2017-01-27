package com.giftservice.protocol.request;

import java.math.BigDecimal;

/**
 * Created by josemazzetti on 25/01/2017.
 */
public class AnswerRequest {

    private String sex;
    private Integer age;
    private String occasion;
    private BigDecimal money;


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
