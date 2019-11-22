package programmes.array;

public class SecondHalfMaxValue {

	public static void main(String[] args) {
		int numbers[] = {1,5,5000,100,2,200,10,40,4,20};
		int max=numbers[0]; 
		 int n =numbers.length;
		for (int i = n/2; i < n; i++) {			
			if(numbers[i]>max) {
				max = numbers[i];
			}
			
			} 
		System.out.println("SecondHalfMaxValue  :  "+max);
	}
}
