package com.giftservice.protocol.response;

/**
 * Created by josemazzetti on 09/02/2017.
 */
public class QuestionSex {

    private String typeSexM;
    private String typeSexF;
    private String typeSexO;

    public QuestionSex(String typeSexM, String typeSexF, String typeSexO) {
        this.typeSexM = typeSexM;
        this.typeSexF = typeSexF;
        this.typeSexO = typeSexO;
    }

    public String getTypeSexM() {
        return typeSexM;
    }

    public void setTypeSexM(String typeSexM) {
        this.typeSexM = typeSexM;
    }

    public String getTypeSexF() {
        return typeSexF;
    }

    public void setTypeSexF(String typeSexF) {
        this.typeSexF = typeSexF;
    }

    public String getTypeSexO() {
        return typeSexO;
    }

    public void setTypeSexO(String typeSexO) {
        this.typeSexO = typeSexO;
    }
}
