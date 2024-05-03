package ex37;

import java.io.Serializable;
import java.util.ArrayList;

// 싱글톤 + 직렬화
class Singleton implements Serializable {
    // 싱글톤 객체의 필드들을 transient 설정하여 직렬화 제외
    transient String str = "";
    transient ArrayList lists = new ArrayList();
    transient Integer[] integers;

    private Singleton() {}

    private static class SettingsHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SettingsHolder.INSTANCE;
    }

    private Object readResolve() {
        return SettingsHolder.INSTANCE;
    }
}