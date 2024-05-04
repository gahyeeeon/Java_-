package chap2;

public class exam1 {
	class Hello {
	    public void sayHello() {
	        System.out.println("hello object");
	    }

	    public static void sayHelloStatic() {
	        System.out.println("hello static");
	    }
	}

	Hello h = null; // Hello 객체 변수에 null을 참조

	h.sayHello(); // ERROR !!!
	h.sayHelloStatic(); // 레퍼런스가 null이지만 에러가 발생하지 않는다. (실행은 되고 경고만 뜬다)
}
