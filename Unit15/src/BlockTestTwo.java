//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;

public class BlockTestTwo extends Canvas
{
	public BlockTestTwo()
	{
		setBackground(Color.white);
	}

	public void paint(Graphics window)
	{
		Block one = new Block();
		one.draw(window,Color.green);

		Block two = new Block(50,50,30,30);
		two.draw(window, Color.red);

		Block three = new Block(350,350,15,15,Color.RED);
		three.draw(window, Color.MAGENTA);

		two.draw(window, Color.white);

		Block four = new Block(450,50,20,60, Color.GREEN);
		four.draw(window, Color.blue);
		
		//add more test cases			
	}
}