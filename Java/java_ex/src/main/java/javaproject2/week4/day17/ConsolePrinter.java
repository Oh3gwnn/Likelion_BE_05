package javaproject2.week4.day17;

public class ConsolePrinter implements Printer2 {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
