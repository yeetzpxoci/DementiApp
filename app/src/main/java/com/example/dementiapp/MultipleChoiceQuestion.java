package com.example.dementiapp;

public class MultipleChoiceQuestion extends Question{
    private String[] answers;

    MultipleChoiceQuestion(String[] answers){
        super(question, correct_answer);
        this.answers = answers;
    }
}
