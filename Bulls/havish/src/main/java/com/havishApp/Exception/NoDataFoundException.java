package com.havishApp.Exception;

public class NoDataFoundException extends Exception{
	
	String errMessage="No Data Found!!";
	
	@Override
	public String toString() {
		return "NoDataFoundException [errMessage=" + errMessage + "]";
	}
	
}
