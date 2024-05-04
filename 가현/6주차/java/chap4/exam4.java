package chap4;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class exam4 {
	public static void main(String[] args) {

	    // int형을 String으로 타입 변환하는 함수 정의
	    Function<Integer, String> intToStr = t -> String.valueOf(t);
	    String str = intToStr.apply(100);

	    // String을 int형으로 타입 변환하는 함수 정의
	    ToIntFunction<String> strToInt = t -> Integer.parseInt(t);
	    int num = strToInt.applyAsInt("100");

	    // int형을 double형으로 타입 변환하는 함수 정의
	    IntToDoubleFunction intToDouble = t -> (double) t;
	    double d = intToDouble.applyAsDouble(100);
	}
}
