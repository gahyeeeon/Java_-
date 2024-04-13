package week03.study5;

import java.io.BufferedReader;
import java.io.FileReader;
public class FileNotFoundEx {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt")); // 만일 폴더에 test.txt 파일이 없는데 가져올 경우
        br.readLine();
        br.close();
    }
}
