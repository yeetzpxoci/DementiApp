package com.example.dementiapp;

public class MultipleChoiceQuestion extends Question{
    private String[] answers;

    MultipleChoiceQuestion(String question, String correct_answer,String[] answers){
        super(question, correct_answer);
        this.answers = answers;
    }
}
