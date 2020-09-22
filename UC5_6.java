import java.util.*;
public class UC5_6{

	static final int no_play = 0;
	static final int ladder = 1;
	static final int snake = 2;

	public static void main(String[] args){
		int min=1;
		int max=6;
		Random rand=new Random();
		// int roll=rand.nextInt( (max-min) + 1 ) + min;
		int position = 0;
		// double option=Math.floor(Math.random() * 10)%3;
		int roll_count=0;
		while(position!=100)
			{	
				int roll=rand.nextInt( (max-min) + 1 ) + min;
				System.out.println("Dice roll came out to be: " + roll);
				//int position = 0;
				roll_count+=1;
				double option=Math.floor(Math.random() * 10)%3;

				switch((int) option){
					case no_play:
						System.out.println("Sorry player! You got no_play option. You stay here at position: " + position);
						break;
					case ladder:
						position+=roll;
						if(position>100){
							position-=roll;
							System.out.println("Hey! You got ladder option but Position can't exceed 100. Please play again.");
							break;
						}
						System.out.println("Kudos player! You got the ladder option. You march forward..");
						System.out.println("Your updated position would be: " + position);
						break;
					case snake:
						System.out.println("Oops! You just got bit by a snake. You go backwards..");
						position-=roll;
						if(position<0){
							position = 0;
						}
						System.out.println("Your updated position would be: " + position);
						break;
					default: 
						System.out.println("Nothing happens here.");
				}
			}
			System.out.println();
			System.out.println("Wohoo! You just reached position 100. Congratulation. The dice has been rolled: " + roll_count + " times for you to win. You may now exit the game or play again...");
	}
}
