package programmes.collections.map;

import java.util.HashMap;

public class DeleteAllElementsOnHashMap {
	public static void main(String args[]) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("First", "Pulkoria");
		hashmap.put("Second", "Mary");
		hashmap.put("Three", "Riya");
		hashmap.put("Four", "Nancy");
		System.out.println("Before Delete AllElements On HashMap" + hashmap);
		hashmap.clear();
		System.out.println("After Delete AllElements On HashMap" + hashmap);
	}
}
