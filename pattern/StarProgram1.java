package pattern;

public class StarProgram1 {

	public static void main(String[] args) {
		System.out.println("1 st Program:");
		firstProgram();
		System.out.println("2 nd Program:");
		secondProgram();
		System.out.println("3rd Program:");
		thirdProgram();
		System.out.println("4 th Program:");
		fourthProgram();
		System.out.println("5th Program:");
		fifthProgram();
		System.out.println("6th Program:");
		sixProgram();
		System.out.println("7th Program:");
		seventhProgram();
		System.out.println("8th Program:");
		eightProgram();
		System.out.println("9th Program:");
		ninethProgram();
		System.out.println("10th Program:");
		tenthProgram();
		System.out.println("11th Program:");
		elventh();
		System.out.println("12th Program:");
		twleProgram();
		System.out.println("13th Program:");
		thirteenProgram();

	}

	// 1.First Program-dimond
	public static void firstProgram() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= ((i * 2) - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 3 - 1; i >= 1; i--) {
			for (int j = 3 - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= ((i * 2) - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 2-Program full-tri-Star-forward
	public static void secondProgram() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= ((i * 2) - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 3-Half triangle star-forward
	public static void thirdProgram() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// 4-Half triangle star-forward -opp
	public static void fourthProgram() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 5-Half triangle star-backward 
	public static void fifthProgram() {
		for (int i = 1; i <= 3; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print("*");
			}
			for (int j =1 ; j < i; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
	}

	// 6.full-tri-backward Program
	public static void sixProgram() {
		for (int i = 4; i >=1; i--) {
			for (int k = 1; k <= ((i * 2) - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

		}
		System.out.println();
	}

	//7-side triangle
	public static void seventhProgram() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4-1; i++) {
			for (int j = 4-1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//8.side triangle-leftSide
	public static void eightProgram() {	
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}for(int k=1;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i = 1; i <= 4-1; i++) {	
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}for(int k=4-1;k>=i;k--) {
				System.out.print("*");
			}System.out.println();	
		}
	}

	//9.Side Program increse the space
	public static void ninethProgram() {
		for(int i=1;i<=4;i++) {
			for(int j=4-1;j>=i;j--) {
				System.out.print(" ");	
			}for(int k=1;k<=4;k++) {
				System.out.print("*");		
			}System.out.println();
		}
	}
	//10.Side Program decrease the space
	public static void tenthProgram() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");			
			}for(int k=1;k<=4;k++) {
				System.out.print("*");		
			}System.out.println();
		}
	}
	//11.Star Program

	public static void elventh() {
		for(int i =5; i>=1; i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}	
			System.out.println();
		}
		for(int i=2;i<=5;i++) {
			for (int j = i; j >= 1; j--)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}
//12.12thPrgram	
	public static void twleProgram() {
		 for (int i=1; i<=4; i++)
	        {
	            for (int j=1; j<=4; j++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

//13.thireteen Program
	public static void thirteenProgram() {
    for (int i=1; i<=5; i++)
    {
        for (int j=1; j<=5; j++)
        {
            if(i ==1 || i == 5   || j == 1 || j == 5 )
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
	}























































}
