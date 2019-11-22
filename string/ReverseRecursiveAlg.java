package programmes.string;

public class ReverseRecursiveAlg {
	
	public static void main(String[] args) {
		 String str = "Pulkoria"; 
		 reverseString(str); 
	}
	public static void reverseString(String original) {		
		int length = original.length();
		for(int i= length-1; i>=0; i--) {		
			System.out.print(original.charAt(i));		
		}	
	
	}		
}
