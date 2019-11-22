package programmes.collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsMap {
	public static void main (String args[]) {
		List<Student>student=new ArrayList<Student>();
		Student student1 = new  Student(1,"Pulkoria","05-04-1994","Madiwala" ,776038958);
		Student student2 = new  Student(2,"Mary","05-04-1994","Anna Nagar" ,776038958);
		student.add(student1);
		student.add(student2);
		// before java8
		Map<Integer, String> beforeJava8 = new HashMap<>();
		for(Student stu:student) {
			beforeJava8.put(stu.getId(), stu.getName());	
		}
		System.out.println("beforeJava8"+beforeJava8);
		
		// after java8
		Map<Integer, String>map = student.stream().collect(Collectors.toMap(x -> x.getId()  , x -> x.getName()));
		System.out.println("AfterJava8"+map);
		
	}
	
	
		
	}
	

