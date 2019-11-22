package oopsConcept;
/*
The process by which one class acquires the properties and functionalities of 
another class is called inheritance
Java doesn't support multiple inheritance
 */

class Staff {

	String role = "Teacher";
	String school = "Tagore";

	void teaching() {
		System.out.println("General");
	}
}

public class MathStaffInhertitance extends Staff {

	String designation = "Math Teacher";

	void teaching() {
		System.out.println("Maths");
	}

	public static void main(String args[]) {

		MathStaffInhertitance obj = new MathStaffInhertitance();
		System.out.println(obj.designation);
		System.out.println(obj.role);

	}

}
