package chap3;

public class exam4 {
	interface IAdd {
	    int add(int x, int y);
	}

	public class Main {
	    public static void main(String[] args) {
	        // 람다 표현식으로 함축 하기
	        IAdd lambda = (x, y) -> { return x + y; }; // 람다식 끝에 세미콜론을 잊지말자
	        
	        int result3 = lambda.add(1, 2);
	        System.out.println(result3);
	    }
	}
}
