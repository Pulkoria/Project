package com.havishApp.Exception;

public class UpdateFailedException extends Exception{
	
	String errMessage="Update Failed Exception";
	
	@Override
	public String toString() {
		return "UpdateFailedException [errMessage=" + errMessage + "]";
	}
	

}
