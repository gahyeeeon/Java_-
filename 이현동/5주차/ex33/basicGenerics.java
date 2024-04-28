package ex33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Fruit {
}

class Apple extends Fruit {
}

class Banana extends Fruit {
}

class FruitBox<T> {
    List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }
}

class FruitBox2<T, U> {
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T fruit, U fruitU) {
        apples.add(fruit);
        bananas.add(fruitU);
    }
}

public class basicGenerics {
    public static void main(String[] args) {
        FruitBox<Integer> intbox = new FruitBox<>();

        // 타입 파라미터 할당 가능 타입
        FruitBox<Fruit> box = new FruitBox<>();
        // 업캐스팅을 통해 자식 객체도 할당이 가능
        box.add(new Fruit());
        box.add(new Apple());
        box.add(new Banana());

        // 복수 타입 파라미터
        FruitBox2<Apple, Banana> box2 = new FruitBox2<>();
        box2.add(new Apple(), new Banana());

        // 중첩 타입 파라미터
        // LinkedList<String> 을 원소로서 저장하는 ArrayList
        ArrayList<LinkedList<String>> list = new ArrayList<>();

        LinkedList<String> node1 = new LinkedList<>();
        node1.add("a");
        node1.add("b");
        LinkedList<String> node2 = new LinkedList<>();
        node2.add("1");
        node2.add("2");

        list.add(node1);
        list.add(node2);
        System.out.println(list);
        // <T> : 타입(type)
        // <E> : 요소(Element), 예를 들어 List
        // <K> : 키(Key), 예를 들어 Map<k,v>
        // <V> : 리턴 값 또는 매핑된 값(Variable)
        // <N> : 숫자(Number)
        // <S, U, V> : 2번째, 3번째, 4번째에 선언된 타입
    }
}
