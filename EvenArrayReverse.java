package programmes.array;

public class EvenArrayReverse {
	public static void main(String[] args) {
		int numbers[] = {4,5,10,100,77,80,89,200,47,204};
		int n =numbers.length;
		int a[] = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {			
			a[j-1] = numbers[i];
			j = j-1;

		} 
		System.out.println("Reversed Even Array:");
		for (int k = 0; k < n; k++) {	
			if(a[k]%2==0) {
				System.out.print("\t "+a[k]);


			} }
	}
}
