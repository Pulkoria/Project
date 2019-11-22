package programmes.collections.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetHashMap {
	public static void main(String args[]) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("First", "Pulkoria");
		hashmap.put("Second", "Mary");
		hashmap.put("Three", "Riya");
		hashmap.put("Four", "Nancy");
		Set<Entry<String, String>> entries = hashmap.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " :" + entry.getValue());
		}

	}
}
