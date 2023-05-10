package javaproject2.week4.day17;

import java.io.IOException;

public interface Printer {
    String makeALine(int h, int i);
    String[] printShape(int h);
    void printToFile(String[] lines) throws IOException;
    void printToConsole(String[] lines);
}
