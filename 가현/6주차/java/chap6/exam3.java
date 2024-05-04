package chap6;

import java.util.function.Consumer;

public class exam3 {
	public static void forEach(int[] arr, Consumer<? super Number> callback) {
	    for (int i : arr) {
	        callback.accept(i); // System.out.println(i)
	    }
	}

	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5};
	    forEach(arr, System.out::println);
	}
}
