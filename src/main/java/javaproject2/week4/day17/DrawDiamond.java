package javaproject2.week4.day17;

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

    public static void main(String[] args) {
        int h = 7;
        int pivot = h / 2;
        for (int i = 0; i < h; i++) {
            if(i <= pivot){
                System.out.printf("%s%s\n", getRepeatedSymbol("0", -2 + h - i - 2), getRepeatedSymbol("*", 2 * i + 1));
            } else {
                System.out.printf("%s%s\n", getStringBuilder("0", i - pivot), getStringBuilder("*", 2 * (h - i) - 1));
            }
        }
    }
}
