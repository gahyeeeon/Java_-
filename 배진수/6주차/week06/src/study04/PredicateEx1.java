package study04;

import java.util.function.Predicate;

public class PredicateEx1 {
    public static void main(String[] args) {

        Predicate<Integer> greater = x -> x > 10;
        Predicate<Integer> less = x -> x < 20;

        // x > 10 && x < 20
        Predicate<Integer> between = greater.and(less);
        System.out.println(between.test(15)); // true

        // x > 10 || x < 20
        Predicate<Integer> all = greater.or(less);
        System.out.println(all.test(5)); // true

        // x <= 10
        Predicate<Integer> negate = greater.negate();
        System.out.println(negate.test(50)); // false

        // 함수의 인자로 들어온 문자열이 "홍길동" 인지 판별해주는 함수
        Predicate<String> checkMyName = Predicate.isEqual("홍길동");

        System.out.println(checkMyName.test("임꺽정")); // false
        System.out.println(checkMyName.test("홍길동")); // true
    }
}
