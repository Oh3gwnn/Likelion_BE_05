package javaproject2.week4.hospitalparsing;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ReadFileEx {
    GetLines getlines;
    public ReadFileEx(GetLines getlines) { this.getlines = getlines; }

    public void PrintLines(List<String> lines) {
        for (int i = 0; i < 3; i++) System.out.println(lines.get(i));
    }

    // getlines Interface
    public void SelcetReader(int num, String fileName) throws IOException {
        switch (num) {
            case 1 -> PrintLines(getlines.BufferedReaderFile(fileName));
            case 2 -> PrintLines(getlines.BufferedReader2File(fileName));
            case 3 -> PrintLines(getlines.InputStreamReaderFile(fileName));
        }
    }

    public Hospital parse(String str) {
        System.out.println(str);
        String[] splitted = str.split(",");
        System.out.println(Arrays.toString(splitted));
        Address address = new Address();
        Hospital hospital = new Hospital("", "", address);

        return hospital;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(new ReaderFile());
        rfe.SelcetReader(1, "hospital_info_2210.csv");

        rfe.parse(rfe.getlines.BufferedReaderFile("hospital_info_2210.csv").get(2));
    }
}
