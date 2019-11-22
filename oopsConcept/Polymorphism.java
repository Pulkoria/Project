package oopsConcept;

/* it is a object oriented programming feature that allows 
 * us to perform a single action in different ways*/
public class Polymorphism extends Attendance {

	public void moriningWise() {
		System.out.println("Morning");
	}

	public void afternoonWise() {
		System.out.println("AfternoonWise");
	}

	public void dayWise() {
		System.out.println("Child DayWise");
	}

	public static void main(String args[]) {
		Attendance obj = new Polymorphism();
		obj.dayWise();
	}
}

class Attendance {
	public void dayWise() {
		System.out.println("Prient WeekDays");
	}
}