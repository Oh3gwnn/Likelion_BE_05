package com.example.tutoopjdbc.service;

public class OpGame {
    int remainingAnswers;
    int a, b;
    String CheeringUpMsg = "한번 더 해보자";
    IOperator op;

    public OpGame (IOperator op) {
        this.op = op;
    }

    public void makeQuestion() {
        remainingAnswers = 3;
//        a = 1;
//        b = 1;
        op.setA(1);
        op.setB(1);
    }

    public void makeQuestion(int max) {
//        int a = (int)(Math.random() * max);
//        int b = (int)(Math.random() * (max - a));
        op.generateQuestion(max);
    }
    
    public String getQuestion() {
//        return String.format("%d + %d = ", a, b);
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
//        return (a + b) == answer;
        return op.isEquals(answer);
    }
}
