package ex39;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface MyFunction {
    void print(String str);
}

public class BasicLambda {
    public static void main(String[] args) {
        MyFunction myfunc = (str) -> System.out.println(str);
        myfunc.print("Hello World");

        List<String> words = Arrays.asList("aaa", "bbb", "ccc");

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}