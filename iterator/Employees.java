package programmes.iterator;

import java.util.*;
import java.util.Iterator;
import java.util.List;

public class Employees implements Iterable<Employee> {
	
	private List<Employee>emps=null;
	public Employees() {
		emps = new ArrayList<>();
		emps.add(new Employee(01,"Sagar", "TeamLeader", 1000000 ));
		emps.add(new Employee(02,"Dhana", "Customer", 20000));
		emps.add(new Employee(03,"Swathi", "Customer", 20000 ));
		emps.add(new Employee(04,"Sachin", "Senior Customer", 25000 ));
		emps.add(new Employee(05,"Mary", "Customer", 20000 ));
		emps.add(new Employee(06,"Monika", "Customer", 25000 ));
	}

	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return emps.iterator();
	}

}
