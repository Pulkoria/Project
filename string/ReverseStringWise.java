package programmes.string;

public class ReverseStringWise {
	public static void main(String[] args) {
		String s = "are you there Mary are you fine fine";
		String words[] = s.split(" ");
		String reverse = "";
		int i;
		for(i=0; i<words.length; i++) {
			String word = words[i];
			String reverseWord ="";
			for(int j=word.length()-1;j>=0; j--) {

				reverseWord=reverseWord+word.charAt(j)	;
			}
			reverse=reverse+reverseWord+ " ";			

		}
		System.out.print(reverse);
	}
}
