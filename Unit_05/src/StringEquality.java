//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	//Compare two strings to see if each of the two strings contains the same letters in the same order.

	private String wordOne, wordTwo;

	public StringEquality()
	{
	}

	public StringEquality(String one, String two)
	{ one = null;
	  two = null;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two; 
	}

	public boolean checkEquality( )
	{
		if ((wordOne.equals(wordTwo)== true) && (wordOne.compareTo(wordTwo) ==0))
		{
			return true; 
		}
		return false;
	}

	public String toString()
	{
		if (checkEquality() == true)
		{
		return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		return 
				wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}