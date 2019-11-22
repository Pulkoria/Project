package programmes.array;

public class EvenIndexArrayOfMaxValue {
	public static void main(String[] args) {
		int array[] = {9,2,4,6,8,34,76,39,79,67,46};
		int max =  array[0];
		@SuppressWarnings("unused")
		int index = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 == 0) {
				max = array[i];
				for(int j=0; j<array.length; j++) {
					if(max < array[j]) {
						max = array[j];
						index = j;
					}
				}
				}
			}
			System.out.println("Max Value of EvenIndex Array:"+max);
		}	
	}



