package javaproject2.codeup.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() { return code; }
    public int getTestId() { return testId; }
    public String getName() { return name; }
}

public class Q3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    private boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    private void addAStudent(Student student) {
        if (!isExist(student)) students.add(student);
    }

    private void deleteStudent(Student pstudent) {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getTestId() == pstudent.getTestId()) students.remove(i);
        }
    }

    public void process(String line) {
        String[] input = line.split(" ");
        Student student = makeAStudent(input[0], Integer.parseInt(input[1]), input[2]);
        switch (student.getCode()) {
            case "I" -> addAStudent(student);
            case "D" -> deleteStudent(student);
        }
    }

    private void printSpecificStudents(int[] arr) {
        Collections.sort(students, Comparator.comparingInt(Student::getTestId));
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) throws IOException {
        Q3108 q3108 = new Q3108();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) q3108.process(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] select = Stream.of(s).mapToInt(Integer::parseInt).toArray();
        q3108.printSpecificStudents(select);
    }
}