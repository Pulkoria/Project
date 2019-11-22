package programmes.array;

public class FirstHalfSumofElements {

	public static void main(String[] args) {
		int sum=0; 
	
		int numbers[] = {4,5,10,100,2,200,10,40,4,20};
		 int n =numbers.length;
		for (int i = 0; i < n/2; i++) {			
				sum = sum+numbers[i];
			
			} 
		System.out.println("FirstHalfSumofElements  :  "+sum);
	}
}
