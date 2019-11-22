package programmes.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicatevalueArray {
	public static void main(String args[]) {
		String[] list = { "Java", "DotNet", "Python", "Selenium", "Mysql", "Selenium" };
		List<String> remove = Arrays.asList(list);
		System.out.println("Before RemoveDuplicate value of Array:" + remove);
		TreeSet<String> treeSet = new TreeSet<String>(remove);
		System.out.println("After RemoveDuplicate value of Array:" + treeSet);
	}
}
