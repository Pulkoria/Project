package programmes.string;

public class ReverseFirstHalfandSecondHalf {
	public static void main(String[] args) {
	String s1 = "PulkoriaMary";
	String s2 = s1.substring(0,8);
	String s3 = s1.substring(8);
	int length = s2.length();
	int length1 = s3.length();	
	for(int i= length-1; i>=0; i--) {
		
		System.out.print(s2.charAt(i));
	}
	System.out.print("   ");
	for(int k= length1-1; k>=0; k--) {
		System.out.print(s3.charAt(k));

	}
}
}
