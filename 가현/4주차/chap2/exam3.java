package chap2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exam3 {
	public static void main(String[] args) {
		// 비교할 문자열
	    String txt = "1487안녕";

	    // 문자열 형태의 정규표현식 문법
	    String patternString = "^[0-9]+";

	    // 1) 문자열 형태의 정규표현식 문법을 정규식 패턴으로 변환
	    Pattern pattern = Pattern.compile(patternString); 
	        
	    // 2) 패턴 객체로 matcher 메서드를 통해 문자열을 검사하고 필터링된 결과를 매처 객체로 반환
	    Matcher matcher = pattern.matcher(txt);           

	    // 3) 정규식 필터링된 결과를 담은 matcher에서 메소드를 통해 결과를 출력
	    System.out.println(matcher.find()); // 매칭된 결과가 있는지? : true
	    System.out.println(matcher.group()); // 매칭된 부분을 반환 : 1487
	    }
	}