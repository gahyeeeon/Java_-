package week03.study1;

public class CloneEx1 {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {

        String str = "Class클래스 테스트"; // String 클래스

        Class<? extends String> cls = str.getClass(); // String 객체로부터 클래스 정보를 얻는다

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
    }
}
