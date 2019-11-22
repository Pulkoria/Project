package programmes.numbers.fibonacci;

public class FibonacciSeries100to10000 {
	   public static void main(String[] args) {
	        int n = 10000, first = 100, next = 101;
	        
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
