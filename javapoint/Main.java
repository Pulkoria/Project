package com.javapoint;

import java.util.ArrayList;
import java.util.Collections;
public class Main {	
	public static void main(String[] args) 
    { 
		// comparable object is capable of comparing itself with another object 
		 // comparator object is capable of comparing  two different  object 
        ArrayList<ComparableandComparator> list = new ArrayList<ComparableandComparator>(); 
        list.add(new ComparableandComparator("Jerry", 2010, "jerry@gmail.com", "mumbai"));
        list.add(new ComparableandComparator("Achu", 2000, "acu@gmail.com", "Kerla"));
        list.add(new ComparableandComparator("Pulkoria", 2009, "pulkoria@gmail.com", "Chennai"));
        list.add(new ComparableandComparator("Monika", 2001, "monika@gmail.com", "Namakal"));
        list.add(new ComparableandComparator("Deva", 2005, "deva@gmail.com", "Andra"));
        list.add(new ComparableandComparator("Swathi", 2007, "swathi@gmail.com", "salam"));
        NameCompare nameCompare = new NameCompare();
       Collections.sort(list);
       System.out.println("Before:");  
       for(ComparableandComparator obj : list) {
       	
     	   System.out.println(obj.getYear()+" "+obj.getAddress()+" "+obj.getEmail()+" "+obj.getName());
     }
       Collections.sort(list,nameCompare);

        System.out.println("After:");     
        for(ComparableandComparator obj : list) {
        	
     	   System.out.println(obj.getYear()+" "+obj.getAddress()+" "+obj.getEmail()+" "+obj.getName());
     }
    
     
     
    }
} 

