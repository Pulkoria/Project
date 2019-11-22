package programmes.collections.map;

import java.util.HashMap;

public class SearchValueonHashMap {

	public static void main(String args[]) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("First", "Pulkoria");
		hashmap.put("Second", "Mary");
		hashmap.put("Three", "Riya");
		hashmap.put("Four", "Nancy");
		System.out.println("HashMap All Values" + hashmap);
		if (hashmap.containsValue("Pulkoria")) {
			System.out.println("HashMap First Values");
		} else {
			System.out.println("HashMap Not First Values");
		}
		if (hashmap.containsValue("Bulls")) {
			System.out.println("HashMap Six Values");
		} else {
			System.out.println("HashMap Not Six Values");
		}
	}
}
