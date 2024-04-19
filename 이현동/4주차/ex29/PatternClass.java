package ex29;

import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        // complie() 을 사용해서 정규식 패턴 객체 생성
        String patternSting = "^[0-9]*$";
        Pattern pattern = Pattern.compile(patternSting);

        // 샘플 문자열
        String txt1 = "123123";
        String txt2 = "123이것은숫자입니다00";

        boolean result = Pattern.matches("^[0-9]*$", txt1); // 첫번째 매개값은 정규표현식이고 두번째 매개값은 검증 대상 문자열
        System.out.println(result); // true

        boolean result2 = Pattern.matches("^[0-9]*$", txt2);
        System.out.println(result2); // false
    }
}
