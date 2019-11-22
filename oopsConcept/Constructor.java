package oopsConcept;

/*Constructor looks like a method but it is in fact not a method.
 *  It’s name is same as class name and it does not return any value
 *  */
public class Constructor {
	int age;
	String name;

	// Default constructor
	Constructor() {
		this.name = "Mary";
		this.age = 24;
	}

	// Parameterized constructor
	Constructor(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor("Steve", 56);
		System.out.println(obj1.name + " " + obj1.age);
		System.out.println(obj2.name + " " + obj2.age);
	}

}
