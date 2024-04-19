package ex31;

import java.util.Arrays;

public class ClassClass {
    public static void main(String[] args) {
        String str = new String("Class클래스 테스트");
        Class<? extends String> cls1 = str.getClass();
        System.out.println(cls1);

        Class<? extends String> cls2 = String.class;
        System.out.println(cls2);

        try {
            Class<?> cls3 = Class.forName("java.lang.String");
            System.out.println(cls3);
        } catch (ClassNotFoundException e) {
        }
        // 클래스 정보 출력
        // String 객체로부터 클래스 정보를 얻는다
        Class<? extends String> cls = String.class;

        // 클래스의 이름만 호출한다.
        System.out.println("1. " + cls.getSimpleName()); // 1. String

        // 패키지의 이름을 호출한다.
        System.out.println("2. " + cls.getPackage()); // 2. package java.lang

        // 패키지와 이름을 호출한다.
        System.out.println("3. " + cls.getName()); // 3. java.lang.String

        // 클래스와 패키지 이름을 호출한다.
        System.out.println("4. " + cls.toString()); // 4. class java.lang.String

        // 제어자부터 패키지 이름 모두다 호출한다.
        System.out.println("5. " + cls.toGenericString()); // 5. public final class java.lang.String

        // 클래스 구성 출력
        // 가지고 있는 필드를 모두 출력한다.
        System.out.println("6. " + Arrays.toString(cls.getFields())); // 6.  [public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER]

        // 가지고 있는 메서드를 모두 호출한다.
        System.out.println("7. " + Arrays.toString(cls.getMethods())); // 7. [public boolean java.lang.String.equals(java.lang.Object), public java.lang.String java.lang.String.toString() ...]

        // 인터페이스 목록을 모두 가져온다.
        System.out.println("8. " + Arrays.toString(cls.getInterfaces())); // 8. [interface java.io.Serializable, interface java.lang.Comparable, interface java.lang.CharSequence]

        // super 클래스를 가져온다
        System.out.println("9. " + cls.getSuperclass()); // 9. class java.lang.Object

    }
}
