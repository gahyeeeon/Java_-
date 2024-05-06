package study01;
import java.io.*;
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
public class SingletonEx {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
