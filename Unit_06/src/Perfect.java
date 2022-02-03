//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect()
   {
	   
   }
   
   public Perfect(int num)
   {
	   setNum(number);
   }

	public void setNum(int num)
	{
		number = num;
	}

	public boolean isPerfect(int number)
	{
		
		int divisorSum=0; 
		
		for (int i=1; i<= number/2; i++)
		{
				{
					if (number %i ==0)
						divisorSum += i; 
				}
		
		}
		
		if (divisorSum == number)
			return true;
		return false; 
	}
	

	
}