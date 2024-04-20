package prob;
import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 이름을 입력하세요: ");
        String name = sc.nextLine();

        String x = "^[A-Z][a-zA-Z]{1,9}$";
        if(name.matches(x)) {
            System.out.println("사용 가능한 이름입니다.");
        } else {
            System.out.println("사용할 수 없는 이릅입니다");
        }
    }
}
