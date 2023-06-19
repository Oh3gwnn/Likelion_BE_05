package javaproject2.week5.day23;

public class CorrectParenthesesSplitJoin {
    public static void main(String[] args) {
        String s = "(())()(";

        while (s.contains("()")) s = s.join("", s.split("\\(\\)"));
        if (s.isEmpty()) System.out.println(true);
        else System.out.println(false);
    }
}
