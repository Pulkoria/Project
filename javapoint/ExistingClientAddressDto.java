package com.javapoint;
import java.util.ArrayList;

public class ExistingClientAddressDto {
	// Ternary Operator Instead of if else condition
private static String mobileNumber;
private static String email;
private static String mobilphone;


	ExistingClientAddressDto(String mobileNumber,String email,String mobilphone){
	this.mobileNumber= mobileNumber;
	this.email=email;
	this.mobilphone= mobilphone;
	
	}

	public static String getDetails() {
		return getMobileNumber()+" "+getEmail()+" "+getMobilphone();
	}

public static String getMobileNumber() {
		return mobileNumber;
	}


	public void  setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public static String getEmail() {
		return email;
	}


	public  void setEmail(String email) {
		this.email = email;
	}


	public static String getMobilphone() {
		return mobilphone;
	}


	public  void setMobilphone(String mobilphone) {
		this.mobilphone = mobilphone;
	}



	@SuppressWarnings("static-access")
	public static void main (String args[]) {
		ExistingClientAddressDto addressDetais = new ExistingClientAddressDto("7760389587","samsung","abc@gmail.com");
		
		ArrayList<String>array = new ArrayList<>();
		String StreetNumberSeparater = "0";
		String result;		
		result = (addressDetais.getMobileNumber()!=null && !addressDetais.getMobileNumber().equals(""))? addressDetais.getMobileNumber():StreetNumberSeparater;
		addressDetais.setMobileNumber(result);
		array.add(result);
		result = (addressDetais.getEmail()!=null && !addressDetais.getEmail().equals(""))? addressDetais.getEmail():StreetNumberSeparater;
		addressDetais.setEmail(result);
		array.add(result);
		result = (addressDetais.getMobilphone() !=null && !addressDetais.getMobilphone().equals(""))? addressDetais.getMobilphone():StreetNumberSeparater;
		addressDetais.setMobilphone(result);
		array.add(result);
		System.out.println("result"+array);
	}
	
}
