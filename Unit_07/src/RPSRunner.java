//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		char input = 'Y'; 
		
		
			
	
			do
		{ 
				
				
				String player = "";
				
				out.println("\nRock-Paper-Scissors - pick your weapon [R,P,S] :: ");
				player = keyboard.next();
				response = player; 
			
			
				RockPaperScissors game = new RockPaperScissors();	
				
				
				
				game.setPlayers(player);
				game.determineWinner();
				out.print(game);
			
				out.print("\nDo you want to play (Y/N) :: ");
				 input=	keyboard.next().charAt(0);
	
					
			
		}
			while (input == 'Y');
		
	}
}



