package ex22;

import java.util.Scanner;

public class RuntimeErrorsExample {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException
        // 배열 범위를 넘어선 인덱스 참조시 발생
        int arr[] = { 4,6,2 };
        System.out.println(arr[3]);

        // ArithmeticException
        // 정수를 0으로 나눌때 발생
        System.out.println(12/0);

        // NullPointException
        // null 객체에 접근해서 method를 호출하는 경우 발생
        // 객체가 없는 상태에서 객체 사용 시
        String s = null;
        System.out.println(s.length());

        // NumberFormatException
        // 문자열을 숫자로 변환할때 발생
        String stringNumber = "3.141592";
        // "3.141592"를 정수로 변환할 때 NumberFormatException 예외 발생
        int num = Integer.parseInt(stringNumber);
        // (parsefloat 으로 변경해 주어야 함)
        // float num = Float.parseFloat(stringNumber);

        // ClassCastException
        // 타입 변환은 상위 클래스와 하위 클래스간의 상속 관계 이거나
        // 혹은 구현 클래스와 인터페이스간 일때만 가능하다.
        // 이 규칙을 무시하고 타입을 변환하면 발생.
        Object x = Integer.valueOf(0);
        System.out.println( (String)x ); // 정수 객체를 스트링 객체로 캐스팅

        // InputMismatchException
        // 의도치 않는 입력 오류 시 발생.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수가 아닌 다른 타입 입력시 예외 발생
    }
}
