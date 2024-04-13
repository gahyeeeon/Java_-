package week03.study5;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedEx {
    // try - catch 로 예외처리
    public static void fileOpen() {
        // 파일을 열고 쓰고 닫는 아주 단순한 로직이어도 이에 대한 예외는 checked exception으로 분류 되기 때문에 반드시 try - catch로 감싸주어야 한다.
        try {
            FileWriter file = new FileWriter("data.txt");
            file.write("Hello World");
            file.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

// -------------------------------------------------------------------------

    // throws 로 예외처리
    public static void fileOpen1() throws IOException {
        // 파일을 열고 쓰고 닫는 아주 단순한 로직이어도 이에 대한 예외는 checked exception으로 분류 되기 때문에 반드시 try - catch로 감싸주어야 한다.
        FileWriter file = new FileWriter("data.txt");
        file.write("Hello World");
        file.close();
    }
}
