package week03.study7;

import java.io.IOException;

class MyCheckedException extends Exception {  } // checked excpetion


public class ChainedExceptionEx {
    public static void main(String[] args) {
        install();
    }

    public static void install() {
        throw new RuntimeException(new IOException("설치할 공간이 부족합니다."));
        // Checked 예외인 IOException을 Unchecked 예외인 RuntimeException으로 감싸 Unchecked 예외로 변신 시킨다
    }
}
