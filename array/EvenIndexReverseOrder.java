package programmes.array;

public class EvenIndexReverseOrder {
	public static void main(String[] args) {
		int numbers[] = {4,5,10,100,2,200,10,40,4,20};
		 int n =numbers.length;
		 int a[] = new int[n];
		 int j = n;
		for (int i = 0; i < n; i++) {			
			a[j-1] = numbers[i];
			j = j-1;
			
			} 
		System.out.println("EvenIndexReverseOrder:");
		for (int x = 0; x < n; x++) {	
			if(x%2==0) {
			System.out.print("\t "+a[x]);
			System.out.println("\t "+x);
		
			} }
	}
}
