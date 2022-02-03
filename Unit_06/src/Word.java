//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
	}

	public Word(String s)
	{
		setString(word); 
	}

	public void setString(String s)
	{
		word = s; 
	}

	public char getFirstChar()
	{
		char first = word.charAt(0);
		return first; 
	}

	public char getLastChar()
	{
		char last = word.charAt(word.length()-1);
		return last;
	}

	public String getBackWards()
	{
		String back="";
		
		for ( int i = word.length()-1; i>=0; i--)
		{
			back = back+ word.charAt(i);
		}
		return back;
	}

 	public String toString()
 	{
 		return "\n "+getFirstChar() +"\n " + getLastChar() +"\n " + getBackWards() +"\n " + word +" \n";
	}
}