package programmes.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateSynchronizedList {
	public static void main(String args[]) {
		String[] list = { "Java", "DotNet", "Python", "Selenium", "Mysql", "Selenium" };
		List<String> create = Arrays.asList(list);
		List<String> createsysList = Collections.synchronizedList(create);
		System.out.println("CreateSynchronizedList:" + createsysList);
	}
}
