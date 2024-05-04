package chap3;

public class exam9 {
	interface IAdd {
	    int add(int x, int y);
	}

	public class Main {
	    public static void main(String[] args) {
	        IAdd func = makeFunction(); // 메소드의 반환값이 람다 함수
	        int result = func.add(1, 2);
	        System.out.println(result); // 3
	    }

	    public static IAdd makeFunction() {
	        return (x, y) -> x + y;
	    }
	}
}
