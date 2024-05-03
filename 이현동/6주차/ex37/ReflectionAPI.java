package ex37;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionAPI {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, InvocationTargetException {
        /* Reflection API */

        // 1. Singleton의 Class에서 생성자를 가져온다
        Constructor<Singleton> consructor = Singleton.class.getDeclaredConstructor();

        // 2. 생성자가 private 이기 때문에 외부에서 access 할 수 있도록 true 설정
        consructor.setAccessible(true);

        // 3. 가져온 생성자를 이용해 인스턴스화 한다
        Singleton singleton1 = consructor.newInstance();
        Singleton singleton2 = consructor.newInstance();

        System.out.println("singleton1 == singleton2 : " + (singleton1 == singleton2));
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
