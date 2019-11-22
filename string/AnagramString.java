package programmes.string;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String s = new String ("Buls");
		String s1 = new String ("Buls");
		char ch[] = s.toCharArray();
		char ch1[] = s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		s = new String(ch);
		s1 = new String(ch1);
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Anagram String"); 
		}
		else {
			System.out.println("Anagram String Not"); 

		}
	}
	}


