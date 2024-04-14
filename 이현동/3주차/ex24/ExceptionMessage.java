package ex24;

public class ExceptionMessage {
    public static void main(String[] args) {
        try{
            System.out.println(0/0); // ArithmeticException 예외 발생
        }
        // e는 해당하는 에러의 예외정보가 담겨 있는 참조 변수 이다
        catch(ArithmeticException e){
            // 에러 메세지
            // 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
            System.out.println(e.getMessage()); // by zero

            // 상세한 에러 추적 메세지
            // 예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를
            // 화면에 출력
            e.printStackTrace(); // java.lang.ArithmeticException: / by zero at MyClass.main(MyClass.java:5)
        }

    }
}
