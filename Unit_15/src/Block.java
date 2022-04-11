//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 100; 
		yPos = 150; 
		width = 10;
		height= 10;
		color = Color.BLACK;


	}
	
	public Block (int x, int y, int w, int h)
	{
		xPos= x;
		yPos =y;
		width =w;
		height=h;
		color = color.BLACK;
		
	}
	
	public Block(int x, int y, int w, int h,Color coll)
	{
		xPos= x;
		yPos=y;
		this.xPos = x;
		this.yPos=y;
		this.width= w;
		this.height=h;
		color = coll;
		
	}

	//add other Block constructors - x , y , width, height, color
	
	
	public Block (int x, int y)
	{
		this.xPos=x;
		this.yPos=y;
		width = 10;
		color = Color.BLACK;
		
	}
	
	
	
	
	
	
	
	public int getWidth()
	{
		return width; 
	}
	
	public int getHeight()
	{
		return height; 
	}
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
color = col; 

   }

   public void draw(Graphics window)
   {
   
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
draw(window);

   }
   
	public boolean equals(Object obj)
	{




		return this==obj;
	}   
	
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public void setX(int x)
	{
		xPos= x;
	}

	public void setY(int y)
	{
		yPos=y;
	}
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY()
	{
		return yPos;
	}
   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	
	public String toString()
	{
		return xPos + " " + yPos + " " + width + "  " + color; 
	}
}