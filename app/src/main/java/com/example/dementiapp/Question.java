package com.example.dementiapp;

public abstract class Question {
    private String question;
    private String correct_answer;

    public Question(String question, String correct_answer) {
        this.question = question;
        this.correct_answer = correct_answer;
    }
}
