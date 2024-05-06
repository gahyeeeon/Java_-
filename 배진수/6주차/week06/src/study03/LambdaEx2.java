package study03;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaEx2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("aaa", "bbb", "ccc", "ddd");

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
