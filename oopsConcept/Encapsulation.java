package oopsConcept;

/*Encapsulation simply means binding object state(fields) and behavior(methods) together. 
 * Make the instance variable private so that they cannot be accessed directly 
 * from outside the class. You can only set and 
 * get values of these variables through the methods of the class
 * 
 * */
public class Encapsulation {

	public static void main(String args[]) {
		Course course = new Course();
		course.setCourseName("NIIT");
		course.setId(1);
		System.out.println("OutPut" + course.getCourseName() + " " + course.getId());

	}
}

class Course {
	private int id;
	private String courseName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/*
	 * //Parameterized Constructor public Course(int id, String courseName) {
	 * super(); this.id = id; this.courseName = courseName; }
	 */

	// Default Constructor Not required to give

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}

}
