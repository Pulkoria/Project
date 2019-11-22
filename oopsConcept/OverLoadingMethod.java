package oopsConcept;

public class OverLoadingMethod {
/*Using the same Method name but with different argument is called overloading
* overloaded Method will be invoked at compile time on the basis of the reference type.
* Constructors can also be overloaded
* Overloaded Methods may have different access modifier.
* Overloaded Methods may throw different exception broader or narrow no restriction
* */
	
	public static void main(String args[]) 
	{
	Employee employee = new Employee() ;
	employee.emloyeeDetails(1,"Mary");
	employee.emloyeeDetails(2);
	}
}
class Employee{
	public void emloyeeDetails(int id) {
		System.out.println(id);
	}
	public void emloyeeDetails(int id,String Name) {
		System.out.println(id+""+Name);
	}
}