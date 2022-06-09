package com.example.dementiapp;

public class OpenQuestion extends Question{
    private String answer;

    OpenQuestion(String question, String correct_answer, String answer){
        super(question, correct_answer);
        this.answer = answer;
    }
}
