import java.util.*;
public class UC7{

	static final int no_play = 0;
	static final int ladder = 1;
	static final int snake = 2;

	public static void main(String[] args){
		int min=1;
		int max=6;
		Random rand=new Random();
		// int roll=rand.nextInt( (max-min) + 1 ) + min;
		int position1 = 0;
		int position2 = 0;
		int roll;
		int option;
		boolean index=true;
		// double option=Math.floor(Math.random() * 10)%3;
		// int roll_count=0;
		System.out.println("Game starts here. Player 1 to play!");
		while(position1!=100 && position2!=100)
			{	
				roll=rand.nextInt( (max-min) + 1 ) + min;

				if(index == true)
				{
					System.out.println("Dice roll for player 1 came out to be: " + roll);
					option=(int) Math.floor(Math.random() * 10)%3;
					if(option == 0){
						System.out.println("Sorry player1! You got no_play option. You stay here at position: " + position1);					
						index = false;
						continue;
					}
					else if(option == 1)
					{
						System.out.println("Kudos player1! You got the ladder option. You march forward..");
						position1+=roll;
						System.out.println("Your updated position would be: " + position1 + ". Please roll the dice again.");
						roll=rand.nextInt( (max-min) + 1 ) + min;
						System.out.println("Dice roll for player 1 came out to be: " + roll);
						option=(int) Math.floor(Math.random() * 10)%3;

						if(option == 0)
						{
							System.out.println("Sorry player1! You got no_play option. You stay here at position: " + position1);					
							index = false;
							continue;
						}
						else if(option == 1)
						{
							System.out.println("Kudos player1! You got the ladder option. You march forward..");
							position1+=roll;
							System.out.println("Your updated position would be: " + position1 + ".");
							index = false;
							continue;
						}
						else
						{
							System.out.println("Oops! You just got bit by a snake. You go backwards..");
				 			position1-=roll;
				 			if(position1<0){
				 				position1 = 0;
				 			}
				 			System.out.println("Your updated position would be: " + position1);
				 			index = false;
							continue;
						}
					}
					else
					{
						System.out.println("Oops! You just got bit by a snake. You go backwards..");
				 		position1-=roll;
				 		if(position1<0)
				 		{
				 			position1 = 0;
				 		}
				 		System.out.println("Your updated position would be: " + position1);
				 		index = false;
						continue;
					}
				}
				else
				{
					System.out.println("Dice roll for player 2 came out to be: " + roll);
					option=(int) Math.floor(Math.random() * 10)%3;
					if(option == 0){
						System.out.println("Sorry player2! You got no_play option. You stay here at position: " + position2);					
						index = true;
						continue;
					}
					else if(option == 1)
					{
						System.out.println("Kudos player2! You got the ladder option. You march forward..");
						position2+=roll;
						System.out.println("Your updated position would be: " + position2 + ". Please roll the dice again.");
						roll=rand.nextInt( (max-min) + 1 ) + min;
						System.out.println("Dice roll for player 2 came out to be: " + roll);
						option=(int) Math.floor(Math.random() * 10)%3;

						if(option == 0)
						{
							System.out.println("Sorry player2! You got no_play option. You stay here at position: " + position2);					
							index = true;
							continue;
						}
						else if(option == 1)
						{
							System.out.println("Kudos player2! You got the ladder option. You march forward..");
							position2+=roll;
							System.out.println("Your updated position would be: " + position2 + ".");
							index = true;
							continue;
						}
						else
						{
							System.out.println("Oops! You just got bit by a snake. You go backwards..");
				 			position2-=roll;
				 			if(position2<0){
				 				position2 = 0;
				 			}
				 			System.out.println("Your updated position would be: " + position2);
				 			index = true;
							continue;
						}
					}
					else
					{
						System.out.println("Oops! You just got bit by a snake. You go backwards..");
				 		position2-=roll;
				 		if(position2<0)
				 		{
				 			position2 = 0;
				 		}
				 		System.out.println("Your updated position would be: " + position2);
				 		index = true;
						continue;
					}
				}
			}
			System.out.println();
			if(position1 == 100){
				System.out.println("Congratulations player1. You won the game!");
			}
			if(position2 == 100){
				System.out.println("Congratulations player2. You won the game!");
			}
	}
}
