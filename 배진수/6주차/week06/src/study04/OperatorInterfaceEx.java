package study04;

import java.util.function.*;

class Operation {
    static int calculate(int[] arr, IntBinaryOperator o) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = o.applyAsInt(result, arr[i]);
        }

        return result;
    }
}
public class OperatorInterfaceEx {
    public static void main(String[] args) {

        int[] numbers = {3, 1, 7, 6, 5};

        // 배열 요소의 모든 합 구하기
        int sum = Operation.calculate(numbers, (x, y) -> {
            return x + y;
        });
        System.out.println(sum);

        // 배열 요소의 모든 곱 구하기
        int mul = Operation.calculate(numbers, (x, y) -> {
            return x * y;
        });
        System.out.println(mul);

        // 배열 요소중 가장 큰 수 구하기
        int max = Operation.calculate(numbers, (x, y) -> {
            int tmp;

            if(x > y)
                tmp = x;
            else
                tmp = y;

            return tmp;
        });
        System.out.println(max);

        // 배열 요소중 가장 작은 수 구하기
        int min = Operation.calculate(numbers, (x, y) -> {
            int tmp;

            if(x < y)
                tmp = x;
            else
                tmp = y;

            return tmp;
        });
        System.out.println(min);
    }
}
