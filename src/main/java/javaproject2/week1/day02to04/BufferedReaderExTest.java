package javaproject2.week1.day02to04;

import java.io.IOException;

public class BufferedReaderExTest {
    public static void main(String[] args) throws IOException {
        BufferedReaderEx bufferedReaderEx = new BufferedReaderEx();
        bufferedReaderEx.readALine();
        // 100+200 을 '1', '0'의 아스키 코드를 읽어와 합을 구해버림(97)
        // bufferedReaderEx.plusTwoNumbers();
    }
}
