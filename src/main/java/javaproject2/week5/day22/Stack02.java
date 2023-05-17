package javaproject2.week5.day22;

import java.util.Stack; // 그냥 Stack 클래스 가져다가 썼습니다.

public class Stack02 {
    private boolean isNumber(char c) {
        return ('0' <= c && c <= '9');
    }

    private int priOpr(char operater) {
        int priority = 0;
        switch (operater) {
            case '*', '/', '%' -> priority = 1;
            case '+', '-' -> priority = 0;
        } return priority;
    }

    public String toPostfix(String infix) {
        Stack<Character> s = new Stack<>(); // 연산자
        String postfix = "";                // 피연산자 + 처리된 연산자

        for (char c : infix.toCharArray()) {
            // 1. '('
//            System.out.printf("%s\n", postfix); // 확인용
            if (c == '(') s.add(c);

            // 2. ')'
            else if (c == ')') {
                while (s.peek() != '(') postfix += s.pop();
                s.pop();
            }

            // 3. 0~9
            else if (isNumber(c)) postfix += c;

            // 4. 연산자
            else {
                while (!s.isEmpty() && priOpr(c) < priOpr(s.peek())) {
                    postfix += s.pop();
                }
//                postfix += ' '; //숫자 자리 구분용
                s.add(c);
            }
        }
        while (!s.isEmpty()) {
            postfix += s.pop();
        }

        return postfix;
    }


    public static void main(String[] args) {
        Stack02 st = new Stack02();
        String infix = "(5*7)-((3*(3+7)-5/3)/(6+2)+3)";
        String postfix = st.toPostfix(infix);
        System.out.println(postfix);
        // 숫자 많이나오면 작동이 이상하게되는데 나중에 시간나면하고...
    }
}
