package week03.chap09;

import java.io.FileWriter;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter("data.txt")) { // 파일을 열고 모두 사용되면 자동으로 닫아준다
            file.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}