package programmes.string;

public class ReverseString {
	public static void main(String[] args) {
	String original ="";
	original="Mary";
	int length = original.length();
	for(int i= length-1; i>=0; i--) {	
		System.out.print(original.charAt(i));
		
	}
}}
