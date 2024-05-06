package study01;

import java.io.*;
import java.util.ArrayList;

// 싱글톤 + 직렬화
class Singleton1 implements Serializable {
    // 싱글톤 객체의 필드들을 transient 설정하여 직렬화 제외
    transient String str = "";
    transient ArrayList lists = new ArrayList();
    transient Integer[] integers;
    private Singleton1() {}

    private static class SettingsHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return SettingsHolder.INSTANCE;
    }

    private Object readResolve() {
        return SettingsHolder.INSTANCE;
    }
}

public class SingletonEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton1 singleton1 = Singleton1.getInstance();

        String fileName = "singleton.obj";

        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
        out.writeObject(singleton1);
        out.close();

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)));
        Singleton1 singleton2 = (Singleton1) in.readObject();
        in.close();

        System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
