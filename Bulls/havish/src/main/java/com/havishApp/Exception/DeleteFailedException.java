package com.havishApp.Exception;

public class DeleteFailedException extends Exception{
	
	String errMessage="Delete Failed Exception";
	
	@Override
	public String toString() {
		return "DeleteFailedException [errMessage=" + errMessage + "]";
	}
	

}
