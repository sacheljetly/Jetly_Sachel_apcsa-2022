//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		
		toyList = new ArrayList<Toy>(); 
	}

	public void loadToys( String toys )
	{
		
		String toy1[] = toys.split("");
		
	
		
		
		for (int i=0; i<toy1.length; i++) {
		
		
		int j; 
		for ( j=0; j<toyList.size(); j++)
		{
			if (toyList.get(j).getName().equals(toy1[i]))
			{
				toyList.get(j).setCount(toyList.get(j).getCount()+1);
				break;
			}
		}
		
		if (j==toyList.size())
		{
			Toy toy2 = new Toy(); 
			toy2.setName(toy1[i]);
			toy2.setCount(1);
			toyList.add(toy2);
		}
		}
		
	}
	
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy d:toyList)
  			if (d.getName().equals(nm))
  			{
  				return d; 
  			}
  		return null; 
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		 String result = "";
		for (int i=0; i<toyList.size()-1; i++)
		   {
			   result += toyList.get(i).getName() + toyList.get(toyList.size()-1).getCount();
			   
		   }
		 
		return result;
	}
}