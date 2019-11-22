package numbers;

public class Intial_20_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int n = 20;       
	        int counter = 1;    
	        int inputNumber = 2;         
	        System.out.println("Initial "+n+" Prime Numbers :");      
	        while (counter <= n)
	        {   
	            if (checkForPrime(inputNumber))
	            {
	                System.out.print(inputNumber+" ");               
	                counter++;       
	                inputNumber++;
	            }
	            else
	            {
	                inputNumber++;
	            }
	            
	        }  System.out.println();
	}


	static boolean checkForPrime(int inputNumber)
   {
       boolean isItPrime = true;
        
       if(inputNumber <= 1) 
       {
           isItPrime = false;
            
           return isItPrime;
       }
       else
       {
           for (int i = 2; i <= inputNumber/2; i++) 
           {
               if ((inputNumber % i) == 0)
               {
                   isItPrime = false;
                    
                   break;
               }
           }
            
           return isItPrime;
       }
   }
}