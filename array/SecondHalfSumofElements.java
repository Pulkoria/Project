package programmes.array;

public class SecondHalfSumofElements {
	public static void main(String[] args) {
		int sum=0; 
	
		int numbers[] = {4,5,10,100,2,200,10,40,4,20};
		 int n =numbers.length;
		for (int i = n/2; i < n; i++) {			
				sum = sum+numbers[i];
			
			} 
		System.out.println("SecondHalfSumofElements  :  "+sum);
	}
}
