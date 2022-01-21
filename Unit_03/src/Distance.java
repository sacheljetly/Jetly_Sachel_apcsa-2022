//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		
		xOne = x1;
		yOne = y1; 
		xTwo = x2;
		yTwo = y2;
	} 

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1; 
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		//first part of the equation
		int i = (xTwo-xOne);
		double squareOne = Math.pow(i, 2);
		
		//second part of the equation
		int f = (yTwo-yOne);
		double squareTwo = Math.pow(f, 2);
		
		distance = Math.sqrt(squareOne + squareTwo);
		
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}

	
}