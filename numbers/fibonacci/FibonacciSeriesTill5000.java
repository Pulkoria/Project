package programmes.numbers.fibonacci;

public class FibonacciSeriesTill5000 {
    public static void main(String[] args) {
        int n = 5000, first = 0, next = 1;
        
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