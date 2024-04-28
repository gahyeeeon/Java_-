package ex34;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class MyArrayListU<T> {
    Object[] element = new Object[5];
    int index = 0;

    // 외부로부터 리스트를 받아와 매개변수의 모든 요소를 내부 배열에 추가하여 인스턴스화 하는 생성자
    public MyArrayListU(Collection<? extends T> in) {
        for (T elem : in) {
            element[index++] = elem;
        }
    }

    // 외부로부터 리스트를 받아와 내부 배열의 요소를 모두 매개변수에 추가해주는 메서드
    public void clone(Collection<? super T> out) {
        for (Object elem : element) {
            out.add((T) elem);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(element); // 배열 요소들 출력
    }
}

public class Wildcards {
    public static void main(String[] args) {
        MyArrayListU<Number> list;

        Collection<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5);
        list = new MyArrayListU<>(number1);
        System.out.println(list);

        Collection<Double> number2 = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        list = new MyArrayListU<>(number2);
        System.out.println(list);

        List<Object> temp = new LinkedList<>();
        list.clone(temp);
        System.out.println(temp);

    }
}
