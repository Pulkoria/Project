package com.javapoint;

import java.util.ArrayList;
import java.util.LinkedList;

public class DifferArrayListandLinkedList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// array list works based on index ---its dynamically insert. if i want 
		// insert and remove some value b/w two index..its take time consumes... why means 3rd index is going to 4 etc...
		list.add("Mary");
		list.add("Bulls");
		list.add("Eruma");
		list.add("Swathi");
		System.out.println("Elements First:"+ list); 
		list.add(3,"Dhana");
		System.out.println("Elements after:"+ list);
		//adding string to 1st position
		list.add(0, "Moni");
		System.out.println("Elements Second:"+ list);		
		list.remove(2);
		System.out.println("Elements Second After:"+ list);
		LinkedList<String> list1 = new LinkedList<String>();
		// Link list works based on doubly linked ---like previous node and next node. if i want 
		// insert and remove some value b/w two numbers..it will check previous node and next node..it wouln't affect previous and next it seems its not take time consumes... why means 3rd index is going to 4 etc...
		list1.add("Mary");
		list1.add("Bulls");
		list1.add("Eruma");
		list1.add("Swathi");
		System.out.println("Elements First:"+ list1);
		list1.add(3,"Dhana");
		System.out.println("Elements after:"+ list1);
		//adding string to 1st position
		list1.add(0, "Moni");
		System.out.println("Elements Second:"+ list1);		
		list1.remove(2);
		System.out.println("Elements Second After:"+ list1);
		int[][] a=new int[][] {{1234567890},{1234567890}};
		for(int[] array:a) {
			System.out.println(array[0]);
		}
		
		
		


	}

}
