package programmes.collections.map;

import java.util.HashMap;
import java.util.Set;

public class AllKeysOnHashMap {
	public static void main(String args[]) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("First", "Pulkoria");
		hashmap.put("Second", "Mary");
		hashmap.put("Three", "Riya");
		hashmap.put("Four", "Nancy");
		Set<String> keys = hashmap.keySet();
		System.out.println("HashMap All Keys" + keys);
	}
}
