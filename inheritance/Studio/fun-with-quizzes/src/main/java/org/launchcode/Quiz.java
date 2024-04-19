package org.launchcode;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Questions> quizQuestions = new ArrayList<>();
    private int score = 0;
    private int total = 0;


    public void runQuiz() {
        for (int i = 0; i < quizQuestions.size(); i++) {
            quizQuestions.get(i).displayQuestions();
            quizQuestions.get(i).displayAnswers();
            score += quizQuestions.get(i).getCandidateAnswers() * quizQuestions.get(i).getPointValue();
        }
    }

    public void /*ArrayList<Questions>*/ addQuestions(Questions aQuestion) {
        quizQuestions.add(aQuestion);
    }

    public void grade() {
        for (Questions question : quizQuestions){
            this.total += question.getPointValue();
        }


        System.out.println("Grade: " + score / total * 100);
    }

    // Getters and Setters

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
