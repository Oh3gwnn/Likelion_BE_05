package javaproject2.week2.day08;

public class ReferenceTypeArray {

    public static void main(String[] args) {
        Student[] students = new Student[2]; // 배열의 초기화
        students[0] = new Student(); // Student 클래스의 초기화
        students[0].name = "형"; // Student 클래스 초기화 후 가능
        students[0].phoneNumber = "010-1234-5678";
        students[0].age = 20;
        students[1] = new Student();
        students[1].name = "택";
        students[1].phoneNumber = "010-4321-8765";
        students[1].age = 6;
    }
}
