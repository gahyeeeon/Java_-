package study01;


import java.lang.reflect.*;

enum Singleton2 {
    INSTANCE; // 싱글톤 인스턴스

    // 이넘은 필드와 메서드도 가질 수 있다
    private int value = 3;

    public int getValue() {
        return value;
    }
}
public class SingletonEx3 {
//    public static void main(String[] args) {
//        Singleton2 singleton1 = Singleton2.INSTANCE;
//        Singleton2 singleton2 = Singleton2.INSTANCE;
//
//        System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
//        System.out.println(singleton1.hashCode());
//        System.out.println(singleton2.hashCode());
//
//        System.out.println(singleton1.getValue());
//    }

    // 열거형은 리플렉션을 통해 newInstance를 생성하지 못하도록 막아놔서 리플렉션 동작을 하지 않는다.
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        /* Reflection API */

        // 1. Singleton Enum의 생성자는 숨겨져 있기 때문에 getDeclaredConstructors로 배열로 가져온다.
        Constructor<?>[] consructors = Singleton2.class.getDeclaredConstructors();

        // 2. 생성자 배열을 순회하여 인스턴스를 생성한다
        for (Constructor<?> constructor : consructors) {
            constructor.setAccessible(true); // 생성자가 private 이기 때문에 외부에서 access 할 수 있도록 true 설정
            Singleton2 singleton = (Singleton2) constructor.newInstance("INSTANCE");
        }
    }
}
