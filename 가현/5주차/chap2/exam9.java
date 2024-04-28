package chap2;

import java.util.ArrayList;
import java.util.List;

public class exam9 {
	class Sample<T> {
	    public static <E> void run(List<? super E> l) {}
	}

	public class Main {
	    public static void main(String[] args) {
	        Sample<?> s2= new Sample<String>();
	        
	        Sample<? extends Number> s1 = new Sample<Integer>();
	        
	        Sample.run(new ArrayList<>());
	    }
	}
}
