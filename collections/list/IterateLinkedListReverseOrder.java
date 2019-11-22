package programmes.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedListReverseOrder {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("DotNet");
		list.add("Python");
		list.add("Selenium");
		list.add("Mysql");
		System.out.println("Iterate Through LinkedList in ReverseOrder:");
		Iterator<String> iterator = list.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
