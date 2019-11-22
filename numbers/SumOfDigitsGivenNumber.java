package numbers;

public class SumOfDigitsGivenNumber {
	public static void main(String args[]) {
		int digitsNumber;
		int num = 1234;
		int sum = 0;
		while (num > 0) {
			digitsNumber = num % 10;
			sum = sum + digitsNumber;
			num = num / 10;

		}
		System.out.println("SumOfDigitsGivenNumber: " + sum);
	}
}
