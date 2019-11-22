package programmes.array;

public class EvenIndexOfAvgValue {
	public static void main(String[] args) {
		int sum=0; 
		int even=0;
		int numbers[] = {4,5,10,10,2,20,10,40,4};
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) { 
				sum = sum+numbers[i];
				even++; 
			} 
		}
		int avg = sum/even;
		System.out.println("Averge value even Index array is  :  "+avg);
		System.out.println("Averge value even Index array is  :  "+even);
		System.out.println("Averge value even Index array is  :  "+sum);
	}
}
