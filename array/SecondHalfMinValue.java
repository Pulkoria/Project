package programmes.array;

public class SecondHalfMinValue {
	public static void main(String[] args) {

		
	int numbers[] = {1,5,10,100,2,200,10,40,4,20};
	int min=numbers[0]; 
	 int n =numbers.length;
	for (int i= n/2; i < n; i++) {			
		if(numbers[i]<min) {
			min = numbers[i];
		}
		
		} 
	System.out.println("SecondHalfMinValue  :  "+min);
}
}

