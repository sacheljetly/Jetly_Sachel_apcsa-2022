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
		
		
		
			
	
			do
		{ 
				out.print("\nDo you want to play (yes/no) :: ");
				String input=	keyboard.next();
				if (input.equals("no"))
					break; 
				
				String player = "";
				
				out.print("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");
				player = keyboard.next();
				response = player; 
			
			
				RockPaperScissors game = new RockPaperScissors();	
				
				
				
				game.setPlayers(player);
				game.determineWinner();
				out.print(game);
			
				
			
		}
			while (response.equals("yes"));
		
	}
}



