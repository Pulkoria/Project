package programmes.string;

public class OneCharRotateString {
	 static String left(String s1, int d) {
		String leftRotate = s1.substring(d)+s1.substring(0, d);
		return leftRotate;
	}
	 static String right(String s1, int d) {
		 return left(s1, s1.length() -d);
	 }
	 
	
	public static void main(String[] args) {
		String s1 = "Mary";
		System.out.println(left(s1, 1));
		System.out.println(right(s1,1));
		
	}


}
