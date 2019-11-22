package stringProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class StringAllProgram {
	public static void main(String[] args) {
		anagram();
		palindrom();
		reverseWord();
		totalCount();
		removeWhiteSpace();
		charCount();
		collectioncharCount();
		recursiveAlg();
		withoutLength();
		duplicateCharCount();
		reverseFirstandSecondHalf();
		rotateOneChar();
		howManyword();

	}

	// 1.Anagram String
	public static void anagram() {
		String s1 = new String("Mary");
		String s2 = new String("bullsssssssss");
		char[] ch = s1.toCharArray();
		char[] ch1 = s2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		s1 = new String(ch);
		s2 = new String(ch1);
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Angram "+s1+" "+s2);
		} else {
			System.out.println("Angram Not "+s1+" "+s2);
		}
	}

	// 2 Palindrome or not
	public static void palindrom() {
		String s = "malayalam";
		String rev = "";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("palindrom:   "+" "+rev);
		} else {
			System.out.println("palindrom Not: "+rev);
		}
	}

	// 3 Word reverse String
	public static void reverseWord() {
		String s = "Hi Mary How are You";
		String words[] = s.split(" ");
		String rev = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			rev = rev + reverseWord + " ";
		}
		System.out.println("Word reverse String:"+" "+rev);
	}

	// 4.Total count
	public static void totalCount() {
		String s = "Pulkoria Mary";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				count++;
			}
		}
		System.out.println("Total Char Count  "+count);
	}
	//5.Remove White Space
	public static void removeWhiteSpace() {
		String s = "How are you Mary";
		String removeWhiteSpace = s.replaceAll("\\s", "");
		System.out.println(removeWhiteSpace);
	}


	// 6. Each character count
	public static void charCount() {
		String s = "google";
		int count = 0;
		int i;
		int j;
		for (i = 0; i < s.length(); i++) {
			count = 1;
			for (j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					s = s.substring(0, j) + s.substring(j + 1);

				}
			}
			System.out.println(s.charAt(i) + " " + count);
		}
	}

	// 7.Using collection Count Character
	public static void collectioncharCount() {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		String s = "google";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}
		System.out.println(s + hmap);
	}

	// 8.Recursive Alg
	public static void recursiveAlg() {
		String s = "mary";
		recursive(s);
	}

	// 9.With out Length
	public static void withoutLength() {
		String s1 = "PulkoriaMary";
		int i = 0;
		for (char c : s1.toCharArray()) {
			i++;
		}
		System.out.println("Lenth of String:" + i);
	}

	// 10.Using duplicate Count Character
	public static void duplicateCharCount() {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		String s = "google google";
		char[] strarray = s.toCharArray();
		for (char c : strarray) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);
			} else {
				hmap.put(c, 1);
			}
		}
		Set<Character> set = hmap.keySet();
		for (Character ch : set) {
			if (hmap.get(ch) > 1) {
				System.out.println(ch + " " + hmap.get(ch));
			}
		}
	}

	// 11.Reverse First Second Half
	public static void reverseFirstandSecondHalf() {
		String s1 = "PulkoriaMary";
		String s2 = s1.substring(0, 8);
		String s3 = s1.substring(8);
		int length = s2.length();
		int length1 = s3.length();
		System.out.print("ReverseFirstandSecondHalf: ");
		for (int i = length - 1; i >= 0; i--) {

			System.out.print(s2.charAt(i));
		}
		System.out.print("   ");
		for (int k = length1 - 1; k >= 0; k--) {
			System.out.print(s3.charAt(k));

		}
	}
	// 12.RotateOneChar
	public static void rotateOneChar() {
		String s1 = "Mary";
		System.out.println("\n"+"rotateOneCharLeft: "+left(s1, 1));
		System.out.println("rotateOneCharLeft:     "+right(s1,1));
		
		
	}
public static void fact() {
	int factorial=1;
	int num=10;
	 for(int i = 1; i <= num; ++i)
     {
          factorial = factorial * i;
       
     }
     System.out.printf("Factorial:"+factorial);
 }



  //13.Findout How many Word 
	public static void howManyword() {
		String s="hi mary how are you";
		int count = 0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i+1)!= ' ' && s.charAt(i)==' ') {
				count++; 
			}
		
		}	System.out.println("howManyword: "+count);
	}

	
	
	
	
	
	
	

	// inside method we call this one method
	static String left(String s1, int d) {
		String leftRotate = s1.substring(d)+s1.substring(0, d);
		return leftRotate;
	}

	static String right(String s1, int d) {
		return left(s1, s1.length() - d);
	}

	public static void recursive(String s) {
		int length = s.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Recursive Alg:    "+rev);


	}
}
