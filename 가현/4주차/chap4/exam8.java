package chap4;

import java.lang.reflect.Method;

import chap4.exam6.Person;

public class exam8 {
	
	public static void main(String[] args) throws Exception {
	    Class<Person> personClass = (Class<Person>) Class.forName("Person");

	    // 특정 public 메서드 가져와 실행
	    // getMethod("메서드명", 매개변수타입들)
	    Method sum = personClass.getMethod("sum", int.class, int.class);
	    int result = (int) sum.invoke(new Person(), 10, 20);
	    System.out.println("result = " + result); // 30


	    // 특정 static 메서드 가져와 실행
	    Method staticSum = personClass.getMethod("staticSum", int.class, int.class);
	    int staticResult = (int) staticSum.invoke(null, 100, 200);
	    System.out.println("staticResult = " + staticResult); // 300


	    // 특정 private 메서드 가져와 실행
	    Method privateSum = personClass.getDeclaredMethod("privateSum", int.class, int.class);
	    privateSum.setAccessible(true); // private 이기 때문에 외부에서 access 할 수 있도록 설정
	    int privateResult = (int) privateSum.invoke(new Person(), 1000, 2000);
	    System.out.println("privateResult = " + privateResult); // 3000
	}

}
