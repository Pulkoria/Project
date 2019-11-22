package programmes.string;
public class CountOccuranceofString {
	public static void main(String[] args) {
		String s = "aaaabbbccc";
		int count = 0;
		int i;
		int j;
		for(i=0; i<s.length(); i++) {
			count = 1;
			for(j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				s = s.substring(0, j)+s.substring(j+1);		
				}
			}	
			System.out.println(s.charAt(i)+" "+count);	
		}			
}
} 

