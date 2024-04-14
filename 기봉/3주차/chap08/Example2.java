package week03.chap08;

public class Example2 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() {
        try {
            throw new ClassNotFoundException("에러이지롱");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method2() {
        try {
            throw new ArithmeticException("에러이지롱");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method3() {
        try {
            throw new NullPointerException("에러이지롱");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}