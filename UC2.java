import java.util.*;
public class UC2{
	public static void main(String[] args){
		//int roll = (int) Math.floor(Math.random()*10)%6;
		//roll+=1;
		int min=1;
		int max=6;
		Random rand=new Random();
		int roll=rand.nextInt( (max-min) + 1 ) + min;
		System.out.println("The dice roll outcome is: "+roll);
	}	
}