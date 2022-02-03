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
		sentence= s; 
		lookFor = rem;
	}
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = sentence; 
		int locate = cleaned.indexOf(lookFor);
		while (locate >=0)
		{
			cleaned = cleaned.substring(0, locate) + cleaned.substring(locate+1);
			locate = cleaned.indexOf(lookFor);
		}
		
		return cleaned;
		
	}
		
		
		
		
		
	

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + ":  "+ removeLetters();
	}
}