package programmes.collections.list;

import java.util.LinkedList;

public class ReadFirstandLastElementLinkedList {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("DotNet");
		list.add("Python");
		list.add("Selenium");
		list.add("Mysql");
		System.out.println("Read First Element in LinkedList:" + " " + list.getFirst());
		System.out.println("Read First Element in LinkedList:" + " " + list.getLast());
	}
}
