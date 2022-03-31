//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size]; 
    	int count =0;
    	for (int i =0; i<size; i++)
    	{
    		for (int j=0; j<size; j++)
    		{
    			if (m[i][j].equals(str.charAt(count)))
    					{
    				count++; 
    					}
    			
    		}
    	}
    }

    public boolean isFound( String word )
    {boolean found = false; 
    	for (int i =0; i< m.length; i++)
    	{
    		for (int j=0; j<m[i].length; j++)
    		{
    			
    			found = (checkRight(word,i,j) || checkLeft(word,i,j) || checkUp(word,i,j) || checkDown(word,i,j) || checkDiagUpRight(word,i,j) ||
    	checkDiagUpLeft(word,i,j) || checkDiagDownLeft(word,i,j) || checkDiagDownRight(word,i,j));
    					
    					    		}
    		
    	}
    	if (found = true)
		{
			return found;
		}

    	return false;
    }

    
	public boolean checkRight(String w, int r, int c)
   {
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int i = 0; 
		int a=0;
		
		for (int j=i; j<m[r].length;j++)
		{
		if (a==w.length())
		{
			break;
		}
		
		if (m[r][j].equals(w.charAt(i)) == false)
		{
			i=1;
			break;
		}
		i++;
		
		
		
		}
		
		if (i==0 && a ==w.length())
		{
			return true; 
		}
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
