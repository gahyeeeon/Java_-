package week03;

import java.util.Scanner;

public class Ex1 {
    public int divide(int num1, int num2){
        return num1 / num2;
    }
    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수 입력 >> ");
        int x = sc.nextInt();
        System.out.println("두 번째 수 입력 >> ");
        int y = sc.nextInt();

        try {
            int div = ex.divide(x, y);
            System.out.println("div : " + div);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
