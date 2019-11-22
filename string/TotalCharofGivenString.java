package programmes.string;

public class TotalCharofGivenString {
	public static void main(String[] args) {
	String s = "How are you Mary";
	int count = 0;
	for(int i=0; i<s.length(); i++) {
	 char ch =	s.charAt(i);
		if(ch!=' ' ) {
			count++;		
		}		
		}System.out.println("Total Char of Given String:"+"\t"+count);
	}
}
