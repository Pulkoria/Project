package programmes.numbers;

public class Mulitiply4and5Printstill10 {
	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			if((i%4 == 0 )&&(i % 5 == 0 )) {
				System.out.println("Jara :  "+i);
			}	
			if((i % 5 == 0 )) {
				System.out.println("J2ee :  "+i);
			}
			if((i % 4 == 0 )) {
				System.out.println("java :  "+i);
			}
		}
	}
}
