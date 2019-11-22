package programmes.collections.map;

import java.util.TreeMap;

public class SearchKeyOnTreeMap {
	public static void main(String args[]) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("First", "Pulkoria");
		treeMap.put("Second", "Mary");
		treeMap.put("Three", "Riya");
		treeMap.put("Four", "Nancy");
		System.out.println("HashMap All" + " " + treeMap);
		if (treeMap.containsKey("First")) {
			System.out.println("TreeMap First Key:");
		} else {
			System.out.println("TreeMap Not First Key:");
		}
		if (treeMap.containsKey("Six")) {
			System.out.println("TreeMap Six Key:");
		} else {
			System.out.println("TreeMap Not Six Key:");
		}
	}
}
