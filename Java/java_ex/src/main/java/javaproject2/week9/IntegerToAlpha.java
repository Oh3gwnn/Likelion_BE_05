package javaproject2.week9;

public class IntegerToAlpha {
    public String itoa(int value) {
        StringBuilder answerBuilder = new StringBuilder();

        // TODO 2: 음수 확인
        boolean negative = false;
        if (value < 0) {
            negative = true;
            value *= -1;
        }

        // TODO 1: value가 0보다 큰 동안
        while (value > 0) {
            // TODO 1-1: value를 10으로 나눈 나머지를 문자로 변환
            char digitChar = (char)(value % 10 + '0');
            answerBuilder.append(digitChar);

            // TODO 1-2: value / 10
            value /= 10;
        }

        if (negative) answerBuilder.append('-');
        // 1234를 저장하면 4321이 된다. 그래서 reverse() 적용
        return answerBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha itoa = new IntegerToAlpha();
        System.out.println(itoa.itoa(1234) + itoa.itoa(56789));
        System.out.println(itoa.itoa(-12345));
    }
}
