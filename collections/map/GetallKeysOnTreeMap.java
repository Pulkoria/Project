package programmes.collections.map;

import java.util.Set;
import java.util.TreeMap;

public class GetallKeysOnTreeMap {
	public static void main(String args[]) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("First", "Pulkoria");
		treeMap.put("Second", "Mary");
		treeMap.put("Three", "Riya");
		treeMap.put("Four", "Nancy");
		Set<String> keys = treeMap.keySet();
		System.out.println("TreeMap All Keys" + keys);
		for (String key : keys) {
			System.out.println(key);
		}

	}
}
