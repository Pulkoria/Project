package programmes.collections.list;

import java.util.LinkedList;
import java.util.List;

public class SubListLinkedListElement {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Python");
		list.add("DotNet");
		list.add("Mysql");
		list.add("RestApi");
		System.out.println("Before Sub LinkedList Element:" + list);
		List<String> linkedList = list.subList(2, 4);
		System.out.println("After Sub LinkedList Element:" + linkedList);

	}

}
