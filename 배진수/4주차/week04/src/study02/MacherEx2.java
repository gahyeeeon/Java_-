package study02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MacherEx2 {
    public static void main(String[] args) {
        String source = "011-4632-1290, 02-889-7661";
        String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";

        Matcher matcher = Pattern.compile(pattern).matcher(source); // 한방에 매처 객체 반환

        System.out.println("그룹의 개수 : " + matcher.groupCount());    //그룹화된 개수가 몇개인지 출력

        int i = 0;
        while (matcher.find()) {
            System.out.println(++i + ": " + matcher.group() + " -> " + matcher.group(1) + " 와 " + matcher.group(2) + " 와 " + matcher.group(3));
        }
    }
}
