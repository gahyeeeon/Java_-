package study07;

import java.util.Arrays;
import java.util.Comparator;

class Apple {
    private final int weight; // 사과 무게

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" + "weight=" + weight + '}';
    }
}
public class ComparatorEx {
    public static void main(String[] args) {
        Apple[] inventory = new Apple[] {
                new Apple(34),
                new Apple(12),
                new Apple(76),
                new Apple(91),
                new Apple(55)
        };

        Arrays.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        });
        // 람다로 바꾼 코드
        Arrays.sort(inventory, (o1, o2) -> Integer.compare(o1.getWeight(), o2.getWeight()));

        System.out.println(Arrays.toString(inventory));
    }

}
