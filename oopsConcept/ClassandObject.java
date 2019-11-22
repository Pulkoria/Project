package oopsConcept;
/*A class can be considered as a blueprint or template using 
 * which you can create as many objects as you like
 * 
 * 
 * */
public class ClassandObject {
	//fields (or instance variable)
	   String email;
	   int id;

	   // constructor
	   ClassandObject(String email, int id){
	      this.email = email;
	      this.id = id;
	   }
	   public static void main(String args[]){
	      //Creating objects
		   ClassandObject obj1 = new ClassandObject("google.com", 5);
		   ClassandObject obj2 = new ClassandObject("google", 18);

	     //Accessing object data through reference
	     System.out.println(obj1.email+" "+obj1.id);
	     System.out.println(obj2.email+" "+obj2.id);
}
}