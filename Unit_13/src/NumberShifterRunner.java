//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		
		for (int i = 0; i<3; i++)
	{
			System.out.println("\n\n");
		
			int [] arr = NumberShifter.makeLucky7Array(7);
		
		System.out.println(Arrays.toString(arr));
		
		NumberShifter.shiftEm(arr);
			
			
			System.out.println(Arrays.toString(arr));
		}
	}
}



