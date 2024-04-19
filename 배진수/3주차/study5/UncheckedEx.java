package week03.study5;

public class UncheckedEx {
    public static void main(String[] args) {
        // 일부로 예외를 무한적으로 발생시켜도 에러로그만 쌓이지 프로그램 자체는 왠만해선 죽지는 않는다. (미약한 오류이기 때문에)
        while(true) {
            String s = null;
            s.length(); // NullPointException - Unchecked Exception 이어서 예외를 발생시키는 옳지 못한 코드임에도 불구하고 빨간줄이 없다
        }
    }
}
