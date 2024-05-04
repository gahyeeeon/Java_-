package chap4;

public class exam2 {
	interface TripleConsumer<T, U, K> {
	    void accept(T t, U u, K k);
	}

	public class Main {
	    public static void main(String[] args) {

	        TripleConsumer<String, Double, Integer> c1 = (t, u, k) -> {
	        	System.out.printf("%s + %f + %d", t, u, k);
	        };
	        
	        c1.accept("안녕", 101.23, 999);
	    }
	}
}
