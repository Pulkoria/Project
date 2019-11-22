package programmes.numbers.primeNumber;

public class InitialSum30PrimeNumber {
    private static boolean isPrimeNumber(int number){
        
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
	public static void main(String args[]){
        
        int number = 2;
        int count = 0;
        long sum = 0;
        while(count < 10){
            if(isPrimeNumber(number)){
                sum += number;
            }
       
        }
        System.out.println("InitialSumof30PrimeNumber:"+sum);
    } 

}
