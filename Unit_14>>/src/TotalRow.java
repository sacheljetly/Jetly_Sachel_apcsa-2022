//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int count =0; 
    	List<Integer> total = new ArrayList<Integer>();
    	
    	
    		for ( int row[] : m)
    		{
    			for (int column : row)
    			{
    			count += column; 
    			}
    			
    			total.add(count);
    			count =0;
    		}
    		
    	
		return total;
		
    }
}
