package groupFiles;
import java.util.*;

public class KristyIsTriggered implements Topic 
{
	private static String[] winningStatement={"Yay, you have won", "You win!"};
	private static String[] losingStatement = {"it's alright that you lost", "loser","You lost"};
	private boolean gameTime;
	private String[] triggerArray = {"bored", "game","play"};
	
	public static int random()
	{
		double roll = Math.random();//random double (0,1)
 		int answer = (int) (100 * roll);
		return answer + 1;
	}
	public void talk()
	{
		int counter = 0;
		int rand = random();
		Raybot.print("guess what number am I thinking about. Pick a number 1 to 100.");
		gameTime = true;
		while(gameTime)
		{
			counter++;
			int helloResponse = getIntegerInput();
			printResponse(helloResponse, rand);
			if (giveUp(counter))
			{
				gameTime = false;
				
				int responseIndex = (int)(Math.random()*losingStatement.length);
				Raybot.print(losingStatement[responseIndex]);
				Raybot.talkForever();
			}
			
		}
	}
	private static int getIntegerInput() 
	{
		 String integerString = Raybot.getInput();
		 boolean isInteger = false;
		 int value = 0;
		 while(!isInteger){
		 try{
		 value = Integer.parseInt(integerString);
		 //will not continue if an error above is thrown
		 isInteger = true;//exits loop if entry is valid
		 }catch(NumberFormatException e){
		 Raybot.print("You must enter an integer. You better try again.");
		 integerString = Raybot.getInput();
		 }
		 }
		 return value;
		 }
	public void printResponse(int userInput, int answer)
	{
		int low = 0;
		int high = 100;
		int responseIndex = 0;
		if (userInput == answer)
		{
			responseIndex = (int)(Math.random()*winningStatement.length);
			Raybot.print(winningStatement[responseIndex]);
			gameTime = false;
			Raybot.talkForever();
			
		}
		else if(userInput >= high || userInput <= low)
		{
			Raybot.print("pick again");
		}
		else if (userInput >= answer)
		{
			high = userInput;
			Raybot.print("please pick a number between" + low +"and"+ high);
		}
		else 
		{
			low = userInput;
			Raybot.print("please pick a number between" + low +"and"+ high);
		}
	}
	public boolean giveUp (int num)
	{
		if (num== 6)
		{
			return true;
		}
		return false;
	}
	public boolean isTriggered(String userinput){
		for(String trigger: triggerArray){
			if(Arrays.asList(triggerArray).contains(trigger))
				return true;
		}
		return false;
	}
}
