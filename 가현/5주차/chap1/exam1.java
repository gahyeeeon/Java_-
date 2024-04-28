package chap1;

import java.util.ArrayList;
import java.util.List;

class Apple {}
class Banana {}

class FruitBox<T, U> {
    List<T> apples = new ArrayList<>();
    List<U> bananas = new ArrayList<>();

    public void add(T apple, U banana) {
        apples.add(apple);
        bananas.add(banana);
    }
}

public class exam1 {
    public static void main(String[] args) {
    	// 복수 제네릭 타입
        FruitBox<Apple, Banana> box = new FruitBox<>();
        box.add(new Apple(), new Banana());
        box.add(new Apple(), new Banana());
    }
    
    
}
