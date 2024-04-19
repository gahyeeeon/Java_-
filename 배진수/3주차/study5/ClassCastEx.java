package week03.study5;

public class ClassCastEx {
    public static void main(String[] args) {
        Object x = new Integer(0);
        System.out.println( (String)x ); // 정수 객체를 스트링 객체로 캐스팅
    }
}
