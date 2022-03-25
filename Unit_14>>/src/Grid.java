//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		
		for (rows = 0; rows < grid.length; rows++)
		{
			for (cols = 0; cols<grid[rows].length; cols++)
			{
				grid[rows][cols] = vals[ (int) (Math.random()*5)];
			}
		}
		
		
		for ( int i =0; i<rows; i++)
			
		{
			for ( int j=0; j< cols; j++)
			{
				System.out.print(" " + grid[i][j]);
			}
			System.out.println();
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int index =0; 
		
		int [] num = new int[7];
		
		num[0] = countVals(vals[0]);
		num[1] = countVals(vals[1]);
		num[2] = countVals(vals[2]);
		num[3] = countVals(vals[3]);
		num[4] = countVals(vals[4]);
		num[5] = countVals(vals[5]);
		num[6] = countVals(vals[6]);
		
		System.out.println("\n a count is " + num[0]);
		System.out.println("\n b count is " + num[1]);
		System.out.println("\n c count is " + num[2]);
		System.out.println("\n 7 count is " + num[3]);
		System.out.println("\n 9 count is " + num[4]);
		System.out.println("\n x count is " + num[5]);
		System.out.println("\n 2 count is " + num[6]);
		
		int maxnum = 0; 
		for( int i=0; i<7; i++)
		{
			if (num[i]>= maxnum)
			{
				maxnum = num[i];
				index = i; 
			}
		}
		return vals[index];
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count =0; 
		for (int i = 0; i<grid.length; i++)
		{
			for (int j = 0; j<grid[0].length; j++)
			{
			if (grid[i][j] ==val)
				count++; 
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output=" occurs the most";
		
		return output;
	}
}