//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
private String in; 
	//uncomment once you are ready for this part
	
   private AlienHorde horde;
	private Bullets shots;
	
private boolean shooting; 
	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		this.addKeyListener(this);
		new Thread(this).start();
		
		
		ship = new Ship(400,400);
		setVisible(true);
		alienOne=new Alien(200,100);
		setVisible(true);
		alienTwo = new Alien(300,100);
		setVisible(true);
		horde = new AlienHorde(0);
		horde.add(alienOne);
		horde.add(alienTwo);
		horde.add(new Alien(600,0));
        horde.add(new Alien(400,0));
        horde.add(new Alien(800,0));
        horde.add(new Alien(100,0));
        horde.add(new Alien(900,0));
        shots = new Bullets(); 
        shooting = true; 
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

   
	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		ship.draw(graphToBack);
		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		if (keys[1]==true)
		{
			ship.move("RIGHT");
			
		}
		
		if (keys[2]==true)
		{
			ship.move("UP");
			
		}
		
		if (keys[3]==true)
		{
			ship.move("DOWN");
			
		}
		
		if (keys[4]== true && shooting )
		{
			shots.add(new Ammo(ship.getX() +7 ,ship.getY()-7));
			shooting =false; 
		}
		
		else if (keys[4] == false)
		{
			shooting = true; 
			shots.moveEmAll();
			shots.drawEmAll(graphToBack);
			shots.cleanEmUp();
		}
		
		//add code to move Ship, Alien, etc.

		  if (ship.getX() < 0) {
	            ship.setX(0);
	        }
	        if (ship.getX() > 800 - ship.getWidth()) {
	            ship.setX(800 - ship.getWidth());
	        }
	        if (ship.getY() < 0) {
	            ship.setY(0);
	        }
	        if (ship.getY() > 600 - ship.getHeight()) {
	            ship.setY(600 - ship.getHeight());
	        }
	      
			horde.removeDeadOnes(shots.getList());
			horde.drawEmAll(graphToBack);
	        ship.draw(graphToBack);
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship

		

		twoDGraph.drawImage(back, null, 0, 0);
		
		if (in != null)
		{
			interpret(in);
			in = null; 
			in = JOptionPane.showInputDialog("Movement");
		}
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}
	
	public void interpret(String s)
	{
		s = s.toLowerCase();
		String[] strings = s.split(" ");
		try{
			if(strings[0].equals("fire"))
			{
				shots.add(new Ammo(ship.getX()+5, ship.getY()-5));
			}
			else if(strings[0].equals("move")){
				if(strings[1].equals("up"))
				{
					int speed = ship.getSpeed();
					ship.setSpeed(Integer.valueOf(strings[2]));
					ship.move("UP");
					ship.setSpeed(speed);
				}
				if(strings[1].equals("down"))
				{
					int speed = ship.getSpeed();
					ship.setSpeed(Integer.valueOf(strings[2]));
					ship.move("DOWN");
					ship.setSpeed(speed);
				}
				if(strings[1].equals("left"))
				{
					int speed = ship.getSpeed();
					ship.setSpeed(Integer.valueOf(strings[2]));
					ship.move("LEFT");
					ship.setSpeed(speed);
				}
				if(strings[1].equals("right"))
				{
					int speed = ship.getSpeed();
					ship.setSpeed(Integer.valueOf(strings[2]));
					ship.move("RIGHT");
					ship.setSpeed(speed);
				}
				else{

				}
			}
			else{

			}
		}catch(Exception e)
		{

		}

	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

