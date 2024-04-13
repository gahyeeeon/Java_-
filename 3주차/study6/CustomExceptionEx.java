package week03.study6;
// 사용자 커스텀 예외 클래스를 만들려면 부모 클래스인 Exception 클래스를 상속 하면 된다.
class MyErrException extends Exception {
    private String msg;

    // 사용자 커스텀 예외클래스 생성자
    public MyErrException(String msg) {
        super(msg); // 부모 Exception 클래스 생성자도 호출
        this.msg = msg;
    }

    // 사용자 커스텀 예외클래스 메세지 출력
    public void printMyMessage() {
        System.out.println(this.msg);
    }
}
public class CustomExceptionEx {
    public static void main(String[] args) {
        try {
            throw new MyErrException("나의 커스텀 예외 클래스 메세지"); // 커스텀 예외 클래스 발생
        } catch (MyErrException e) {
            e.printMyMessage(); // 커스텀 예외 클래스의 메서드 실행
            e.printStackTrace(); // 상속한 부모클래스의 메서드 실행
        }
    }
}
