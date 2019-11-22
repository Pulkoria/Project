package com.javapoint;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class StringProgram {
	public static void reverseString(String original) {
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(original.charAt(i));
		}
	}
	 static String left(String s1, int d) {
			String leftRotate = s1.substring(d)+s1.substring(0, d);
			return leftRotate;
		}
		 static String right(String s1, int d) {
			 return left(s1, s1.length() -d);
		 }

	public static void main(String[] args) {
		// 1: reverse String Char
		String str, rev = "";
		str = "PulkoriaMary";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);
		System.out.println(rev);

		// 2: Recursive Alg
		String string = "Hellomary";
		reverseString(string);
		System.out.println();

		// 3: reverse First Half snd second half
		String s1 = "PulkoriaMary";
		String s2 = s1.substring(0, 8);
		String s3 = s1.substring(8);
		int length1 = s2.length();
		int length2 = s3.length();
		for (int i = length1 - 1; i >= 0; i--) {
			System.out.print(s2.charAt(i));
		}
		System.out.print("   ");
		for (int k = length2 - 1; k >= 0; k--) {
			System.out.print(s3.charAt(k));
		}
		System.out.println("");
		// 4: Reverse Word Program
		String strWord = "Hi Mary How are You";
		String[] words = strWord.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(strWord);
		System.out.println(reversedString);

		// 5:Duplicate char
		String s = "hello";
		@SuppressWarnings("unused")
		int count = 0;
		char[] ch = s.toCharArray();
		System.out.print(" Duplicate Char:");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.print(ch[i]);
					count++;
					ch[j] = 0;

					break;
				}
			}
		}
		System.out.println();
		// 6:Duplicate Collections
		String[] dup = { "java", "java", "Python", "Js", "Js", "Mvc" };
		List<String> list = Arrays.asList(dup);
		TreeSet<String> treeset = new TreeSet<String>(list);
		System.out.println(treeset);
		
		//7: Rotate one Char
		
		String strg = "Mary";
		System.out.println(left(strg, 1));
		System.out.println(right(strg,1));
	}
}
