package programmes.collections.map;

import java.util.TreeMap;

public class CopyContentofTreeMap {
	public static void main(String args[]) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("First", "Pulkoria");
		treeMap.put("Second", "Mary");
		treeMap.put("Three", "Riya");
		treeMap.put("Four", "Nancy");
		System.out.println("Before Copy Content TreeMap" + treeMap);
		TreeMap<String, String> copytreeMap = new TreeMap<String, String>();
		copytreeMap.put("Five", "Sagar");
		copytreeMap.put("Sex", "Sachin");
		treeMap.putAll(copytreeMap);
		System.out.println("Afrer Copy Content TreeMap" + treeMap);

	}
}