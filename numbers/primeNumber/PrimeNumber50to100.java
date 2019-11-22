package programmes.numbers.primeNumber;

public class PrimeNumber50to100 {
	public static void main (String[] args) {
        for(int i=50; i < 100; i++){
                boolean isPrime = true;
                for(int j=2; j < i ; j++){

                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.print(i + " ");
        }
}
}
