package javaproject2.week4.hospitalparsing;

import java.io.*;
import java.util.List;

public class ReadFileEx {
    GetLines getlines;
    public ReadFileEx(GetLines getlines) { this.getlines = getlines; }

    public void PrintFile(List<String> lines) {
        for (int i = 0; i < 3; i++) System.out.println(lines.get(i));
    }

    public void SelcetReader(int num, String fileName) throws IOException {
        switch (num) {
            case 1 -> PrintFile(getlines.BufferedReaderFile(fileName));
            case 2 -> PrintFile(getlines.BufferedReader2File(fileName));
            case 3 -> PrintFile(getlines.InputStreamReaderFile(fileName));
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(new ReaderFile());
        rfe.SelcetReader(1, "hospital_info_2210.csv");
        rfe.SelcetReader(2, "hospital_info_2210.csv");
        rfe.SelcetReader(3, "hospital_info_2210.csv");
    }
}
