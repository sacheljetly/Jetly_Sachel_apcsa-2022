//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		System.out.println("10000 is even :: " + NumberVerify.isEven(10000));
		System.out.println("12345 is odd :: " + NumberVerify.isOdd(12345));
		System.out.println("12345 is even :: " + NumberVerify.isEven(12345));
		System.out.println("1 is even :: " + NumberVerify.isEven(1));
		System.out.println("1 is odd :: " + NumberVerify.isOdd(1));
		System.out.println("17 is even :: " + NumberVerify.isEven(17));
		System.out.println("17 is odd :: " + NumberVerify.isOdd(17));
		
		

	}
}