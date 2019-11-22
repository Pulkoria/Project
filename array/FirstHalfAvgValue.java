package programmes.array;

public class FirstHalfAvgValue {
	public static void main(String[] args) {
		int sum=0; 
		int avg = 0;
		int numbers[] = {4,5,10,100,2,200,10,40,4,20};
		int n =numbers.length;
		int a = n/2;
		for (int i = 0; i < n/2; i++) {			
			sum = sum+numbers[i];
			avg = sum/a;
		} 

		System.out.println("FirstHalfSumofElements  :  "+avg);
	}
}
