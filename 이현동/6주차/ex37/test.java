package ex37;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InvocationTargetException {
        EumSingleton singleton1 = EumSingleton.INSTANCE;
        EumSingleton singleton2 = EumSingleton.INSTANCE;

        System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        System.out.println(singleton1.getValue());

        /* Reflection API */

        // 1. Singleton Enum의 생성자는 숨겨져 있기 때문에 getDeclaredConstructors로 배열로 가져온다.
        Constructor<?>[] consructors = Singleton.class.getDeclaredConstructors();

        // 2. 생성자 배열을 순회하여 인스턴스를 생성한다
        for(Constructor<?> constructor : consructors){
            constructor.setAccessible(true); // 생성자가 private 이기 때문에 외부에서 access 할 수 있도록 true 설정
            Singleton singleton = (Singleton) constructor.newInstance("INSTANCE");
        }
    }
}


