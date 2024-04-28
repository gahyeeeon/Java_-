package chap1;

import java.util.Collection;

public class exam9 {
	class Compare {
		// 외부로 들어온 타입 E는 Comparable<E>를 구현한 E 객체 이어야 한다.
	    public static <E extends Comparable<E>> E max(Collection<E> collection) {
	        if(collection.isEmpty()) throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

	        E result = null;
	        for(E e: collection) {
	            if(result == null) {
	                result = e;
	                continue;
	            }

	            if(e.compareTo(result) > 0) {
	                result = e;
	            }
	        }

	        return result;
	    }
	}
	
	public static void main(String[] args) {
	    Collection<Integer> list = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
	    System.out.println(Compare.max(list)); // 91
	    
	    Collection<Number> list2 = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
	    System.out.println(Compare.max(list2)); // ! Error - Number 추상 메서드는 Comparable를 구현하지않았기 때문에 불가능
	}
}
