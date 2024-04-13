package week03;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수로 변환할 숫자문자열 입력 >> ");
        String str = sc.nextLine();

        try {
            int num = convertToInt(str);
            System.out.println("변환된 정수 : " + num);
        } catch (NumberFormatException e) {
            System.out.println("정수가 아닙니다.");
        }
    }

    private static int convertToInt(String str) {
        return Integer.parseInt(str);
    }
}
