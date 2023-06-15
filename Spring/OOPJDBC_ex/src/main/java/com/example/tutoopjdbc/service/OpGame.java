package com.example.tutoopjdbc.service;

public class OpGame {
    int remainingAnswers;
    String CheeringUpMsg = "한번 더 해보자";
    IOperator op;

    public OpGame (IOperator op) {
        this.op = op;
    }

    public void makeQuestion() {
        remainingAnswers = 3;
        op.setA(1);
        op.setB(1);
    }

    public void makeQuestion(int max) {
        op.generateQuestion(max);
    }
    
    public String getQuestion() {
        return op.GetQuestionMsg();
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public String getCheeringUpMsg() {
        return CheeringUpMsg;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
        return op.isEquals(answer);
    }
}
