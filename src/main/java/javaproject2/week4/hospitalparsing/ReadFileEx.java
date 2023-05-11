package javaproject2.week4.hospitalparsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./hospital_info_2210.csv"));
        System.out.println(br.readLine());
    }
}
