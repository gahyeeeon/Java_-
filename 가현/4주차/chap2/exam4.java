package chap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
	
public class exam4 {
	public static void main(String[] args) {

        String something = "hello987*-;hi66"; // 비교할 문자열

        Pattern pattern = Pattern.compile("[a-z]+[0-9]+"); // 정규표현식 문자열로 패턴 객체 생성
        Matcher matcher = pattern.matcher(something); // 패턴 객체로 문자열을 필터링한뒤 그 결과값들을 담은 매처 객체 생성

        while (matcher.find()) {
            System.out.println(matcher.group());
            // 루프 1번 : hello987
            // 루프 2번 : hi66
        }
    }
}
