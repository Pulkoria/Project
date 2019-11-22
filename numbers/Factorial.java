package numbers;

public class Factorial {
 public static void main(String args[]) {
	 
	 int num = 10;
    int factorial = 1;
     for(int i = 1; i <= num; ++i)
     {
          factorial = factorial * i;
       
     }
     System.out.printf("Factorial:"+factorial);
 }
 }

