package com.javapoint;

import java.util.Comparator;

public class NameCompare implements Comparator<ComparableandComparator>{
		 public int compare(ComparableandComparator c1, ComparableandComparator c2) 
		 { 
		     return c1.getName().compareTo(c2.getName()); 
		 } 
}
