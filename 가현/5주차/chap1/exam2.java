package chap1;

import java.util.ArrayList;
import java.util.LinkedList;

public class exam2 {

	public static void main(String[] args) {
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
	    System.out.println(list);
	}
}
