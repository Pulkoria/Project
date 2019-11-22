package numbers;

public class Sum_primeNumber_givenTwoNum {

	public static void main(String args[]) {
		int a= 5; int b = 10; int sum=0;
		
		for(a=5;a<=10;a++) {
			
				if(isPrime(a)) {
					sum+=a;
				}
		}System.out.println("sumofgivenNumber"+sum);
						
		}

public static boolean isPrime(int num) {
	boolean flag=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=false;
			break;
		}
}
	return flag;	
}
}

