package com.example.tutoopjdbc.service;

public class PlusOperatorLevelOne implements IOperator {
    int a, b;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void generateQuestion(int max) {
        a = (int)(Math.random() * max);
        b = (int)(Math.random() * (max - a));
    }

    @Override
    public String GetQuestionMsg() {
        return String.format("%d + %d = ", a, b);
    }

    @Override
    public boolean isEquals(int answer) {
        return (a + b) == answer;
    }
}
