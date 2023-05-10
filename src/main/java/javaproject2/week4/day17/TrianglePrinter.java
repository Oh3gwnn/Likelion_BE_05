package javaproject2.week4.day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TrianglePrinter implements Printer {

    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h), "*".repeat(i));
    }

    public String[] printShape(int h) {
        // 모양 만들기
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h - i - 1, i + 1);
        }
        return lines;
    }

    public void printToFile(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./RightTriangle.txt"));
        for (int i = 0; i < lines.length; i++) {
            bw.append(lines[i]);
            bw.flush();
        }
        bw.close();
    }

    public void printToConsole(String[] lines) {
        for (int i = 0; i < lines.length; i++) {
            System.out.print(lines[i]);
        }
    }

}
