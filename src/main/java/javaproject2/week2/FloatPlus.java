package javaproject2.week2;

public class FloatPlus {
    public static void main(String[] args) {
        String val1 = "1.11111111";
        String val2 = "2.11111111";
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("float = " + result);

        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println("double = " + result2);

        // NumberFormatException 오류
//        String val3 = "1.5";
//        String val4 = "2.5";
//
//        int result3 = Integer.parseInt(val3) + Integer.parseInt(val4);
//        System.out.println("result = " + result3);
    }
}
