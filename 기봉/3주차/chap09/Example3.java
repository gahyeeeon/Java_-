package week03.chap09;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        int score = 0, sum = 0;
        // try 괄호 안에 두문장 이상 넣을 경우 ';'로 구분한다.
        try(
                FileInputStream fis = new FileInputStream("a.txt");
                DataInputStream dis = new DataInputStream(fis)
        ) {

            while(true){
//                score - dis.readInt();
//                System.out.println(score);
//                sum += score;
            }

        } catch (EOFException e){
            System.out.println("점수의 총합은 " + sum + "입니다.");
        } catch (IOException ie){
            ie.printStackTrace();
        }
    }
}