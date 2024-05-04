package chap3;

public class exam8 {
	interface IAdd {
	    int add(int x, int y);
	}

	public class Main {
	    public static void main(String[] args) {
	    	int n = result( (x, y) -> x + y ); // 메소드의 매개변수에 람다식을 전달
	        System.out.println(n); // 3
	    }
	    
	    public static int result(IAdd lambda) {
	    	return lambda.add(1,2);
	    }
	}
}
