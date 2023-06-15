package javaproject2.week6.day28;

import java.time.LocalDateTime;

public class MyExeption extends Exception {
    public MyExeption() {
        super("error");
    }

    public MyExeption(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try{
            throwException();
        }catch (MyExeption e) {
            // souf보다 -> log로 남기는게 좋다. 권장 그 이상
            System.out.println(LocalDateTime.now());
            System.out.println(e.getMessage());
        }
    }
    public static void throwException() throws MyExeption {
//        throw new MyExeption();
        throw new MyExeption("사용자 정의 예외 발생");
    }
}
