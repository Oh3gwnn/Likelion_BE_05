package javaproject2.week1.day1to4;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readTwoChar() throws IOException {
        InputStreamReader is;
        is = new InputStreamReader(System.in);
        int asciiCode1 = is.read();
        int asciiCode2 = is.read();
        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }
}
