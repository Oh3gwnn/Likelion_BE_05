package com.example.tutoopjdbc.service;

public interface IOperator {
    void setA(int a);
    void setB(int b);
    void generateQuestion(int max);
    String GetQuestionMsg();
    boolean isEquals(int answer);
}
