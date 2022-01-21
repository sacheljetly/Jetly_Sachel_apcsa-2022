//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;


//Write a program to check 2 parameters.  If a is > b, return a - b.  If b is > a, return b - a.  If a is equal to b, return a * b.

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a > b)
		{
			double subtract = (a-b);
			return subtract;
		}
		else if (b > a)
		{
			double subtractTwo = (b-a);
			return subtractTwo;
		}
		return (a*b);
	}
}