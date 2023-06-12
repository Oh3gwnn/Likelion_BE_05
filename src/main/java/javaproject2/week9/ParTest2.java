package javaproject2.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 소괄호, 중괄호, 대괄호로 이루어진 수식을 검사하는 코드를 작성하시오.
public class ParTest2 {
    public boolean solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);

            if ("({[".contains(String.valueOf(next))) charStack.push(next);
            else if (")}]".contains(String.valueOf(next))) {
                if (charStack.empty()) return false;
                char top = charStack.pop();
                if (")}]".contains(String.valueOf(top))) return false;
            }
        }
        return charStack.empty();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new ParTest2().solution());
    }
}

