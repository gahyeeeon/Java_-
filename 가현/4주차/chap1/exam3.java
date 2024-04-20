package chap1;

import java.util.Arrays;

public class exam3 {
	
	class Printer {

	    public void print(String c, String... str) {
	        System.out.println("첫번째 메서드");
	        System.out.println("rest parameters : " + Arrays.toString(str));
	    }

	    public void print(String... str) {
	        System.out.println("두번째 메서드");
	    }
	}

	public class Main2 {
	    public static void main(String[] args) {
	        Printer p = new Printer();
	       
	        p.print("-", "1", "2", "3");
	    }
	}
}
