package com.havishApp.Exception;

public class OTPMisMatchException extends Exception{
	

	String errMessage="Otp mismatch";

	@Override
	public String toString() {
		return "NoRecordFoundException [errMessage=" + errMessage + "]";
	}

}
