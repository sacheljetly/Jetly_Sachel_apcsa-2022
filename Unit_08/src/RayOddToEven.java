//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	
	// Write a program that will search an array to find the first odd number. 
	//If an odd number is found, then find the first even number following the odd
	//number. Return the distance between the first odd number and the FIRST even
	//number. Return -1 if no odd numbers are found or there are no even numbers 
	//following an odd number.

	public static int go(int[] ray)
	{
	    int firstOdd=0; 
		int firstEven = 0; 
		int count =0; 
		
		for (int i = 0; i< ray.length; i++)
		{
				if ( ray[i]%2==1)
				{
					for (int d = i; d<ray.length; d++)
					{
						if (ray[d]%2==0)
						{
							return d-i; 
						}
					//firstOdd = i; 
				}
			break; 
			
		/*	for (int d = i; d<ray.length; d++)
			{
				if (ray[d]%2==0)
				{
					firstEven = d;
				break;
				}
				else
					count = 0; 
			}
			count = firstEven-firstOdd; 
			break; 
				
		}
		if (count ==0)
		{ 
			count = -1; 
	*/	
				}}
return -1; 
		
		
	
					
}}