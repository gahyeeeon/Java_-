package study02;

import java.util.regex.Pattern;

public class RegexEx1 {
    public static void main(String[] args) {
        // 문자열 형태의 정규표현식 문법을 정규식 패턴으로 변환
        String patternString = "^[0-9]*$";
        Pattern pattern = Pattern.compile(patternString); // Pattern 객체로 컴파일된 정규식은 뒤의 Matcher 클래스에서 사용된다

        // 샘플 문자열
        String txt1 = "123123";
        String txt2 = "123이것은숫자입니다00";

        boolean result = Pattern.matches("^[0-9]*$", txt1); // 첫번째 매개값은 정규표현식이고 두번째 매개값은 검증 대상 문자열
        System.out.println(result); // true

        boolean result2 = Pattern.matches("^[0-9]*$", txt2);
        System.out.println(result2); // false
    }
}
