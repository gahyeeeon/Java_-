package prob;
import java.util.Scanner;


public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수의 갯수 입력 >>");
        int count = sc.nextInt();

        int[] num = new int[count];

        System.out.print(count + "개의 숫자를 입력 >> ");
        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }

        int result = sum(num);
        System.out.println("입력한 숫자의 합: " + result);
    }
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}
