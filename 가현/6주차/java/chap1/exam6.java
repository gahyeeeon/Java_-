package chap1;

public class exam6 {
	enum Singleton {
	    INSTANCE; // 싱글톤 인스턴스

	    // 이넘은 필드와 메서드도 가질 수 있다
	    private int value = 3;

	    public int getValue() {
	        return value;
	    }
	}
	
	public static void main(String[] args) {
	    Singleton singleton1 = Singleton.INSTANCE;
	    Singleton singleton2 = Singleton.INSTANCE;

	    System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
	    System.out.println(singleton1.hashCode());
	    System.out.println(singleton2.hashCode());

	    System.out.println(singleton1.getValue());
	}
}
