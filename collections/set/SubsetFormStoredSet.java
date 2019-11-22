package programmes.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetFormStoredSet {
	public static void main(String args[]) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Abi");
		treeSet.add("Banu");
		treeSet.add("Sagar");
		treeSet.add("Riya");
		treeSet.add("Bharathi");
		treeSet.add("Sindhu");
		treeSet.add("Sudeep");
		treeSet.add("Calvin");
		System.out.println("Before Subset Form StoredSet:" + " " + treeSet);
		Set<String> subset = treeSet.subSet("Banu", "Riya");
		System.out.println("After Subset Form StoredSet:" + " " + subset);
		Set<String> subsetTrue = treeSet.subSet("Banu", true, "Riya", true);
		System.out.println("After Subset Form StoredSet:" + " " + subsetTrue);
		Set<String> subsetFalse = treeSet.subSet("Banu", false, "Riya", true);
		System.out.println("After Subset Form StoredSet:" + " " + subsetFalse);
	}
}
