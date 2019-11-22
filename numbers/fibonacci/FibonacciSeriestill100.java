package programmes.numbers.fibonacci;

public class FibonacciSeriestill100 {
    public static void main(String[] args) {
        int n = 100, first = 0, next = 1;
        
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
