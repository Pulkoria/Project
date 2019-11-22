package programmes.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class SuffleElementsinArrayList {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Four");
		list.add("Fix");
		list.add("Sex");
		System.out.println("Suffle Before:" + " " + list);
		// Shuffle will generate New order EveryTime
		Collections.shuffle(list);
		System.out.println("Suffle After:" + " " + list);
		System.out.println("After:");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
