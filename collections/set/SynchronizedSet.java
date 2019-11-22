package programmes.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSet {
	public static void main(String args[]) {
		Set<String> hashset = new HashSet<String>();
		hashset.add("mary");
		hashset.add("sachin");
		hashset.add("sagar");
		hashset.add("riya");
		System.out.println(" Before SynchronizedSet:" + hashset);
		Set<String> synSet = Collections.synchronizedSet(hashset);
		System.out.println(" After SynchronizedSet:" + synSet);
	}
}
