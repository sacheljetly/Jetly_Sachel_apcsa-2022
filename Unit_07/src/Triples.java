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
	
	public int greatestCommonFactor(int a,int b, int c)
	{
		
		
		int lowest = Math.min(Math.min(a, b),c);

        for (int i = lowest; i > 0; i--) {
            if ((a % i == 0) && (b % i == 0)) {
                for (int j = i; j > 0; j--) {
                    if ((i % j == 0) && (c % j == 0)) {
                        return j;
                    }
                }
            }
        }

        return -1;
    }

	public boolean  isOdd(int a,int b, int c)
	{
		if ((a%2 == 0 && b%2==1) || (a%2==1 && b%2==0))
		{
			return true; 
		}
		return false; 
	}
	
	

	public String toString()
	{
		int max = number;
        String output = "";

        for (int a = 1; a <= max; a++) {
            for (int b = a + 1; b <= max; b++) {
                for (int c = b + 1; c <= max; c++) {
                    if (Triple(a,b,c) && isOdd(a,b,c) && (greatestCommonFactor(a, b, c) == 1)) {
                        output = "" + a + " " + b + " " + c + "\n";
                    }
                }
            }
        }

        return output;
	}
}