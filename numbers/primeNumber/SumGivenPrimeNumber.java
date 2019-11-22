package programmes.numbers.primeNumber;

public class SumGivenPrimeNumber {
	@SuppressWarnings("unused")
	public static void main (String args[]) {
	int beg= 5; int end = 10; int i,num, count,sum = 0;
	
	for(num=beg; num<=end; num++) {
		count = 0;
		for(i=2; i<=num/2;i++){
			count++;
			break;
			}
		if(count!=0 && num!= 1) {
			sum = sum+num;
		}
		}
		System.out.println(sum);
	}
}


