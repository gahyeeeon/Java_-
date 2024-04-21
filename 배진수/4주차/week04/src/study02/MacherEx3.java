package study02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacherEx3 {
    public static void main(String[] args) {
        String source = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
        String pattern = "백두산";

        Matcher matcher = Pattern.compile(pattern).matcher(source);

        while (matcher.find()) {
            // start()와 end()로 일치하는 부분의 위치를 알아낼 수 있다.
            System.out.println("매칭되는 문자열 위치 : " + matcher.start() + " ~ " + matcher.end());
        }
    }
}
