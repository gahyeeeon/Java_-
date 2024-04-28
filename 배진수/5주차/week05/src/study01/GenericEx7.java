package study01;

// 숫자만 받아 계산하는 계산기 클래스 모듈
class Calculator<T extends Number>{
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}
}

public class GenericEx7 {
    public static void main(String[] args) {
        // 제네릭에 아무 타입이나 모두 할당이 가능
//        Calculator<Number> cal1 = new Calculator<>();
//        Calculator<Object> cal2 = new Calculator<>();
//        Calculator<String> cal3 = new Calculator<>();
//        Calculator<GenericEx7> cal4 = new Calculator<>();
        // 제네릭에 Number 클래스만 받도록 제한
        Calculator<Number> cal1 = new Calculator<>();
        Calculator<Integer> cal2 = new Calculator<>();
        Calculator<Double> cal3 = new Calculator<>();

        // Number 이외의 클래스들은 오류 !!
//        Calculator<Object> cal4 = new Calculator<>();
//        Calculator<String> cal5 = new Calculator<>();
//        Calculator<GenericEx7> cal6 = new Calculator<>();
    }
}
