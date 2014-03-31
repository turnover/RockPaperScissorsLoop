import java.util.Random;
import java.util.Scanner;


public class RPSLoop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner input = new Scanner( System.in );
		
		boolean play = true;
		int wins =0;
		int losses =0;
		int ties =0;
		int played =0;
		int num1;
		String choice ="";
		String key ="";
		int computerNum;
		computerNum = 0 + (int) (Math.random()*2);
		
		System.out.println("Do you wish to play Rock/Paper/Scissors? Yes or No: ");
		choice = input.next();
		
		if(choice.equalsIgnoreCase("Yes"))
		{
			play = true;
		}
		else if(choice.equalsIgnoreCase("No"))
		{
			play = false;
		}
		
		do
		{
			System.out.printf("You currently have %d Wins, %d Losses, %d Ties, and %d Played.\n", wins ,losses ,ties, played);
			
			System.out.println("Play Rock, Paper, Scissors.");
			System.out.println("0=Rock, 1=Paper, 2=Scissors.Please enter your choice: ");
			num1=input.nextInt();
			if ( computerNum==0 && num1==0)
			{
				System.out.println("We both chose rock. We tie.");
				ties += 1;
			}
			else if ( computerNum==0 && num1==1)
			{
				System.out.println("I chose rock, and you chose paper. You Win.");
				wins += 1;
			}
			else if ( computerNum==0 && num1==2)
			{
				System.out.println("I chose rock, and you chose scissors. You Lose.");
				losses += 1;
			}
			else if ( computerNum==1 && num1==0)
			{
				System.out.println("I chose paper, and you chose rock. You Lose.");
				losses += 1;
			}
			else if ( computerNum==1 && num1==1)
			{
				System.out.println("We both chose paper. We tie.");
				ties += 1;
			}
			else if ( computerNum==1 && num1==2)
			{
				System.out.println("I chose paper, and you chose scissors. You Win.");
				wins += 1;
			}
			else if ( computerNum==2 && num1==0)
			{
				System.out.println("I chose scissors, and you chose rock. You Win.");
				wins += 1;
			}
			else if ( computerNum==2 && num1==1)
			{
				System.out.println("I chose scissors, and you chose paper. You Lose.");
				losses += 1;
			}
			else if ( computerNum==2 && num1==2)
			{
				System.out.println("We both chose scissors. We tie.");
				ties += 1;
			}
				played++;
			
				System.out.println("If you wish to stop press please close the program. If you wish to continue press any letter.");
				key = input.next();	
		}while(play =true);
	}
}
	
	


