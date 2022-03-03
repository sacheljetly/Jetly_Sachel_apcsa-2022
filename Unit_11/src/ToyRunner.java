//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy Toy1 = new Toy("ball");
		Toy1.setCount(3);
		
		Toy Toy2 = new Toy();
		Toy2.setName("jump rope");
		Toy2.setCount(4);
		
		System.out.println(Toy1.getName() + "  " + Toy1.getCount());
		System.out.println(Toy2.getName() + "  " + Toy2.getCount());
		
	}
}