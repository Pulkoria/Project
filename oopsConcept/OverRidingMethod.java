package oopsConcept;
/*Overriding sometimes referred to as Runtime Binding.It means which overridden method 
 * is to be invoked will be determined by reference type and not the instance type.
 * it is forced to implement all methods defined in abstract class if no other superclass 
 * implemented it in the hierarchy
 * */
public class OverRidingMethod extends StudentAbs {

	@Override
	public void getId() {
		System.out.println("GetId:" + " " + 1);

	}
	public static void main(String[] args) {
		OverRidingMethod obj = new OverRidingMethod();
		obj.getId();
	}
}
