package programmes.collections.list;

import java.util.ArrayList;

public class CopyOfArrayList {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		System.out.println("ArrayList:" + list);
		String[] arrList = new String[list.size()];
		System.out.println("Array:");
		list.toArray(arrList);
		for (String s : arrList) {
			System.out.println(s);
		}

	}
}