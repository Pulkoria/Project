package programmes.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class ReverseSortedKeyOnTreeMap {
	public static void main(String args[]) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("First", "Pulkoria");
		treeMap.put("Second", "Mary");
		treeMap.put("Third", "Riya");
		treeMap.put("Four", "Nancy");
		System.out.println("Before Reverse Sotrd Keys on TreeMap" + treeMap);
		Map<String, String> reverse = treeMap.descendingMap();
		System.out.println("After Reverse Sotrd Keys on TreeMap" + reverse);
	}
}
