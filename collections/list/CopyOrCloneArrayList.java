package programmes.collections.list;

import java.util.ArrayList;

public class CopyOrCloneArrayList {

@SuppressWarnings("unchecked")
public static void main(String args[]) {
	ArrayList<String>list = new ArrayList<String>();
	list.add("First");
	list.add("Second");
	list.add("Third");
	list.add("Four");
	list.add("Fix");
	list.add("Sex");
	System.out.println("BeforeClone"+list);
	ArrayList<String>cloneList = (ArrayList<String>)list.clone();
	System.out.println("AfterClone"+cloneList);
	
}
}
