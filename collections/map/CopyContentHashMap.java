package programmes.collections.map;

import java.util.HashMap;

public class CopyContentHashMap {
	public static void main(String args[]) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("First", "Pulkoria");
		hashmap.put("Second", "Mary");
		hashmap.put("Three", "Riya");
		hashmap.put("Four", "Nancy");
		System.out.println("Before Copy Content HashMap" + hashmap);
		HashMap<String, String> copyhashmap = new HashMap<String, String>();
		copyhashmap.put("Five", "Sagar");
		copyhashmap.put("Sex", "Sachin");
		hashmap.putAll(copyhashmap);
		System.out.println("Afrer Copy Content HashMap" + hashmap);

	}
}
