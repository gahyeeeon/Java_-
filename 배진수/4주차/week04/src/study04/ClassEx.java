package study04;

import java.util.Arrays;

public class ClassEx {
    public static void main(String[] args) {
        // object.getClass() 로 얻기
        // 스트링 클래스 인스턴스화
        String str = new String("Class클래스 테스트");

        // getClass() 메서드로 얻기
        Class<? extends String> cls = str.getClass();
        System.out.println(cls); // class java.lang.String

        // 클래스 리터럴(*.class)로 얻기
        Class<? extends String> cls2 = String.class;
        System.out.println(cls2); // class java.lang.String

        try {
            // 도메인.클래스명으로 얻기
            Class<?> cls3 = Class.forName("java.lang.String");
            System.out.println(cls3); // class java.lang.String

        } catch (ClassNotFoundException e) {}

        // String 객체로부터 클래스 정보를 얻는다
        Class<? extends String> cls1 = String.class;

        // 클래스의 이름만 호출한다.
        System.out.println("1. " + cls1.getSimpleName()); // 1. String

        // 패키지의 이름을 호출한다.
        System.out.println("2. " + cls1.getPackage()); // 2. package java.lang

        // 패키지와 이름을 호출한다.
        System.out.println("3. " + cls1.getName()); // 3. java.lang.String

        // 클래스와 패키지 이름을 호출한다.
        System.out.println("4. " + cls1.toString()); // 4. class java.lang.String

        // 제어자부터 패키지 이름 모두다 호출한다.
        System.out.println("5. " + cls1.toGenericString()); // 5. public final class java.lang.String


        Class<? extends String> cls3 = String.class;

        // 가지고 있는 필드를 모두 출력한다.
        System.out.println("6. " + Arrays.toString(cls3.getFields())); // 6.  [public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER]

        // 가지고 있는 메서드를 모두 호출한다.
        System.out.println("7. " + Arrays.toString(cls3.getMethods())); // 7. [public boolean java.lang.String.equals(java.lang.Object), public java.lang.String java.lang.String.toString() ...]

        // 인터페이스 목록을 모두 가져온다.
        System.out.println("8. " + Arrays.toString(cls3.getInterfaces())); // 8. [interface java.io.Serializable, interface java.lang.Comparable, interface java.lang.CharSequence]

        // super 클래스를 가져온다
        System.out.println("9. " + cls3.getSuperclass()); // 9. class java.lang.Object
    }
}
