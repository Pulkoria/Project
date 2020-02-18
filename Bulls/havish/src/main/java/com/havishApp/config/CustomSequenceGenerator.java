package com.havishApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.havishApp.Exception.NoRecordFoundException;
@Service
public class CustomSequenceGenerator implements ICustomSequenceGen{
	@Autowired
	ICustomSequenceDao customSequenceDao;
	
	public String getSequenceNumber() {
		
		String seqString  = "HAVADR";	
		String result = "";
		
		try {
			seqString = customSequenceDao.userCartIdSeq();
			String[]  str =seqString.split("R", 2);
			String prefix  = str[0];
			String sufix   =  str[1];
			int sufInt = Integer.parseInt(sufix)+1;
			String str1 = "HAVADR";
			
			if(sufInt > 0 && sufInt <=9) {
				String str2 = Integer.toString(sufInt); 
				System.out.println("str2"+str2);
				result = str1 + "000000"+str2 ;
				System.out.println("reslut"+result);
			}
		} catch (NoRecordFoundException e) {
			
			
		}
		
		
		return result;		
	}
}
