package ex28;

import java.util.Arrays;

public class variableArguments {
    public static void main(String[] args) {
        print("홍길동");
        print("홍길동", "이순신");
        print("홍길동", "이순신", "유성룡");
        print("홍길동", "이순신", "유성룡", "강감찬");
        print("홍길동", "이순신", "유성룡", "강감찬", "이도");
    }

    public static void print(String... str) {
        // 가변 인수인 str 매개변수는 String[] 배열 타입으로 받아들인다.
//        for (String s : str) {
//            System.out.print(s + ", ");
//        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println();
    }

    public static void print1(int num, boolean bool, String... str) {
        System.out.println(num);
        System.out.println(bool);
        System.out.println(Arrays.toString(str));
    }
}

class Printer1 {
    // 가변 인수 메서드는 호출될 때 마다 배열을 새로 하나 할당하고 초기화한다.
    // 그러므로 꼭 사용해야한다면 다음과 같이 유연적인 오버로딩으로 처리하는것을 권장
    public void print(int a1) {
    }

    public void print(int a1, int a2) {
    }

    public void print(int a1, int a2, int a3) {
    }

    public void print(int a1, int a2, int a3, int... rest) {
    }
}

class Printer2 {

    public void print(String c, String... str) {
        System.out.println("첫번째 메서드");
        System.out.println("rest parameters : " + Arrays.toString(str));
    }

    public void print(String... str) {
        System.out.println("두번째 메서드");
    }
}

class Main2 {
    public static void main(String[] args) {
        Printer2 p = new Printer2();

        // 이 메서드는 첫번째 메서드에도 두번째 메서드에서도 실행이 가능하기 때문에 컴파일러가 햇깔려 오류를 발생하게 된다.
//        p.print("-", "1", "2", "3");
    }
}

class Printer3 {

    // 제네릭 타입으로 받는 가변 인수
    public <T> T[] toArray(T... args) {
        return args; // 가변 인자들을 문제없이 담기 위해 어떤 타입도 담을 수 있는 가장 상위 타입인 Object 배열을 만들어 반환
    }

    public <T> T[] pick(T a, T b, T c) {
        T[] arr = toArray(a, b, c); // Object[] 타입 배열로 리턴된다.
        return arr;
    }
}

class Main3 {
    public static void main(String[] args) {
        Printer3 p =new Printer3();

        // 제네릭 메서드에 String 타입으로 전달
        String[] s = p.pick("1","2","3"); // ! ERROR - Object[] 타입을 String[] 타입으로 다운캐스팅이 불가능하다.
    }
}