package programmes.array;

public class SecondHalfAvgValue {
	public static void main(String[] args) {
		int sum=0; 
		int avg = 0;
		int numbers[] = {4,5,10,100,2,200,10,40,4,20};
		int n =numbers.length;
		int a = n/2;
		for (int i = n/2; i < n; i++) {			
			sum = sum+numbers[i];
			avg = sum/a;
		} 
		System.out.println("SecondHalfAvgValue  :  "+sum);
		System.out.println("SecondHalfAvgValue  :  "+a);
		System.out.println("SecondHalfAvgValue  :  "+avg);
	}
}
