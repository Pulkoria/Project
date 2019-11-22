package programmes.array;

public class OddIndexOfAvgValue {
	public static void main(String[] args) {
		int sum=0; 
		int odd=0;


		int numbers[] = {4,5,10,10,2,20,10,40,4};
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) { 
				sum = sum+numbers[i];
				odd++; 


			} 
		}

		int avg = sum/odd;
		System.out.println("Averge value Odd Index array is  :  "+avg);
		System.out.println("Averge value Odd Index array is  :  "+odd);
		System.out.println("Averge value Odd Index array is  :  "+sum);
	}


}

