package study02;

public class NullInstanceOfEx {
    public static void main(String[] args) {

        String o = null;

        if (o instanceof String) {
        } else {
            System.out.println("instanceof returned false"); // 조건문에서 myReference는 null이기 때문에 false를 리턴해서 이쪽이 실행된다
        }

        String o2 = "Hello World";

        if (o2 instanceof String) {
            System.out.println("myReference is a String"); // 출력
        }
    }
}
