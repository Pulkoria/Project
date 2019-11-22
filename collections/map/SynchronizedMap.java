package programmes.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {
	public static void main(String args[]) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Mary");
		map.put("2", "Leema");
		map.put("3", "Stephen");
		map.put("4", "Four");
		map.put("5", "Five");
		Map<String, String> synMap = Collections.synchronizedMap(map);
		System.out.println("SynchronizedMap" + synMap);

	}
}
