//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in); 
		
		
		out.print("Enter the first word :: ");
		String one = keyboard.next();

		out.print("Enter the second word :: ");
		String two = keyboard.next();

		StringEquality test = new StringEquality(one, two);

		test.setWords(one,two);
		test.checkEquality();
		out.print(test);
		
	}
}