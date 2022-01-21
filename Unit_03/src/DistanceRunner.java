//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
	
		Distance cat = new Distance(1,2,3,4); 
		
		int x1;
		int y1;
		int x2;
		int y2;
		
			
	//User input for values	
		Scanner keyboard = new Scanner(System.in);
		out.print("Input a value for x1 :: ");
		x1= keyboard.nextInt();
		out.print("Input a value for y1 :: ");
		 y1 = keyboard.nextInt();
		 out.print("Input a value for x2 :: ");
		 x2= keyboard.nextInt();
		 out.print("Input a value for y2 :: ");
		 y2 = keyboard.nextInt();
	//Setting values based on input	 
		cat.setCoordinates(x1, y1, x2, y2);
		
		cat.calcDistance();
		out.print("Distance :: ");
	System.out.printf("%.3f\n", cat.getDistance());	
	
	}
}