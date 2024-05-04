package chap3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
	
public class exam6 {
	interface Comparator<T>{
		int compare(T o1, T o2);
	}
	
	class Collections{
		public static <T> void sort(List<T>list, java.util.Comparator<? super T>c) {
			list.sort(c);
		}
	}

	public static void main(String[] args) {
        List<String> words = Arrays.asList("aaa", "bbb", "ccc", "ddd");

        Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
