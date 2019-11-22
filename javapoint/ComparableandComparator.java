package com.javapoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ComparableandComparator implements Comparable<ComparableandComparator>{
	private  String name; 
    private  int year; 
    private  String email;
    private  String address;
    


	public ComparableandComparator(String name, int year, String email, String address) {
		this.name = name;
		this.year = year;
		this.email=email;
		this.address = address;
		
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public int getYear() {
		return year;
	}


	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public int compareTo(ComparableandComparator o) {
		// TODO Auto-generated method stub
		return this.year=o.year;
	}


/*	@Override
	public int compareTo(ComparableandComparator o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}*/
	
}


