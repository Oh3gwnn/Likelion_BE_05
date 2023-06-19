package javaproject2.week9;

public class AlphaToInteger {
    // 숫자로만 이루어진 Value 문자열에 대해 각 글자를
    // 숫제 데이터로 해석한 뒤 -48하면 숫자가 된다.

    public int atoi(String value) {
        int result = 0;

        // TODO: 첫 번째 문자를 사전에 확인('-'인지 아닌지 체크)
        boolean negative = false;
        int i = 0;                              // 첫 번째 문자가 '-'인지?
        negative = value.charAt(i++) == '-';    // 해당 bool 값 저장

        // TODO: 문자열을 한 자리씩 확인
        for (; i < value.length(); i++) {
            // TODO: 자릿수 변환
            result *= 10;

            // TODO: 글자를 숫자로 변환
            result += value.charAt(i) - 48; // '0' == 48
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        AlphaToInteger atoi = new AlphaToInteger();
        System.out.println(atoi.atoi("12345"));
        System.out.println(atoi.atoi("-4291"));
    }
}
