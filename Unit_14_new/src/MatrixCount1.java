//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

import static java.lang.System.out;

import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
		//add code
		return 0;
    }
}


private String[][] grid;

//load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		Grid = new String[r][c];
		
		for (r = 0; r < Grid.length; r++)
		{n
			for (c = 0; c<Grid[rows].length; c++)
			{
				Grid[r][c] = vals[ (int) (Math.random()*5)];
			}
		}
		for (int i =0; i<r; i++)
		{
			for (int j=0; j<c; j++)
			{
				System.out.print(" " + Grid[r][c]);
			}
			System.out.println();
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count =0; 
		for (int i = 0; i<Grid.length; i++)
		{
			for (int j = 0; j<Grid[0].length; j++)
			{
			if (grid[i][j] ==val)
				count++; 
			}
		}
	}

	//display the grid
	public String toString()
	{
		String output=" is the most common value";
		return output;
	}
	
	
	
	

	String [] vals = { "a" , "b" , "c" , "7", "9", "x", "2"}; 
	Grid test = new Grid(20, 20, vals); 
	out.println(test);
	}
}