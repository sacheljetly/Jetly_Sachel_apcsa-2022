//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes flag = new StarsAndStripes();
      
      //call the methods needed to make the patterns on the word document
      flag.printTwentyDashes();
      flag.printTwentyStars();
      flag.printTwentyDashes();
      flag.printTwoBlankLines();
      flag.printTwentyStars();
      flag.printTwentyStars();
      flag.printTwentyDashes();
      flag.printTwentyStars();
      flag.printTwentyStars();
      flag.printASmallBox();
      flag.printTwoBlankLines();
      flag.printABigBox();
      
     //for fun
      for (int i=0; i <4;i++) {
    	  flag.printFlagPTone();
      }
      for (int i=0; i<9; i++) {
    	  flag.printFlagPTtwo();
      }
      

   }
}