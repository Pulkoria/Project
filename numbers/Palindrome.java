package numbers;

public class Palindrome {

	public static void main(String args[]) {

		int n = 121;
		int rev = 0;
		int number = n;

		while (n != 0) {
			rev = rev * 10;
			rev = rev + n % 10;
			n = n / 10;
		}
		if (number == rev) {
			System.out.println("true");

		} else {

			System.out.println("false");

		}

	}
}