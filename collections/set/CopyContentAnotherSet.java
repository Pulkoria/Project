package programmes.collections.set;

import java.util.HashSet;

public class CopyContentAnotherSet {
	public static void main(String args[]) {
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("mary");
		hashset.add("sachin");
		hashset.add("sagar");
		hashset.add("riya");
		System.out.println("Before CopyContent" + hashset);
		HashSet<String> copycontent = new HashSet<String>();
		copycontent.add("jerry");
		copycontent.add("sagar");
		copycontent.add("swathi");
		hashset.addAll(copycontent);
		System.out.println("After CopyContent" + hashset);
	}
}
