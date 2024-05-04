package chap7;

import java.util.Arrays;
import java.util.Comparator;

import chap7.exam1.Apple;

public class exam2 {
	public class Main {

	    public static Comparator<Apple> comparingInt() {
	        // 람다식을 Comparator 인터페이스 타입으로 반환
	        return (a1, a2) -> Integer.compare(a1.getWeight(), a2.getWeight());
	    }

	    public static void main(String[] args) {
	        Apple[] inventory = new Apple[]{
	                new Apple(34),
	                new Apple(12),
	                new Apple(76),
	                new Apple(91),
	                new Apple(55)
	        };

	        Arrays.sort(inventory, comparingInt()); // 단순한 메서드 호출로 생략함 (가독성 ↑)
	        
	        System.out.println(Arrays.toString(inventory));
	    }
	}
}
