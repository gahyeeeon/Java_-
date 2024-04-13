package week03.chap08;

public class Example3 {
    public static void main(String[] args) {
        try {
            method1();
            method2();
            method3();
        } catch (ClassNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException("에러이지롱");
    }

    public static void method2() throws ArithmeticException {
        throw new ArithmeticException("에러이지롱");
    }

    public static void method3() throws NullPointerException {
        throw new NullPointerException("에러이지롱");
    }
}