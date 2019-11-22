package numbers;

public class Sumofeven_GivenTwoNum {

	public static void main(String args[]) {
		int sum = 0;
		for (int i = 5; i <= 10; i++) {
			if (i % 2 == 0)

			{

				sum = sum + i;
			}
		}
		System.out.println("Even: " + sum);
	}
}