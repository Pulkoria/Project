package programmes.collections.list;
import java.util.LinkedList;

public class CopyLinkedListArray {
	public static void main(String args[]) {
		LinkedList<String>list = new LinkedList<String>();
		list.add("Java");
		list.add("Python");
		list.add("DotNet");
		list.add("Mysql");
		System.out.println("LinkedList:"+list);
		String[] arrList = new String[list.size()];
		System.out.println("LinkedList:");
		list.toArray(arrList);
		for(String s : arrList) {
			System.out.println(s);
		}
		
}
}