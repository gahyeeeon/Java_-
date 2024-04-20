package chap2;

import java.util.regex.PatternSyntaxException;

public class exam8 {
	public static void main(String[] args) {
        try {
            String txt = "power987*-;";
            String[] splitStr = txt.split("+"); // 오류 문법
        } catch (PatternSyntaxException e) {
            e.printStackTrace();
        }
    }
}
