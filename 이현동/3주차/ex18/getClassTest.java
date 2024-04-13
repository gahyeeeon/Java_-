package ex18;


import java.util.Scanner;

public class getClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Class 클래스 테스트";

        // String 객체로부터 클래스 정보를 얻음.
        Class<? extends String> cls = str.getClass();
        Class c = sc.getClass();


        // 클래스의 이름만 호출
        System.out.println(cls.getSimpleName());
        System.out.println(c.getSimpleName());

        // 패키지의 이름을 호출
        System.out.println(cls.getPackage());
        System.out.println(c.getPackage());

        // 패키지와 이름을 호출
        System.out.println(cls.getName());
        System.out.println(c.getName());

        // 클래스와 패키지 이름을 호출
        System.out.println(cls.toString());
        System.out.println(c.toString());

        // 제어자로부터 패키지 이름 모두 다 호출
        System.out.println(cls.toGenericString());
        System.out.println(c.toGenericString());
    }
}
