package programmes.array;

public class EvenIndexOfMinValue {
	
	public static void main(String[] args) {
		 int a[] = new int[]{142,44,2,56,22,8,23,78,2};

	       int min = a[0];
	       int index=0;

	       for(int i = 0; i < a.length; i++)
	       { if(a[i]% 2 == 0) {
	    	   min = a[i];
	    	   for(int j = 0; j < a.length; j++) {
	            if(min > a[j])
	            {
	                min = a[j];
	                index=j;
	            }
	        }
	       }}
	        System.out.println("Index position of Smallest value in a given array is  :  "+index);
	}
	
}
