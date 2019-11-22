package numbers;

public class bigger_Smaller_Middle_Number {
	public static void main(String args[]) {
	int num1 = 4;
	int num2 = 10;
	int num3 = 34;
	int largerstNum, smallestNum, middleNum;
	if (num1 > num2 && num1 > num3) {
		largerstNum = num1;
		if (num2 > num3) {
			middleNum = num2;
			smallestNum = num3;
		} else {
			middleNum = num3;
			smallestNum = num2;
		}
	} else {
		if (num1 > num3) {
			middleNum = num1;
			if (num2 > num3) {
				largerstNum = num2;
				smallestNum = num3;
			} else {
				largerstNum = num3;
				smallestNum = num2;

			}
		} else {
			smallestNum = num1;
			if (num2 > num3) {
				largerstNum = num2;
				middleNum = num3;
			} else {
				largerstNum = num3;
				middleNum = num2;
			}
		}

		System.out.println("Highest Number is : " + largerstNum);
		System.out.println("Smallest Number is : " + smallestNum);
		System.out.println("Middle Number is : " + middleNum);
	}
}
}
