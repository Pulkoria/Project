package numbers;

public class PrimeNum_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=14;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}if(!flag) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
