//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckyThrees( long number )
	{
		int sum =0;
		int len = 0; 
		long num = number; 
		
		while (number >0)
		{
			len++;
			number/= 10; 
			
		}
		
		number = num; 
		long[] numz = new long[len];
		for (int i = 0; num != 0; i++)
		{
			numz[i] = number %10; 
			number /=10; 
		}
		
		for (int j = 0; j<numz.length-1; j++)
		{
			if (numz[j] ==3)
			{
				if (numz[j+1] ==3)
				{
					sum +=1; 
					j++;
				}
				else
				{
					sum++; 
				}
			}
		}
	return sum; 
		
	}
		
	}
