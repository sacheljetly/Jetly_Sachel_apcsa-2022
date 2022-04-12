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
		color = Color.white;


	}
	
	public Block (int x, int y, Color coll)
	{
		xPos = x;
		yPos= y; 
		color = color.white; 
	}
	public Block (int x, int y, int w, int h)
	{
		xPos= x;
		yPos =y;
		width =w;
		height=h;
		color = color.white;
		
	}
	public Block (int x, int y, int w, Color coll)
	{
		xPos= x;
		yPos =y;
		width =w;
		color = color.white;
		
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
		color = Color.white;
		
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
		
		Block b = (Block) obj; 
		
		if ( b.getX() != xPos)
		{
			return false;
		}
		
		else if (b.getY() != yPos)
		{
			return false; 
		}
		
		else if (b.getWidth() != width)
		{
			return false; 
		}
		
		else if (b.getHeight() != height)
		{
			return false; 
		}
		
		else if (b.getColor() != color)
		{
			 return false;
		}
		
		else 
			return true; 



		
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

	public Color getColor() {
		
		return color;
	}
}