package com.giftservice.protocol.response;

import java.math.BigDecimal;

/**
 * Created by josemazzetti on 25/01/2017.
 */
public class Question {

    private String sex;
    private Integer age;
    private String purpose;
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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
