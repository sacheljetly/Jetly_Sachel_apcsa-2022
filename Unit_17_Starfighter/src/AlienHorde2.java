//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde2
{
	private List<Alien> aliens;

	public AlienHorde2(int size)
	{
		aliens = new ArrayList<>(size);
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien weird: aliens)
		{
			weird.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien weird: aliens)
		{
			weird.move("DOWN");
		}
		
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int a = aliens.size()-1;a>=0;a--)
		{
			Alien all = aliens.get(a);
			for(int p = shots.size()-1;p>=0;p--)
			{
				Ammo pew = shots.get(p);
				if(isIntersecting(pew,all))
				{
					Alien alien =aliens.remove(a);
					shots.remove(p);
				}
			}
		}
	}

	private boolean isIntersecting(Moveable x, Moveable y) {
		int x1 = x.getX();
		int x2 = x.getX()+x.getWidth();
		int y1 = x.getY();
		int y2 = x.getY()+x.getHeight();
		Boolean X = false;
		Boolean Y = false;
		if(x1<=y.getX()&&y.getX()<=x2)
			X= true;
		if(y1<=y.getY()&&y.getY()<=y2)
			Y=true;
		if(y1<=y.getY()+y.getHeight()&&y.getY()+y.getHeight()<=y2)
			Y = true;
		if(x1<=y.getX()+y.getWidth()&&y.getX()+y.getWidth()<=x2)
			X= true;
		if(X&&Y)
			return true;
		return false;
	}

	public String toString()
	{
		return "";
	}
}
