package study03;
interface IAdd1 {
    int add(int x, int y);
}

public class LambdaEx3 {
    public static void main(String[] args) {
        IAdd1 lambda = (x, y) -> x + y; // 함수를 변수에 할당
        lambda.add(1, 2); // 함수 사용

        int n = result( (x, y) -> x + y ); // 메소드의 매개변수에 람다식을 전달
        System.out.println(n); // 3

        IAdd1 func = makeFunction(); // 메소드의 반환값이 람다 함수
        int result = func.add(1, 2);
        System.out.println(result); // 3
    }
    public static int result(IAdd1 lambda) {
        return lambda.add(1,2);
    }
    public static IAdd1 makeFunction() {
        return (x, y) -> x + y;
    }
}