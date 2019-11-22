package numbers;

public class TotalDigitsofFirstHalfGivenNum {
	
	 static int getSum(int n) 
	    {     
	        int sum = 0; 
	          
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	            
	        } 
	      
	    return sum;
} 

// Driver program 
public static void main(String[] args) 
{ 
    int n = 12345; 

    System.out.println(getSum(n)); 
} 
} 
