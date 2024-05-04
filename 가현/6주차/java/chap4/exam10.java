package chap4;

import java.util.function.Predicate;

public class exam10 {
	public static void main(String[] args) {

	    Predicate<Integer> greater = x -> x > 10;
	    Predicate<Integer> less = x -> x < 20;

	    // x > 10 && x < 20
	    Predicate<Integer> between = greater.and(less); 
	    System.out.println(between.test(15)); // true

	    // x > 10 || x < 20
	    Predicate<Integer> all = greater.or(less); 
	    System.out.println(all.test(5)); // true

	    // x <= 10
	    Predicate<Integer> negate = greater.negate(); 
	    System.out.println(negate.test(50)); // false
	}
}
