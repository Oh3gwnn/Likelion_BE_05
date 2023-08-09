package javaproject2.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hanoi {

    private StringBuilder towerBuilder;


    public void solution() throws IOException {
        int n = Integer.parseInt(
                new BufferedReader(new InputStreamReader(System.in)).readLine());
        this.towerBuilder = new StringBuilder();
        this.towerBuilder
                .append((int) (Math.pow(2, n) - 1))
                .append("\n");
        hanoiMainMethod(2, 1,3, 2);
    }

    public void hanoiMainMethod(int height, int start, int end, int other) {
        if (height == 1) this.towerBuilder.append(start + " " + end + "\n");
        else {
            hanoiMainMethod(height -1, start, other, end);
            this.towerBuilder.append(start + " " + end + "\n");
            hanoiMainMethod(height -1, end, other, start);
        }
    }
    public static void main(String[] args) throws IOException {
        new hanoi().solution();
    }
}
