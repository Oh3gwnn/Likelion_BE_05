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

    public static void main(String[] args) throws IOException {
        // 파일 만들기 (FileWriter)
        FileWriter writer = new FileWriter("output.txt");
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if(i <= pivot){
                System.out.printf("%s%s\n", getRepeatedSymbol("0", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
                writer.write(getRepeatedSymbol("0", -2 + h - i - 2) + getRepeatedSymbol("*", 2 * i + 1) + "\n");
            } else {
                System.out.printf("%s%s\n", getStringBuilder("0", i - pivot), getStringBuilder("*", 2 * (h - i) - 1));
                writer.write(getStringBuilder("0", i - pivot) + getStringBuilder("*", 2 * (h - i) - 1) + "\n");
            }
        }
        writer.close();
    }
}
