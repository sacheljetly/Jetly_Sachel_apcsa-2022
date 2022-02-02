//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover(sentence, lookFor); 
	}

	public LetterRemover(String s, char rem)
	{
		
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		for (int i =0; i< sentence.length(); i++)
		{
		while (sentence.charAt(i) == lookFor)
			i++; 
		}
		
		String cleaned=sentence;
		return cleaned;
		
		
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}