package study01;
class Printer {

    // 제네릭 타입으로 받는 가변 인수
    public <T> T[] toArray(T... args) {
        return args; // 가변 인자들을 문제없이 담기 위해 어떤 타입도 담을 수 있는 가장 상위 타입인 Object 배열을 만들어 반환
    }

    public <T> T[] pick(T a, T b, T c) {
        T[] arr = toArray(a, b, c); // Object[] 타입 배열로 리턴된다.
        return arr;
    }
}

public class varArgsEx2 {
    public static void main(String[] args) {
        Printer p =new Printer();

        // 제네릭 메서드에 String 타입으로 전달
        String[] s = p.pick("1","2","3"); // ! ERROR - Object[] 타입을 String[] 타입으로 다운캐스팅이 불가능하다.
    }
}
