package chap1;

import java.io.Serializable;

public class exam3 {
	class Singleton implements Serializable {

	    private Singleton() {}

	    private static class SettingsHolder {
	        private static final Singleton INSTANCE = new Singleton();
	    }

	    public static Singleton getInstance() {
	        return SettingsHolder.INSTANCE;
	    }

	    // 역직렬화한 객체는 무시하고 클래스 초기화 때 만들어진 인스턴스를 반환
	    private Object readResolve() {
	        return SettingsHolder.INSTANCE;
	    }
	}
}
