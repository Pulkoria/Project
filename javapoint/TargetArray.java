package com.javapoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TargetArray {
public static void main(String[] args) {
// Sum and Multiplication Array target Array 	
	 int[] numbers= {1,2,3,4,5,6};	
		int sum = 6;		
		for(int i=1; i<=numbers.length;i++) {		
		int first =i;
		for(int j=i+1; j<=numbers.length;j++) {	
			int second =j;
			
			if((first+second)==sum) {
				System.out.println(first+" "+second);
			}
		}
	}
//string to char array	
	String str = "Java4s";
	char[] array= str.toCharArray();
	for(char ch :array) {
		System.out.println(ch);
	}
	
// how to sting to arraylist	
		String[] s = {"Mary","Sagar"};
		List<String>li=Arrays.asList(s);
		System.out.println(li);
		

//remove duplicate values from arrayList

String[] dup= {"java","java","Python","Js","Js","Mvc"};
List<String>list=Arrays.asList(dup);
TreeSet<String> treeset=new TreeSet<String>(list);
System.out.println(treeset);

//arraylist to string array
List<String> al = new ArrayList<String>();
al.add("one");al.add("two");al.add("Three");
String[] arrayobject=new String[al.size()];
al.toArray(arrayobject);
for(String temp:arrayobject) {
System.out.println(temp);
}





}

}


	
