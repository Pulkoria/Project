package programmes.numbers;

public class PalindromeNumber {
	public static void main(String args[]) {
	int n, reverse=0;
	n = 1234567;
	int number = n;
	while(n != 0){
	reverse = reverse*10;
	reverse = reverse+n%10;
	n = n/10;
	}
	if(number == n) {
	System.out.println("Palindrome Number:" + number); 
	}else {
		System.out.println("Palindrome Number Not:" + number);
		}
	}
}
	
