//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,100);
      speed =2;
   }


   public Paddle(int x, int y)
   {
	   super(x,y);
	   speed= 2; 
   }

   public Paddle( int x, int y, int spd)
   {
	   super(x,y);
	   speed = spd; 
   }


   public Paddle (int x, int y, int width, int height)
   {
	    super(x,y,width, height);
	    speed= 2; 
   }
   
   public Paddle (int x, int y, int width, int height, Color col)
   {
	   super(x,y,width,height,col);
	   speed = 2;
   }
   
   public Paddle (int x, int y, int width, int height, int pdlespeed)
   {
	   super(x,y,width, height);
	   speed = pdlespeed;
   }
   
   public Paddle (int x, int y, int width, int height, Color col, int pdlespeed)
   {
	   super(x,y,width, height, col);
	   speed  = pdlespeed; 
   }


public int getSpeed()
{
	return speed; 
}



   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   
	   setY(getY()-speed);
	   
	   draw(window, Color.black);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white)
;
	   setY(getY()+speed);
	   
	   draw (window, Color.black); 

   }

   //add get methods
   
   
   //add a toString() method
   
   public String toString()
   {
	   return ""; 
   }
}