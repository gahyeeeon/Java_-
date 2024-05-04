package chap3;

public class exam1 {
	interface MyFunction {
		void print(String str);
	}

	public class Main {
	    public static void main(String[] args) {
	        MyFunction myfunc = (str) -> System.out.println(str);
	        myfunc.print("Hello World");
	    }
	}
}
