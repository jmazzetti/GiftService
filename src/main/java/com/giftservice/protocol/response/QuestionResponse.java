package com.giftservice.protocol.response;

import java.util.List;


public class QuestionResponse {

    private List<Question> questions;

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
