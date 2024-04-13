package week03.study8;
import java.io.*;

public class TryWithRecourceEx {
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter("data.txt")) { // 파일을 열고 모두 사용되면 자동으로 닫아준다
            file.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try 괄호 안에 두문장 이상 넣을 경우 ';'로 구분한다.
        int sum = 0;
        try(
                FileInputStream fis = new FileInputStream("a.txt");
                DataInputStream dis = new DataInputStream(fis)
        ) {

            while(true){
                int score = 100;
                score -= dis.readInt();
                System.out.println(score);
                sum += score;
            }

        } catch (EOFException e){
            System.out.println("점수의 총합은 " + sum + "입니다.");
        } catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
