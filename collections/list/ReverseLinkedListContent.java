package programmes.collections.list;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedListContent {

	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("DotNet");
		list.add("Python");
		list.add("Selenium");
		list.add("Mysql");
		System.out.println("Before Reverse LinkedList Content:" + list);
		Collections.reverse(list);
		System.out.println("After Reverse LinkedList Content:" + list);
	}
}
