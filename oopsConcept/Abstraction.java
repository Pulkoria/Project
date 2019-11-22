package oopsConcept;

/*Abstraction is a process where you show only “relevant” data and “hide” 
 * unnecessary details of an object from the user*/
public abstract class Abstraction {

	public abstract void getId();

	public abstract void getName();

	public void mobile() {
		System.out.println("77389587");

	}

}
class Student extends Abstraction {
	@Override
	public void getId() {
		System.out.println("1");

	}
	@Override
	public void getName() {
		System.out.println("Mary");

	}

	public static void main(String[] args) {
		Student student = new Student();
		student.getId();

	}

}
