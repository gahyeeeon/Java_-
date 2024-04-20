package chap3;

import java.util.function.DoubleBinaryOperator;

public class exam8 {

	// 함수형 인터페이스 임포트
	enum Operation {
	    PLUS("+", (x, y) -> x + y),
	    MINUS("-", (x, y) -> x - y),
	    TIMES("*", (x, y) -> x * y),
	    DIVIDE("/", (x, y) -> x / y);

	    private final DoubleBinaryOperator op; // 람다식을 저장할 필드

	    private final String symbol;

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
}
