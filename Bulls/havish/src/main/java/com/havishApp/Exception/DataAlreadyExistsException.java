package com.havishApp.Exception;

public class DataAlreadyExistsException extends Exception{

	String errMessage="Data Already exists";
	
	@Override
	public String toString() {
		return "DataAlreadyExistsException [errMessage=" + errMessage + "]";
	}
}
