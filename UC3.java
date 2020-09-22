import java.util.*;
public class UC3{

	static final int no_play = 0;
	static final int ladder = 1;
	static final int snake = 2;

	public static void main(String[] args){
		int min=1;
		int max=6;
		Random rand=new Random();
		int roll=rand.nextInt( (max-min) + 1 ) + min;
		//System.out.println("The dice roll outcome is: "+roll);
		int position = 0;
		double option=Math.floor(Math.random() * 10)%3;

		switch((int) option){
			case no_play:
				System.out.println("Sorry player! You got no_play option. You stay here at position: " + position);
				break;
			case ladder:
				System.out.println("Kudos player! You got the ladder option. You march forward..");
				position+=roll;
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
}