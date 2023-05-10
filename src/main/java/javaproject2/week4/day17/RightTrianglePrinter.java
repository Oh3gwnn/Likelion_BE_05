package javaproject2.week4.day17;

import java.io.IOException;

public class RightTrianglePrinter {

    Printer printer;

    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    public void makeRightTriangle(int h) throws IOException {
        printer.printToConsole(printer.printShape(h));
        printer.printToFile(printer.printShape(h));
    }

        public static void main(String[] args) throws IOException {
        RightTrianglePrinter pd3 = new RightTrianglePrinter(new TrianglePrinter());
        pd3.makeRightTriangle(6);
    }
}