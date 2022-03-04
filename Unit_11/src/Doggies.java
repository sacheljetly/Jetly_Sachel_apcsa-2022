//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		this.pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		Dog a = new Dog(age,name);
		this.pups[spot]=a;
		
	}

	public String getNameOfOldest()
	{
int location=0;
		
		for (int i=0; i<this.pups.length;i++)
		{
			if (this.pups[location].getAge()<this.pups[i].getAge());
			location =i; 
		}
		return this.pups[location].getName();
	}

	public String getNameOfYoungest()
	{
int location=0;
		
		for (int i=0; i<this.pups.length;i++)
		{
			if (this.pups[location].getAge()>this.pups[i].getAge());
			location =i; 
		}
		return this.pups[location].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}