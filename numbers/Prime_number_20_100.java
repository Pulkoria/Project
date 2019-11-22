package numbers;

public class Prime_number_20_100 {

	public static void main(String[] args) {
		for (int a = 20; a <= 100; a++) {
			if (isPrime(a))
				System.out.print(a + " ");
		}
	}

	public static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
