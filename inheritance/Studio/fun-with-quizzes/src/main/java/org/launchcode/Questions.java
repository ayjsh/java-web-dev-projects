package org.launchcode;

public abstract class Questions {
    private String questions;
    private boolean isCorrect = false;
    private int pointValue;

    public Questions(String questions, int pointValue) {
        this.questions = questions;
        this.pointValue = pointValue;
    }

    public void displayQuestions() {
        System.out.println(this.questions);
    }

    abstract void displayAnswers();

    abstract int getCandidateAnswers();



    // Getters and Setters


    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }
}