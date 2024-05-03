package ex40;

import java.util.function.*;

interface TripleConsumer<T1, T2, T3> {
    void accept(T1 t1, T2 t2, T3 t3);
}

public class ConsumerTest {
    public static void main(String[] args) {

        // 객체 T를 받아 출력하는 함수 정의
        Consumer<String> c1 = t -> System.out.println("입력값 : "+ t);
        c1.accept("홍길동");

        // 객체 T와 U를 받아 출력하는 함수 정의
        BiConsumer<String, Integer> c2 =  (a, b) -> System.out.println("입력값1 : "+ a+ ", 입력값2 : "+ b);
        c2.accept("홍길동", 100);

        // int 값을 받아 출력하는 함수 정의
        IntConsumer c3 = a -> System.out.println("입력값 : "+ a);
        c3.accept(100);

        // double 값을 받아 출력하는 함수 정의
        DoubleConsumer c4 = a -> System.out.println("입력값 : "+ a);
        c4.accept(100.01);

        // long 값을 받아 출력하는 함수 정의
        LongConsumer c5 = a -> System.out.println("입력값 : "+ a);
        c5.accept(2100000000);

        TripleConsumer<String, Double, Integer> ccc = (t, u, k) -> {
            System.out.printf("%s + %f + %d", t, u, k);
        };

        ccc.accept("안녕", 101.23, 999);
    }
}
