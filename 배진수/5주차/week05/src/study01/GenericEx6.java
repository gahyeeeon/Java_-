package study01;
interface ISample<T> {
    public void addElement(T t, int index);
    public T getElement(int index);
}

class Sample2<T> implements ISample<T> {
    private T[] array;

    public Sample2() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addElement(T element, int index) {
        array[index] = element;
    }

    @Override
    public T getElement(int index) {
        return array[index];
    }
}
// 제네릭으로 타입을 받아, 해당 타입의 두 값을 더하는 인터페이스
interface IAdd<T> {
    public T add(T x, T y);
}

public class GenericEx6 {
    public static void main(String[] args) {
        Sample2<String> sample = new Sample2<>();
        sample.addElement("This is string", 5);
        sample.getElement(5);

        // 제네릭을 통해 람다 함수의 타입을 결정
        IAdd<Integer> o = (x, y) -> x + y; // 매개변수 x와 y 그리고 반환형 타입이 int형으로 설정된다.

        int result = o.add(10, 20);
        System.out.println(result); // 30
    }
}
