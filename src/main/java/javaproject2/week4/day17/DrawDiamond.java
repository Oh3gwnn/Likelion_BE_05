package javaproject2.week4.day17;

import java.io.FileWriter;
import java.io.IOException;

public class DrawDiamond {
    public static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    // repeat 사용 안하고 StringBuilder 사용(StringBuffer도 사용방법 비슷)
    public static String getStringBuilder(String symbol, int n) {
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }

    // 한 줄 출력(다시 만들어야 할 듯) 한 줄 출력이 아닌데?
    public static void makeALine(int h) {
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if(i <= pivot){
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                System.out.printf("%s%s\n", getStringBuilder(" ", i - pivot), getStringBuilder("*", 2 * (h - i) - 1));
            }
        }
    }

    // 파일 만들기 (FileWriter)
    public static void makeAFile(int h) throws IOException {
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
        int h = 7;
        makeALine(h);
        makeAFile(h);
    }
}
