//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   
	   TriangleFive test = new TriangleFive(); 
	   
	//   C 4
	  // A 5
	   //B 7
	  // X 6
	   //Z 8
	   
	   test.setAmount(4);
	   test.setLetter('C');
	   out.print(test);
	   
	   
	   test.setAmount(5);
	   test.setLetter('A');
	   out.print(test);
	   
	   
	   test.setAmount(7);
	   test.setLetter('B');
	   out.print(test);
	   
	   
	   test.setAmount(6);
	   test.setLetter('X');
	   out.print(test);
	   
	   
	   test.setAmount(8);
	   test.setLetter('Z');
	   out.print(test);
	   
	  
	}
}