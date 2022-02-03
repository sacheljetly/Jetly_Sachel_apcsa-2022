//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect(); 
		
		System.out.println( "496 is a perfect number :: " + test.isPerfect(496));
	System.out.println( "45 is a perfect number :: " + test.isPerfect(45));
		
	System.out.println("6 is a perfect number ::  " + test.isPerfect(6));
	
	System.out.println("14 is a perfect number :: " + test.isPerfect(14));
	
	System.out.println("8128 is a perfect number :: " + test.isPerfect(8128));
	System.out.println("1245 is a perfect number :: " + test.isPerfect(1245));
	System.out.println("33 is a perfect number :: " + test.isPerfect(33));
	System.out.println("28 is a perfect number :: " + test.isPerfect(28));
	System.out.println("27 is a perfect number :: " + test.isPerfect(27));
	System.out.println("33550336 is a perfect number :: " + test.isPerfect(33550336));
	
	}
	
}