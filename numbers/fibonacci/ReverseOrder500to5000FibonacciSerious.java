
package programmes.numbers.fibonacci;

public class ReverseOrder500to5000FibonacciSerious {
	   public static void main(String[] args) {
	        int n = 5000, first = 500, next = 501;
	        
	        System.out.print("Till " + n + ": ");
	        while (first <= n)
	        {
	            System.out.print(first + " + ");
	            int sum = first + next;
	            first = next;
	            next = sum;
	        }
	    }
	   
}
