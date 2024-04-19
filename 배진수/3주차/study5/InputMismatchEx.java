package week03.study5;
import java.util.Scanner;

public class InputMismatchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요");

        int n = scanner.nextInt(); // 정수 입력 -> 사용자가 문자를 입력하면 예외 발생

        scanner.close();
    }
}
