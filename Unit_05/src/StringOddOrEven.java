//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		
	}

	public StringOddOrEven(String s)
	{
		s= null; 
	}

	public void setString(String s)
	{
		word = s; 
	}

 	public boolean isEven()
 	{
		if (word.length()%2 ==0)
		{
			return true; 
		}
		return false;
	}

 	public String toString()
 	{
 		if (isEven() == true)
 		{
 			return word + (" is even");
 		}
 		return word+ (" is odd");
 		
	}
}