package ex25;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class throwKeyword  {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            if(num < 0){
                throw new ArithmeticException("why??");
            }
            System.out.println("thank you");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("program exit...");
        }
    }
}
