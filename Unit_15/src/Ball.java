//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed= 2;
		
		
	}
	
	
	public Ball(Color col)
	{
		super (200,200,col);
		
		xSpeed = 4; 
		ySpeed =3;
	}
	
	public Ball ( int x,  int y , int width, int height)
	{
		super(x,y,width,height);
		xSpeed = (int) Math.random() *12-6; 
		ySpeed = (int) Math.random() *12-6; 
		
		
	}
	
	public Ball(int x, int y, int width, int height, Color col, int Xspeedd, int YSpeedd)
	{
		super(x,y,width,height,col);
		xSpeed = Xspeedd; 
		ySpeed= YSpeedd; 
	}
	
	
	
	
	   
   //add the set methods
   

	public void setxSpeed(int x)
	{
		 xSpeed = x; 
	}
	
	public void setySpeed(int y)
	{
		ySpeed = y; 
		
	}
	
	public int getxSpeed()
	{
		return xSpeed; 
	}
	
	public int getySpeed()
	{
		return ySpeed; 
	}
	
	
   public void moveAndDraw(Graphics window)
   {
   draw(window, Color.white);


      setX(getX()+xSpeed);
		//setY
setY(getY() + ySpeed);
		//draw the ball at its new location
draw(window,super.getColor());
   }
   
	public boolean equals(Object obj)
	{

Ball b = (Ball) obj; 
 
if (b.getxSpeed() != xSpeed)
{
	return false; 
}



else if (b.getySpeed() != ySpeed)
{
	return false; 
}

else
	return true; 

	}   

   //add the get methods

   //add a toString() method
	public String toString()
	{
		return super.toString() + " " + xSpeed + " " + ySpeed ;
	}

	public int getXSpeed() {
		return xSpeed;
	}
}