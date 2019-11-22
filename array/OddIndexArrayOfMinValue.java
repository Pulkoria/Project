package programmes.array;

public class OddIndexArrayOfMinValue {
	public static void main(String[] args) {
		int array[] = {9,32,94,6,8,3,76,39,79,1,496};
		int min =  array[0];
		@SuppressWarnings("unused")
		int index = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 ==1) {
				min = array[i];
				for(int j=0; j<array.length; j++) {
					if(min > array[j]) {
						min = array[j];
						index = j;
					}
				}
				}
			}
			System.out.println("Minimum Value of odd Array:"+min);
		}
}
		
