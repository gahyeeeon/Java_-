package chap3;

public class exam3 {
	interface IAdd {
	    int add(int x, int y);
	}

	public class Main {
	    public static void main(String[] args) {
	        // 익명 클래스로 정의해 사용하기 (일회용)
	        Iadd a = new IAdd() {
	            public int add(int x, int y) {
	                return x + y;
	            }
	        };
	        
	        int result2 = a.add(1, 2);
	        System.out.println(result2);
	    }
	}
}
