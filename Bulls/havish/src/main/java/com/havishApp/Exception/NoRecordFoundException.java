package com.havishApp.Exception;

public class NoRecordFoundException extends Exception{

	String errMessage="No Record Found";

	@Override
	public String toString() {
		return "NoRecordFoundException [errMessage=" + errMessage + "]";
	}
	
}
