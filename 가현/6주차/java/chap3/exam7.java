package chap3;

public class exam7 {

	interface IAdd {
	    int add(int x, int y);
	}

	public class Main {
	    public static void main(String[] args) {
	        IAdd lambda = (x, y) -> x + y; // 함수를 변수에 할당
	        lambda.add(1, 2); // 함수 사용
	    }
	}
	
	
}
