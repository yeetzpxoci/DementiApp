package com.example.dementiapp;

public class OpenQuestion extends Question{
    private String answer;

    OpenQuestion(String answer){
        super(question, correct_answer);
        this.answer = answer;
    }
}
