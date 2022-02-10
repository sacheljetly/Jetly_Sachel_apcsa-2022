//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(letter); 
		setAmount(amount);
	}

	public TriangleFive(char c, int amt)
	{
		letter = c; 
		amount = amt; 
	}

	public void setLetter(char c)
	{
		letter = c; 
	}

	public void setAmount(int amt)
	{
		amount = amt; 
	}

	public String toString()
	{
	String output = "";
	int count = 0;
	
	do{
	for (int i = 1; i <= amount-count; i++) {
			output += "\n";
		
		for (int b = 1; b <= amount-count; b++){ 
			output += ((char)(count+  letter)) + "";
		}
	}
	count++;

	}while(count<=amount);
	
		
		

	


	return output;
		
	}
}