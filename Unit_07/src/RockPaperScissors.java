//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	int playerValue= 0; 
	int min = 0; 
	int max = 2; 
	int num = (int) (Math.random() * (max-min)+min);
	
	// Generate a random choice for the computer player.  
	//Next, the person player will make a choice. 
	//Finally, you take the two choices and see which one of the players is the winner.  
	//You will need to use Math.random().

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		setPlayers(playChoice); 
	}

	public void setPlayers(String player)
	{
		//player setting
		
	    playChoice = player; 
	    
	if (playChoice.equals("R"))
	{
		playerValue =0;
	}
	if (playChoice.equals("P"))
	{
		playerValue = 1;
	}
	if (playChoice.equals("S"))
		playerValue = 2; 
			
	//computer setting
	
	
	if (num==0)
		compChoice = ("R");
	if (num ==1)
	{
		compChoice =("P");
	}
	if (num ==2)
		compChoice =("S");
	}

	public String determineWinner()
	{
		String winner="";
		
		
		if (playerValue == num)
			winner = ("\n!Draw game!");
		
		if (playerValue ==0)
		{
			if (num ==1)
				winner = ("!Computer wins <<Paper covers Rock>>!");
			else if (num==2)
				winner = ("!Player wins <<Rock crushed Scissors>>!");
		}
		
		if (playerValue ==1)
		{
			if (num ==0)
				winner = ("!Player wins <<Paper covers Rock>>!");
			else if (num==2)
				winner = ("!Computer wins <<Scissors cut Paper>>!");
		}
	
		if (playerValue ==2)
		{
			if (num ==0)
				winner = ("!Computer wins <<Rock crushes Scissors>>!");
			else if (num==1)
				winner = ("!Player wins <<Scissors cut Paper>>!");
		}
		return winner; 
	}

	public String toString()
	{
		String output="\nPlayer had " + playChoice + " \nComputer had " + compChoice +"\n" +determineWinner();
		return output;
	}
}