package programmes.string;
public class CountNumofWordsInString {
	public static void main(String[] args) {
	String s = "How are you Mary";
	int count = 0;
	for(int i=0; i<s.length()-1; i++) {
		if(s.charAt(i)==' ' && s.charAt(i+1)!=' ' ) {
			count++;		
		}		
		}System.out.println("CountNumofWordsInString:"+"\t"+count);
	}

}
