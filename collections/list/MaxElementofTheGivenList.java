package programmes.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxElementofTheGivenList {
	public static void main(String args[]) {

		Integer[] no = { 1, 67, 45, 89, 90, 678 };
		List<Integer> maxelement = Arrays.asList(no);
		System.out.println("Find out Maximum value of Array:" + Collections.max(maxelement));
	}

	/*
	 * public static void main(String args[]) { List<Integer>list = new
	 * ArrayList<Integer>(); list.add(73); list.add(673); list.add(903);
	 * list.add(23); list.add(300); list.add(363); list.add(66);
	 * Collections.max(list);
	 * System.out.println("Find out Maximum value of Array:"+Collections.max(list));
	 * }
	 */

}