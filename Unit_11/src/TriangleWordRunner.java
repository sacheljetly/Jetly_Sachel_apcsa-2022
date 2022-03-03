//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		
		Scanner keyboard = new Scanner(System.in);
		String word; 
		char go; 
		TriangleWord test = new TriangleWord(); 
		
		while (true)
		{
			System.out.println("Enter a Word :: ");
			word = keyboard.next(); 
			
			
			test.printTriangle(word);
			
			System.out.println("Do you want to enter more input");
			go = keyboard.next().charAt(0);
			
			if (go =='n')
				break; 
		}
		
	}
}