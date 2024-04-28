package study01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Apple1 {}
class Banana1 {}

class FruitBox1<T, U> {
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana) {
        apples.add(apple);
        bananas.add(banana);
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        // 복수 제네릭 타입
        FruitBox1<Apple1, Banana1> box = new FruitBox1<>();
        box.add(new Apple1(), new Banana1());
        box.add(new Apple1(), new Banana1());

        // LinkedList<String>을 원소로서 저장하는 ArrayList
        ArrayList<LinkedList<String>> list = new ArrayList<LinkedList<String>>();

        LinkedList<String> node1 = new LinkedList<>();
        node1.add("aa");
        node1.add("bb");

        LinkedList<String> node2 = new LinkedList<>();
        node2.add("11");
        node2.add("22");

        list.add(node1);
        list.add(node2);
        System.out.println(list);       // [aa, bb], [11, 22]

    }
}

