package programmes.array;

public class OddIndexofMaxValue {
	public static void main(String[] args) {
		 int a[] = new int[]{14,44,23,234,2,888,23,78,4};

	       int max = a[0];
	       int index=0;

	       for(int i = 0; i < a.length; i++)
	       { if(i%  2 != 0) {
	    	   max = a[i];
	    	   for(int j = 0; j < a.length; j++) {
	            if(max < a[j])
	            {
	                max = a[j];
	                index=j;
	            }
	        }
	       }}
	        System.out.println("Index position of Largest value in a given array is  :  "+index);
	}
	
}
