package programmes.collections.list;

import java.util.ArrayList;
public class ArraylistContainsAllElementsorNot {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		ArrayList<String> addList = new ArrayList<String>();
		addList.add("First");
		addList.add("Second");
		System.out.println("Arraylist Contains AllElements:" + list.containsAll(addList));
		addList.add("Six");
		System.out.println("Arraylist Contains AllElements:" + list.containsAll(addList));
	}
}