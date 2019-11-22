package programmes.collections.map;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

class Employee {
	private int salary;
	private String name;

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}

}

class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() < o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class FirstKeyElementonTreeMap {
	public static void main(String args[]) {
		TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>(new MyComparator());
		treeMap.put(new Employee("Pulkoria", 5000), "Emp001");
		treeMap.put(new Employee("Nancy", 5000), "Emp002");
		treeMap.put(new Employee("Swathi", 8000), "Emp003");
		treeMap.put(new Employee("Sagar", 10000), "Emp004");
		Employee employee = treeMap.firstKey();
		System.out.println("Higest Salary" + employee);
		Entry<Employee, String> entry = treeMap.firstEntry();
		System.out.println("Higest Salaryt:" + entry.getKey() + " -" + entry.getValue());

	}
}