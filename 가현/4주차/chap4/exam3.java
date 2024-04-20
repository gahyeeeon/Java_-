package chap4;

public class exam3 {
	
	public static void main(String[] args) {
	    try {
	        // 도메인.클래스명으로 얻기
	        Class<?> cls3 = Class.forName("java.lang.String");
	        System.out.println(cls3); // class java.lang.String
	        
	    } catch (ClassNotFoundException e) {}
	}

}
