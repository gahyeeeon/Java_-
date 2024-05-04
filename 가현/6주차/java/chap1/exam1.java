package chap1;

import java.io.Serializable;

public class exam1 {

	class Singleton implements Serializable {

	    // 생성자를 private로 선언 (외부에서 new 사용 X)
	    private Singleton() {
	    }

	    private static class SettingsHolder {
	        private static final Singleton INSTANCE = new Singleton();
	    }

	    public static Singleton getInstance() {
	        return SettingsHolder.INSTANCE;
	    }
	}
	
	public static void main(String[] args) {
	    Singleton singleton1 = Singleton.getInstance();
	    Singleton singleton2 = Singleton.getInstance();

	    System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
	    System.out.println(singleton1);
	    System.out.println(singleton2);
	}
}
