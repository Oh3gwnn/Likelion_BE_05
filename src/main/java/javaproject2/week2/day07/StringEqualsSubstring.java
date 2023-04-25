package javaproject2.week2.day07;

public class StringEqualsSubstring {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0, 1) == str2);
        // 결과는 false

        System.out.println("GOLD--> " + str1.hashCode());
        System.out.println("G--> " + str2.hashCode());
        // 이유는 해시(메모리 주소)가 다르다는 것

        boolean isSame = str1.substring(0, 1) == str2;
        System.out.println("isSame = " + isSame);
        isSame = str1.substring(0, 1).equals(str2);
        System.out.println("isSame = " + isSame);
        // ==, equals() 비교

        System.out.println("str1.substring(0, 1) 의 해시코드 = " + str1.substring(0, 1).hashCode());
        System.out.println("str2 의 해시코드 = " + str2.hashCode());
        // new: "G"(71) in Heap -> return String@71
    }
}
