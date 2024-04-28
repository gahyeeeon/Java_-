package chap2;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class exam5 {
	class MyArrayList<T> {
	    Object[] element = new Object[5];
	    int index = 0;

	    // 외부로부터 리스트를 받아와 매개변수의 모든 요소를 내부 배열에 추가하여 인스턴스화 하는 생성자
	    public MyArrayList(Collection<? extends T> in) {
	        for (T elem : in) {
	            element[index++] = elem;
	        }
	    }

	    // 외부로부터 리스트를 받아와 내부 배열의 요소를 모두 매개변수에 추가해주는 메서드
	    public void clone(Collection<? super T> out) {
	        for (Object elem : element) {
	            out.add((T) elem);
	        }
	    }

	    @Override
	    public String toString() {
	        return Arrays.toString(element); // 배열 요소들 출력
	    }
	}
	
	public static void main(String[] args) {
	    // MyArrayList의 제네릭 T 타입은 Number
	    MyArrayList<Number> list = new MyArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

	    // LinkedList 에 MyArrayList 요소들 복사하기
	    List<Object> temp = new LinkedList<>();
	    temp = list.clone(temp);

		// LinkedList 출력
	    System.out.println(temp); // [1, 2, 3, 4, 5]
	}
	
	
}
