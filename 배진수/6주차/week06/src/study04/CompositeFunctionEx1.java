package study04;

import java.util.function.Function;

public class CompositeFunctionEx1 {
    public static void main(String[] args) {

        Function<Integer, Integer> f = num -> (num - 4); // f(x)
        Function<Integer, Integer> g = num -> (num * 2); // g(x)

        // f(g(x))
        int a = f.andThen(g).apply(10);
        System.out.println(a); // (10 - 4) * 2 = 12

        // g(f(x)) - andThen을 반대로 해석하면 된다
        int b = f.compose(g).apply(10);
        System.out.println(b); // 10 * 2 - 4 = 16

    }
}
