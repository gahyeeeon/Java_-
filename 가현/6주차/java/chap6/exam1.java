package chap6;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class exam1 {
	

	class Customer {
	    String name;
	    int age;

	    public Customer() {
	    }

	    public Customer(String name) {
	        this.name = name;
	    }

	    public Customer(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	}
	
	public static void main(String[] args) {
	    // 생성자 인자 없이 생성할때
	    Supplier<Customer> function1 = Customer::new;
	    Customer customer1 = function1.get();

	    // 생성자 인자 1개로만 생성할때 (입력타입, 생성자클래스)
	    Function<String, Customer> function2 = Customer::new;
	    Customer customer2 = function2.apply("홍길동");

	    // 생성자 인자 2개로만 생성할때 (입력타입1, 입력타입2, 생성자클래스)
	    BiFunction<String, Integer, Customer> function3 = Customer::new;
	    Customer customer3 = function3.apply("홍길동", 55);
	}
}
