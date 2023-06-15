package javaproject2.week4.day17;

import java.io.IOException;

public class DrawDiamond extends ShapeDrawer2 {

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

    public static void main(String[] args) throws IOException {
        DrawDiamond dd = new DrawDiamond();
        dd.printShape(7);
        dd.makeAFile(7, "Diamond");
    }
}
