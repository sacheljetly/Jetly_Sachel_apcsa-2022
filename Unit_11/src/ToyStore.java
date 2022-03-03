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
		toyList = new ArrayList<Toy>(); 
		ArrayList<String> toyss = new ArrayList<>(Arrays.asList((( toys.split(",")))));
	if (toyss.size()>1) {
		for (int i=0; i<toyss.size(); i+=2) {
		 String name = toyss.get(i);
		String toytype = toyss.get(i+1);
		Toy f = getThatToy(name);
		
		if (toyList.get(i).getName()==null)
		{
		toyList.get(i).setCount(toyList.get(i).getCount()+1);
		}
		else
		{
			String namef = toyss.get(i);
			String type = toyss.get(i+1); 
			Toy t = getThatToy(name);
		}
		}}
		
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
	   return toyList.toString();
	}
}