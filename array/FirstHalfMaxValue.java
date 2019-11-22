package programmes.array;

public class FirstHalfMaxValue {
	public static void main(String[] args) {
		int numbers[] = {4,5,5000,100,2,200,10,40,4,20};
		int max=numbers[0]; 
		 int n =numbers.length;
		for (int i = 0; i < n/2; i++) {			
			if(numbers[i]>max) {
				max = numbers[i];
			}
			
			} 
		System.out.println("FirstHalfmaxValue  :  "+max);
	}
}
