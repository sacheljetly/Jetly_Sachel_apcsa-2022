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
		if (playerValue>num)
			winner = ("!Player wins");
		if (num>playerValue)
		{
			winner = ("!Computer wins");
		}
		else if (num == playerValue)
		winner = ("\n!Draw game!");
		return winner; 
	}

	public String toString()
	{
		String output="\n player had " + playChoice + " \n computer had " + compChoice +"\n" +determineWinner();
		return output;
	}
}