package study07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class ComparatorEx1 {
    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) {
        return (a1, a2) -> Integer.compare(keyExtractor.applyAsInt(a1), keyExtractor.applyAsInt(a2));
    }

    public static void main(String[] args) {
        Apple[] inventory = new Apple[]{
                new Apple(34),
                new Apple(12),
                new Apple(76),
                new Apple(91),
                new Apple(55)
        };

        Arrays.sort(inventory, comparingInt(Apple::getWeight)); // (a) -> a.getWeight()

        System.out.println(Arrays.toString(inventory));
    }
}

