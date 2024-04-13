package ex25;

public class throwsKeyword {
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
        throw new ClassNotFoundException("에러이지롱1");
    }

    public static void method2() throws ArithmeticException {
        throw new ArithmeticException("에러이지롱2");
    }

    public static void method3() throws NullPointerException {
        throw new NullPointerException("에러이지롱3");
    }
}