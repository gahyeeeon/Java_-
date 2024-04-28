package chap1;

public class exam4 {
	class Sample<T> {
	    private T value; // 멤버 변수 val의 타입은 T 이다.

	    // T 타입의 값 val을 반환한다.
	    public T getValue() {
	        return value;
	    }

	    // T 타입의 값을 멤버 변수 val에 대입한다.
	    public void setValue(T value) {
	        this.value = value;
	    }
	}
	
	public static void main(String[] args) {
	    // 정수형을 다루는 제네릭 클래스
	    Sample<Integer> s1 = new Sample<>();
	    s1.setValue(1);

	    // 실수형을 다루는 제네릭 클래스
	    Sample<Double> s2 = new Sample<>();
	    s2.setValue(1.0);

	    // 문자열을 다루는 제네릭 클래스
	    Sample<String> s3 = new Sample<>();
	    s3.setValue("1");
	}
	
}
