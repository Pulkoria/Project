package programmes.string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckBalenceofBrackets {
	static char method(char ch) {
		if(ch=='(')
			return')';
		if(ch=='{')
			return'}';
		if(ch=='[')
			return']';
		return Character.MIN_VALUE;

	}
	static boolean checkMethod(char exp[], int n) {
		if (n==0) {
			return true;
		}
		if (n==1) {
			return false;
		}
		if(exp[0]== ')' || exp[0]=='}' || exp[0]== ']' )
			return false;
		char close = method(exp[0]);
		int i, count = 0;
		for(i=1; i<n; i++) {
			if(exp[i]==exp[0]) {
				count++;

			}
			if(exp[i]==close) {
				if(count==0) 
					break;
				count--;						
			}

		}
		if(i==n)
			return false;
		if(i==1)
			return checkMethod(Arrays.copyOfRange(exp, n-2,n), n-2);
		return checkMethod(Arrays.copyOfRange(exp, 1,n), i-1)&&
				checkMethod(Arrays.copyOfRange(exp, (i+1),n), n-i-1);

	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter");
		char exp[] = scanner.nextLine().toCharArray();
		int n = exp.length;
		if(checkMethod(exp, n)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
	}
}

