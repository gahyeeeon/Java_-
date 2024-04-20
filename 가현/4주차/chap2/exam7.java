package chap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam7 {

	public static void main(String[] args) {
        // 개행 문자가 들어간 비교할 문자열
        String txt = "this\nis\ntest\n";

        // . 기호는 모든 문자를 포함하지만 개행 문자는 포함하지 않기 때문에 일치하는 검색 결과가 없음
        Matcher matcher1 = Pattern.compile("(^.*$)").matcher(txt);
        System.out.println(matcher1.find()); // false


        // . 기호가 개행 문자까지 포함하도록
        Matcher matcher2 = Pattern.compile("(?s)(^.*$)").matcher(txt);
        while (matcher2.find()) {
            System.out.println(matcher2.group()); // this, is, test
        }


        // 다중 행 모드로 각 행마다 정규식 검사
        Matcher matcher3 = Pattern.compile("(?m)(^.*$)").matcher(txt);
        while (matcher3.find()) {
            System.out.println(matcher3.group()); // this, is, test
        }


        // 대소문자 구분 X
        Matcher matcher4 = Pattern.compile("(?i)([a-z]+)").matcher("HelloWorld"); // 정규식 기호로 전달
        Matcher matcher5 = Pattern.compile("(^.*$)", Pattern.CASE_INSENSITIVE).matcher("HelloWorld"); // 상수로 전달
        while (matcher5.find()) {
            System.out.println(matcher5.group()); // HelloWorld
        }
    }
}
