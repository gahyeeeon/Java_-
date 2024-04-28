package chap2;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import chap2.exam2.MyArrayList;

public class exam3 {
	public static void main(String[] args) {
	    // MyArrayList의 제네릭 T 타입은 Number
	    MyArrayList<Number> list;

	    // MyArrayList 생성하기
	    Collection<Number> col = Arrays.asList(1, 2, 3, 4, 5);
	    list = new MyArrayList<>(col);

	    // LinkedList 에 MyArrayList 요소들 복사하기
	    List<Object> temp = new LinkedList<>();
	    temp = list.clone(temp); // ! ERROR

		// LinkedList 출력
	    System.out.println(temp);
	}
}
