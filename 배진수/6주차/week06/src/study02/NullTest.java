package study02;

class Test {
    int i; // Primitive type
    Integer ii; // Reference type
}

public class NullTest {
    public static void main(String[] args) {
        Test t = new Test(); // 따로 초기화 없이 바로 객체 생성
        System.out.println(t.i); // 0
        System.out.println(t.ii); // null
        // int i = null; // 컴파일 오류 발생

        // Integer 래퍼런스 타입을 사용하기 위해 변수를 선언하고 11 값으로 초기화한다.
        Integer BoxedValue = new Integer(11);

        // ...

        // 만일 1000줄이 넘는 코드에서 BoxedValue 변수를 다루다가 어떠한 원인으로 인해 BoxedValue에 null 값이 들어갔다고 가정한다.
        BoxedValue = null;

        // Integer 래퍼 타입인 BoxedValue를 int 타입으로 자동 형변환 하는 과정에서 null은 primitive 타입에 넣을수 없어 에러가 발생하게 된다
        int intValue = BoxedValue; // NullPointerException 발생
    }
}
