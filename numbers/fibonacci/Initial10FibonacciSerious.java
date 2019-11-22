package programmes.numbers.fibonacci;

public class Initial10FibonacciSerious {

	public static void main(String[] args) 
	{/*
	
		 int maxNumber = 10; 
		 int previousNumber = 0;
		 int nextNumber = 1;
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            System.out.print(previousNumber+" ");
	        }
	}
*/
		
	
	
			 
		
			int a = 1;
			int b = 0;
			int ch = 10;
			;
			for (int i = 0; i < ch; i++) {
				System.out.print(b);
				b = a + b;
				a = b - a;
				if (i <= ch - 2) {
					System.out.print(", ");
				}
				if (i == ch - 1) {
					System.out.println("\nThese are the first " + ch + " Fibonacci Numbers!");
				}
			}
		}
	}
	