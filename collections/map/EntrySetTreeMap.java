package programmes.collections.map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class EntrySetTreeMap {
	public static void main(String args[]) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("1", "Pulkoria");
		treeMap.put("3", "Mary");
		treeMap.put("2", "Riya");
		treeMap.put("5", "Nancy");
		Set<Entry<String, String>> entries = treeMap.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " :" + entry.getValue());
		}

	}
}
