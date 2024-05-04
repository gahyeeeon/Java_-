package chap3;

public class exam5 {
	// 함수형 인터페이스가 될 수 있다.
	interface IAdd {
	    int add(int x, int y);
	}

	// 함수형 인터페이스가 될수 없다.
	interface ICalculate {
	    int add(int x, int y);
	    int min(int x, int y);
	}

	// 구성요소가 많아도 결국 추상 메서드는 한개이기 때문에 함수형 인터페이스이다.
	interface IAdd {
	    int add(int x, int y);

	    final boolean isNumber = true; // final 상수
	    default void print() {}; // 디폴트 메서드
	    static void print2() {}; // static 메서드
	}
}
