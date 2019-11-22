package numbers;

public class FibonicSerios {
	public static void main(String args[]) {
		int first = 0, next = 1, n = 50;
		while (first <= n) {
			int sum = first + next;
			first = next;
			next = sum;
			System.out.print(first+" ");
		}
		System.out.println();
	}

/*	public static void fib() {
		int first = 100, next = 101,number = 1000;
		System.out.print("Till " +number + ": ");
		while (first <= number) {
			System.out.print(first + " + ");
			int sum = first + next;
			first = next;
			next = sum;

		}
	}*/
}