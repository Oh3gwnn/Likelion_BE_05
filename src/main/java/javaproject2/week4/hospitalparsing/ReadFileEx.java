package javaproject2.week4.hospitalparsing;

import java.io.*;
import java.util.ArrayList;
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
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) hospitals.add(parse(line));
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(new ReaderFile());
//        rfe.SelcetReader(1, "hospital_info_2210.csv");
        List<String> strlines = rfe.getlines.BufferedReaderFile("hospital_info_2210.csv");
        List<Hospital> parsedhospital = rfe.getHospitals(strlines);
        for (int i = 0; i < 10; i++) {
            Hospital hospital = parsedhospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getAddress().getFullAddr(), hospital.getWebsiteAddr());
        }
    }
}
