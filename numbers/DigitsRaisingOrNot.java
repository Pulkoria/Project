package numbers;

public class DigitsRaisingOrNot {
	   public static void main(String args[]) {
	        
	       int num;
	       boolean flag = false;
	       num = 123456;
	       int currentDigit = num % 10;
	       System.out.println("Digits are not in increasing order"+currentDigit);
	       num = num/10;
	       while(num>0){
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }
	           currentDigit = num % 10;
	           num = num/10;
	       }
	       if(flag){
	           System.out.println("Digits are not in increasing order");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }
	    
}}