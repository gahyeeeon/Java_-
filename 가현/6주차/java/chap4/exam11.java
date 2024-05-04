package chap4;

import java.util.Arrays;
import java.util.List;

public class exam11 {
	public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

	    // 각 요소에 10을 곱함
	    list.replaceAll( (x) -> x * 10 );

	    // 리스트는 Iteratble을 상속하니까 사용이 가능
	    list.forEach( (x) -> System.out.println(x) );
	}
}
