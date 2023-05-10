package javaproject2.week4.day17;

import java.io.FileWriter;
import java.io.IOException;

// 추상 클래스
public abstract class ShapeDrawer2 {
    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf(makeALine(height, i));
        }
    }

    public void makeAFile(int h) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        int pivot = h / 2;

        for (int i = 0; i < h; i++) {
            if(i <= pivot){
                writer.write(getRepeatedSymbol(" ", -2 + h - i - 2) + getRepeatedSymbol("*", 2 * i + 1) + "\n");
            } else {
                writer.write(getStringBuilder(" ", i - pivot) + getStringBuilder("*", 2 * (h - i) - 1) + "\n");
            }
        }
        writer.close();
    }

    public String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public String getStringBuilder(String symbol, int n) {
        StringBuilder sb = new StringBuilder(); // StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }

    // 추상 메소드
    public abstract String makeALine(int h, int i);
}
