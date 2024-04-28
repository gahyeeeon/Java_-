package chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exam10 {

	List<? extends Object> list = new ArrayList<String>();

	List<? super String> list2 = new ArrayList<Object>();
	
	public static void main(String[] args) {
	    List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
	    print(lists); // OK
	}

	// Number와 그 하위 타입(Integer, Double 등) 만을 받는다
	public static void print(List<? extends Number> list) {
	    for (Object e : list) {
	        System.out.println(e);
	    }
	}
}
