package groupFiles;

public class AliTrigger implements Topic 
{
	private static String[] compSciQuestions = {"What is Recursion?","What is Mr.Ip's favorite college?",
	"What is a primitive data type?","Is Java your favorite class?"};
	private static String[] answerKey = {"repeat","Berkeley","data that is not in its own class","yes"};
	private int answer;
	private boolean questionCycle;
	private String userAnswer;
	public void talk()
	{
		Raybot.print("Do you want to test your abilities in a Computer Science Trivia?");
		while(questionCycle)
		{
			
			answer=(int)(Math.random()*compSciQuestions.length);
			Raybot.print(compSciQuestions[answer]);
			userAnswer =Raybot.getInput();
			checkAnswer(userAnswer, answer);
		}

	}
	public void checkAnswer(String userAnswer , int number)
	{
		if (number==0)
		{
			if (userAnswer == answerKey[0])
			{
				Raybot.print("you're correct!");
			}
			else
			{
				Raybot.print("Try again");
			}
		}
		else if (1 == number)
		{
			if (userAnswer == answerKey[1])
			{
				Raybot.print("you're correct!");
			}
			else
			{
				Raybot.print("Try again");
			}
		}
		else
		{

			if (userAnswer == answerKey[2])
			{
				Raybot.print("you're correct!");
			}
			else
			{
				Raybot.print("Try again");

			}
		}
		else
		{

			if (userAnswer == answerKey[3])
			{
				Raybot.print("you're correct!");
			}
			else
			{
				Raybot.print("That can't be the correct answer, try again!!");

			}
		}
	}
//	public String getResponse {
//		
//	}
	public boolean isTriggered(String userInput){
		String[] triggers = {"testing","question","test","exam"};
		for(int i=0; i<triggers.length; i++)
		{
			if(Raybot.findKeyword(userInput, triggers[i], 0) >= 0){
				return true;
			}
		}
		return false;
	}
////	public static void talk(){
////	}
////
//}
