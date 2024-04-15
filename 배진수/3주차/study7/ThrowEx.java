package week03.study7;
import java.util.Scanner;

public class ThrowEx {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("음수를 제외한 숫자만 입력하세요 : ");
            int num = s.nextInt(); // 사용자로부터 정수를 입력 받음
            if (num < 0) {
                // 만일 사용자가 말을 안듣고 음수를 입력하면 강제로 에러 발생 시켜버리기!!
                throw new ArithmeticException("왜 하지말라는 짓을 하시는 거죠? ㅡㅡ"); // ArithmeticException 예외 클래스 객체를 생성해 catch문으로 넘겨버린다고 생각하며 된다
            }
            System.out.println("음수를 입력하지 않으셨군요. 감사합니다");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다");
        }
    }
}
