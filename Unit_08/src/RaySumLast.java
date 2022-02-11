//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	// Write a program that will loop through an array and
	//sum up all values > than the last value in the array.  
	//If there are no values greater than the last value in the array or
	//if the array is empty, return -1.

	public static int go(int[] ray)
	{
		int rayCount= 0; 
		for (int i =0; i<ray.length; i++)
		{
			if (ray[i]> ray[ray.length-1])
			{
				rayCount+=ray[i]; 
				
			}
			else rayCount += 0; 
			
		}
		if (rayCount<=0)
			rayCount = -1; 
		System.out.println(rayCount); 
		return rayCount;
		
	}
	
}