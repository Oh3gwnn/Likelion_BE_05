package javaproject2.week4.day17;

import javaproject2.week4.day16.ShapeDrawer;
import java.io.FileWriter;
import java.io.IOException;

public class DrawDiamond extends ShapeDrawer {

    // 1. repeat() 사용
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    // 2. StringBuilder() 사용
    // (repeat() 사용 X, StringBuffer()도 사용 방법 비슷)
    public static String getStringBuilder(String symbol, int n) {
        StringBuilder sb = new StringBuilder(); // StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }

    // 3. 한 줄 출력(String 형식으로 리턴)
    // ShapeDrawer() 추상화 --> printShape() 사용 가능
    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;
        String str = "";
        if(i <= pivot){
            str = String.format("%s%s\n", getRepeatedSymbol(" ", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            str = String.format("%s%s\n", getStringBuilder(" ", i - pivot), getStringBuilder("*", 2 * (h - i) - 1));
        }
        return str;
    }

    // 4. 파일 만들기 (FileWriter() 사용)
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

    public static void main(String[] args) throws IOException {
        DrawDiamond dd = new DrawDiamond();
        dd.printShape(7);
        dd.makeAFile(7);
    }
}
