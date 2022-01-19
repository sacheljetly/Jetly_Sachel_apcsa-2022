//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;


public class StarsAndStripes
{
	
	

	
	
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      
   }

   public void printTwentyStars()
   { 
	   out.println("********************");
	   
   }

   public void printTwentyDashes()
   {
	   out.println("|--------------------|");
	
   }
   

   public void printTwoBlankLines()
   {out.println("                    \n                    ");
   }
   
   public void printASmallBox()
   { out.println("------");
   out.println("|     |\n|     |\n|     |");
   out.println("------");
   
   }
 
   public void printABigBox()
   { out.println("--------------------------");
   out.println("|                        |\n|                        |\n|                        |\n|                        |\n|                        |\n|                        |\n|                        |\n|                        |");
   out.println("--------------------------");
   }   
   //for fun :)
   
   public static final String TEXT_RESET = "\u001B[0m";
	public static final String TEXT_BLACK = "\u001B[30m";
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_CYAN = "\u001B[36m";
	public static final String TEXT_WHITE = "\u001B[37m";
	
   public void printFlagPTone ()
   {
	   out.println("\u001B[34m|********\u001B[31m --------------------------|");
   }
   public void printFlagPTtwo ()
   {
	   out.println("\u001B[31m|-----------------------------------|");
   }
}

