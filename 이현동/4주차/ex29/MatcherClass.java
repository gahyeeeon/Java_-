package ex29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {
        // 비교할 문자열
        String txt = "1487안녕";
        // 문자열 형태의 정규표현식 문법
        // 숫자로 시작하는 단어
        String patternString = "^[0-9]+";

        // 1) 문자열 형태의 정규표현식 문법을 정규식 패턴으로 변환
        Pattern pattern = Pattern.compile(patternString);

        // 2) 패턴 객체로 matcher 메서드를 통해 문자열을 검사하고 필터링된 결과를 매처 객체로 반환
        Matcher matcher = pattern.matcher(txt);

        // 3) 정규식 필터링된 결과를 담은 matcher 에서 메소드를 통해 결과를 출력
        System.out.println(matcher.find()); // 매칭된 결과가 있는지? : true
        System.out.println(matcher.group()); // 매칭된 부분을 반환 : 1487

        // 다중 결과값 출력
        String something = "hello987*-;hi66";

        // 문자열+숫자 조합인지
        Pattern p1 = Pattern.compile("[a-z]+[0-9]+");
        Matcher m1 = p1.matcher(something);
        while (m1.find()) {
            System.out.println(m1.group());
        }

        // 그룹핑 결과 출력
        String source = "011-4632-1290, 02-889-7661";
        String p2 = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";

        Matcher m2 = Pattern.compile(p2).matcher(source);

        int i = 0;
        while (m2.find()) {
            System.out.println(++i + ": " + m2.group() + " -> " + m2.group(1) + " " + m2.group(2) + " " + m2.group(3));
        }

        // 매칭 위치 출력
        source = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";

        Matcher matcher2 = Pattern.compile("백두산").matcher(source);

        while (matcher2.find()) {
            System.out.println(matcher2.start() + " ~ " + matcher2.end());
        }
    }
}


class RegExFlag {
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