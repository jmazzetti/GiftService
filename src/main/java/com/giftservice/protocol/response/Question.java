package com.giftservice.protocol.response;

/**
 * Created by josemazzetti on 25/01/2017.
 */
public class Question {


    private Integer id;
    private String label;
    private String category;
    private String input;
    private QuestionValue values;

    public Question(Integer id, String label, String category, String input, QuestionValue values) {
        this.id = id;
        this.label = label;
        this.category = category;
        this.input = input;
        this.values = values;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public QuestionValue getValues() {
        return values;
    }

    public void setValues(QuestionValue values) {
        this.values = values;
    }

}
