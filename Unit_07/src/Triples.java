//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
  

	public Triples()
	{
		this(1);
	}

	public Triples(int num)
	{
number = num; 

	}

	public void setNum(int num)
	{
number = num; 
int a, b, c = 0; 

	}
	public boolean Triple(int a, int b, int c)
	{
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
	}
	public int greatestCommonFactor(int num)
	{
	for (int a= 1; a<number -1; a++)
	{
		for (int b=a; b<number; b++)
		{
			int c= (int) Math.sqrt(a*a+b*b);
			if (c%1 ==0 )
			{
				out.println(a);
				out.println(b);
				out.println(c);
			}
		}
	}
	return 0 ;
	}
	

	public String toString(int a, int b, int c)
	{String output="";
		




		return output+greatestCommonFactor(a)+"\n";
	}
}