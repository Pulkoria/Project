package programmes.collections.list;

import java.util.TreeSet;

public class FindoutDuplicatesValueinArray {
	public static void main(String args[]) {
		String[] list = { "Java", "DotNet", "Python", "Selenium", "Mysql", "Selenium" };
		TreeSet<String> treeSet = new TreeSet<String>();
		System.out.print("Find Duplicate value of Array:" + " ");
		for (String s : list) {
			if (!treeSet.add(s)) {
				System.out.print(s);
			}
		}
	}
}