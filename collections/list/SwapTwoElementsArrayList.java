package programmes.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElementsArrayList {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Four");
		list.add("Five");
		list.add("Sex");
		list.add("Seven");
		// swap two elements in the ArrayList. By calling Collections.swap() method
		// You have to pass the indexes which you need to swap.
		Collections.swap(list, 2, 4);
		for (String s : list) {
			System.out.println(s);

		}
	}

}
