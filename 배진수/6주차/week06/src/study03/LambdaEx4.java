package study03;

//enum Operation {
//    PLUS("+") {
//        public double apply(double x, double y) { return x + y; }
//    },
//    MINUS("-") {
//        public double apply(double x, double y) { return x - y; }
//    },
//    TIMES("*") {
//        public double apply(double x, double y) { return x * y; }
//    },
//    DIVIDE("/") {
//        public double apply(double x, double y) { return x * y; }
//    };
//
//    private final String symbol;
//
//    Operation(String symbol) { this.symbol = symbol; }
//
//    @Override public String toString() { return symbol; }
//    public abstract double apply(double x, double y);
//}

// 위 enum 타입의 코드를 람다식으로 작성하면 아래와 같이 줄일 수 있다
import java.util.function.DoubleBinaryOperator;

enum Operation {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    Operation(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() { return symbol; }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    }
}

public class LambdaEx4 {
    public static void main(String[] args) {
        // 사용은 아래와 같이
        Operation.PLUS.apply(2, 3);
    }
}
