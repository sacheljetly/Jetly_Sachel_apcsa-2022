//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split("\t+");
		
	}

	public void sort()
	{
		Arrays.sort(wordRay);
		
	}

	public String toString()
	{
		String output="";
		
		for (String a : wordRay)
		{
			output+=a; 
			output+="\n";
		}
		return output+"\n\n";
	}
}