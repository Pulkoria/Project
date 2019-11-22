package programmes.numbers.primeNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder70t020PrimeNumer {
	public static void main(String args[])
	{
		int s1 = 20, s2=70;
		int count = 0, i, j;

		for(i = s1; i <= s2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count!=0)
			{
				System.out.println(i);
				//Collections.reverseOrder(i);
			}
		}
	}
}
