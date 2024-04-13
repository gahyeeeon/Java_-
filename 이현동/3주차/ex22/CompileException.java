package ex22;

import java.io.BufferedReader;
import java.io.FileReader;

public class CompileException {
    public static void main(String[] args)  {
        // IOException
        // 입출력에 관한 예외.
        // 입출력을 다루는 메서드에 예외처리가 없다면 컴파일 에러가 발생
        // 참고로 print(), println() 메서드가 아무 문제가 없는 이유는
        // 자체적으로 컴파일 예외처리를 미리 했기 때문
//        byte[] list = {'a', 'b', 'c'};
//        System.out.write(list);

//        BufferedReader br = new BufferedReader(new FileReader("test.txt")); // 만일 폴더에 test.txt 파일이 없는데 가져올 경우
//        br.readLine();
//        br.close();
    }
}