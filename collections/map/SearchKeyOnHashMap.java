package programmes.collections.map;

import java.util.HashMap;

public class SearchKeyOnHashMap {
	public static void main(String args[]) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("First", "Pulkoria");
		hashmap.put("Second", "Mary");
		hashmap.put("Three", "Riya");
		hashmap.put("Four", "Nancy");
		System.out.println("HashMap All" + " " + hashmap);
		if (hashmap.containsKey("First")) {
			System.out.println("HashMap First Key");
		} else {
			System.out.println("HashMap Not First Key");
		}
		if (hashmap.containsKey("Six")) {
			System.out.println("HashMap Six Key");
		} else {
			System.out.println("HashMap Not Six Key");
		}
	}
}
