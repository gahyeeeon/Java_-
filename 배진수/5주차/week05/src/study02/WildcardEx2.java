package study02;

import java.util.*;

class Fruit1 { }
class Apple1 extends Fruit1 { }
class Banana1 extends Fruit1 { }

class FruitBox1 {
    public static void method(List<? extends Fruit1> item) {
        // 안전하게 꺼내려면 Fruit 타입으로만 받아야한다
        Fruit1 f1 = item.get(0);

        Apple1 f2 = (Apple1) item.get(0); // ! 잠재적 ERROR
        Banana1 f3 = (Banana1) item.get(0); // ! 잠재적 ERROR
    }
}

public class WildcardEx2 {
    public static void main(String[] args) {
        List<Banana1> bananas = new ArrayList<>(
                Arrays.asList(new Banana1(), new Banana1(), new Banana1())
        );
        FruitBox1.method(bananas);
    }
}
