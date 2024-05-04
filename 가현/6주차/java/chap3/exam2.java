package chap3;

public class exam2 {
	interface IAdd {
	    int add(int x, int y);
	}

	class Add implements IAdd {
	    public int add(int x, int y) {
	        return x + y;
	    }
	}
	        
	public class Main {
	    public static void main(String[] args) {
	        // 생 클래스로 메소드 사용하기
	        Add a = new Add();
	        
	        int result1 = a.add(1, 2);
	        System.out.println(result1);
	    }
	}
}
