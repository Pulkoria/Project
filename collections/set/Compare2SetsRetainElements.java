package programmes.collections.set;

import java.util.HashSet;

public class Compare2SetsRetainElements {
	public static void main(String args[]) {
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("mary");
		hashset.add("sachin");
		hashset.add("sagar");
		hashset.add("riya");
		System.out.println("Before Subset Retain Elemets" + hashset);
		HashSet<String> retainSubSet = new HashSet<String>();
		retainSubSet.add("jerry");
		retainSubSet.add("sagar");
		retainSubSet.add("swathi");
		// common on both set objects
		hashset.retainAll(retainSubSet);
		System.out.println("After Subset Retain Elemets" + hashset);
	}
}
