package chap1;

import java.util.Arrays;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1, true, "홍길동", "이순신", "유성룡");
	}
	
	public static void print(int num, boolean bool, String... str) {
	    System.out.println("number : " + num);
	    System.out.println("bool : " + bool);
	    System.out.println("rest parameters : " + Arrays.toString(str));
	}

}
