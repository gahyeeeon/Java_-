package chap1;

public class exam8 {
	// 숫자만 받아 계산하는 계산기 클래스 모듈
	class Calculator<T> {
	    void add(T a, T b) {}
	    void min(T a, T b) {}
	    void mul(T a, T b) {}
	    void div(T a, T b) {}
	}

	public class Main {
	    public static void main(String[] args) {
	        // 제네릭에 아무 타입이나 모두 할당이 가능
	        Calculator<Number> cal1 = new Calculator<>();
	        Calculator<Object> cal2 = new Calculator<>();
	        Calculator<String> cal3 = new Calculator<>();
	        Calculator<Main> cal4 = new Calculator<>();
	    }
	}
}
