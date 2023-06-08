package com.example.mvc.demo;

import java.util.Arrays;

public class JavaGit {
    public static void main(String[] args) {
        String cmd = args[0];
        switch (cmd) {
            case "add" -> {
                System.out.println("add changes to git:");
                for (String arg: Arrays.copyOfRange(args, 1, args.length)) System.out.println(arg);
            }
            case "commit" -> {
                if (!args[1].equals("-m")) System.out.println("no message specified");
                else {
                    System.out.printf("commit with message:");
                    for (String arg: Arrays.copyOfRange(args, 2, args.length)) System.out.printf(" %s", arg);
                }
            }
            default -> System.out.println("usage: add, commit");
        }
    }
}

/**
 * 1. JavaGit.java 라는 파일의 JavaGit 이라는 클래스의 main 메소드를 수정해서 만듭니다.
 * 2. 사용자는 java JavaGit 명령어를 이용해 이 프로그램을 사용한다고 가정합니다.
 * 3. java JavaGit add <임의의 문자열 입력> 을 실행하면 add changes to git: 이라는 출력 다음 줄 부터 <임의의 문자열 입력> 부분에 지정된 파일들을 한줄씩 출력합니다.
 * 4. java JavaGit commit -m "<임의의 문자열 입력>" 을 실행하면 commit with message: "<임의의 문자열 입력>" 이라고 출력합니다.
 * 5. java JavaGit commit 다음에 -m 이 없을경우, no message specified 라고 출력합니다.
 * 6. java JavaGit 을 추가 인자없이 실행할 경우 usage: add, commit 을 출력합니다.
 * 7. 입력은 제시된 조건을 만족하는 입력만 일어난다고 가정합니다.
 * 8. 이번 문제에 한정하여, 다른 메소드나 클래스를 작성하지 않고 코드를 작성합니다.
 * **/