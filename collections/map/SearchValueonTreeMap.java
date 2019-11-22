package programmes.collections.map;

import java.util.TreeMap;

public class SearchValueonTreeMap {
	public static void main(String args[]) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("First", "Pulkoria");
		treeMap.put("Second", "Mary");
		treeMap.put("Three", "Riya");
		treeMap.put("Four", "Nancy");
		System.out.println("HashMap All" + " " + treeMap);
		if (treeMap.containsValue("Pulkoria")) {
			System.out.println("TreeMap First Value:");
		} else {
			System.out.println("TreeMap Not First Value:");
		}
		if (treeMap.containsValue("Six")) {
			System.out.println("TreeMap Six Value:");
		} else {
			System.out.println("TreeMap Not Six Value:");
		}
	}
}
