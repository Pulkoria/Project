package programmes.string;

public class CheckOneRotationtoOther {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "ava";
		if(rotation(s1,s2)) {
			System.out.println("Yes:" + " " +s1+ " " +"Is Rotation" +" "+s2);
		}else{
			System.out.println("No:" + " " +s1+ " " +"Is Not Rotation" +" "+s2);	
		}
	}
	public static boolean rotation(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		String s3 = s1+s2;
		if(s3.contains(s2))
			return true;
		else
			return false;

	}}
