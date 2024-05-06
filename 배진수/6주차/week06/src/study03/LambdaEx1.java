package study03;

interface Iadd {
    int add(int x, int y);
}

class Add implements Iadd {
    public int add(int x, int y) {
        return x + y;
    }
}

public class LambdaEx1 {
    public static void main(String[] args) {
        // 생 클래스로 메소드 사용하기
        Add a = new Add();

        int result1 = a.add(1, 2);
        System.out.println(result1);

        // 익명 클래스로 정의해 사용하기 (일회용)
        Iadd a1 = new Iadd() {
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result2 = a1.add(1, 2);
        System.out.println(result2);

        // 람다 표현식으로 함축 하기
        Iadd lambda = (x, y) -> { return x + y; }; // 람다식 끝에 세미콜론을 잊지말자

        int result3 = lambda.add(1, 2);
        System.out.println(result3);
    }
}
//// 함수형 인터페이스가 될 수 있다.
//interface IAdd {
//    int add(int x, int y);
//}
//
//// 함수형 인터페이스가 될수 없다.
//interface ICalculate {
//    int add(int x, int y);
//    int min(int x, int y);
//}
//
//// 구성요소가 많아도 결국 추상 메서드는 한개이기 때문에 함수형 인터페이스이다.
//interface IAdd {
//    int add(int x, int y);
//
//    final boolean isNumber = true; // final 상수
//    default void print() {}; // 디폴트 메서드
//    static void print2() {}; // static 메서드
//}