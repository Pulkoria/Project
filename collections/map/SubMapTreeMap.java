package programmes.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SubMapTreeMap {
	public static void main(String args[]) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("1", "Pulkoria");
		treeMap.put("2", "sachin");
		treeMap.put("3", "subesh");
		treeMap.put("4", "aniRuth");
		treeMap.put("5", "java");
		System.out.println("Before SubMap:" + treeMap);
		Map<String, String> map = treeMap.subMap("1", "4");
		System.out.println("Afrer SubMap:" + map);
		Map<String, String> map1 = treeMap.subMap("1", true, "4", true);
		System.out.println("Afrer SubMap:" + map1);

	}
}
/*
 * class MysubMAp implements Comparator<String>{
 * 
 * @Override public int compare(String s1, String s2) { return s1.compareTo(s2);
 * 
 * 
 * } }
 */