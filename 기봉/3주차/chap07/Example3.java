package week03.chap07;

public class Example3 {
    public static void main(String[] args) {
        try{
            System.out.println(0/0); // ArithmeticException 예외 발생
        } catch(ArithmeticException e){ // e는 해당하는 에러의 예외정보가 담겨 있는 참조 변수 이다

            // 에러 메세지
            System.out.println(e.getMessage()); // by zero

            // 상세한 에러 추적 메세지
            e.printStackTrace(); // java.lang.ArithmeticException: / by zero at MyClass.main(MyClass.java:5)
        }
    }
}
