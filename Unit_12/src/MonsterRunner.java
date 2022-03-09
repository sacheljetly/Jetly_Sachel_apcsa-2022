//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name :");
		String name= keyboard.next();
		
		System.out.println("Enter 1st monster's size : ");
		int size= keyboard.nextInt();
		
		Skeleton s = new Skeleton(name,size);
		
		System.out.println("Enter 2nd monster's name :");
		String n= keyboard.next();
		
		System.out.println("Enter 2nd monster's size : ");
		int p = keyboard.nextInt();
		
		Skeleton s2= new Skeleton(n,p);
		
		System.out.println("Monster 1 - " + s.getName() +" --> "+ s.getHowBig());
		System.out.println("Monster 2 - " + s2.getName()+ " --> "+ s2.getHowBig());
		
		
		if (s.isBigger(s2))
		{
			System.out.println("Monster one is bigger than Monster 2");
		}
		
		else
		{
			System.out.println(" Monster two is bigger than Monster 1");
		}
		
		if (s.namesTheSame(s2))
		{
			System.out.println("Monster one and two have the same name");
			
		}
		else 
		{
			System.out.println("The monsters do not have the same name");
		}
		//instantiate monster one
		
		//ask for name and size
		
		//instantiate monster two
	}
}