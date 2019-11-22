package programmes.array;

public class SecondHalfReverseArray {
	public static void main(String[] args) {
		int numbers[] = {4,5,10,100,2,200,10,40,4,20};
		 int n =numbers.length;
		 int a[] = new int[n];
		 int j = n;
		for (int i = n/2; i < n; i++) {			
			a[j-1] = numbers[i];
			j = j-1;
			
			} 
		System.out.println("ReverseSecondHalfArray  :  "+j);
		for (int x = n/2; x < n; x++) {			
			System.out.print("\t "+a[x]);
		
			} 
	}
}