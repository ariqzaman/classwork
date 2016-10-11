package groupFiles;

public class JiayanFood implements Topic {
	private boolean inRestaurantLoop;
	private boolean inOtherLoop;
	private String foodResponse;
	private static String [] foods = {"pizza","ice cream","Japanese Food","Korean Food","Halal","Pasta",};
	private static String [] restaurants = {"Di Fara Pizza","Ample Hills Creamery","Kyo Ya","Shilla","The Halal Guys Food Cart","Osteria Morini",};
	
	private void whichLoop()
	{
		int ranLoop = (int)(Math.random()*20+1);
		if(ranLoop > 10)
		{
			inRestaurantLoop = true;
		}
		else
		{
			inOtherLoop = true;
		}
	}
	public void talk() {
	whichLoop();
	SharonChatBox.print("What is your favorite food?");
	while(inRestaurantLoop) 
	{
		foodResponse = SharonChatBox.getInput();
		suggestRestaurant();
		if(!isTriggered(foodResponse))
		{
			inRestaurantLoop = false;
			SharonChatBox.talkForever();
		}
	} 
	while(inOtherLoop)
	{
		foodResponse = SharonChatBox.getInput();
		talkFoods();
		if(!isTriggered(foodResponse))
		{
			inOtherLoop = false;
			SharonChatBox.talkForever();
		}
	} 
	}
	private void suggestRestaurant()
	{
		for(int foodIndex = 0; foodIndex < 6; foodIndex++)
		{
			if(SharonChatBox.findKeyword(foodResponse, foods[foodIndex], 0)>= 0 
					&& SharonChatBox.findKeyword(foodResponse, "like", 0)>= 0)
			{
				SharonChatBox.print("Since you like " + foods[foodIndex] + ". I suggest you go to "+ restaurants[foodIndex]);
			}
		}
	}
	public void talkFoods()
	{
		String [] responseArr = {"like","want","","love","hate"};
		String [] qArr = {"Why do you","What makes you","How did you come to"};
		int ran = (int)(Math.random()*2+1);
		for(int i =0; i<responseArr.length;i++)
		{
			 int prefPsn = SharonChatBox.findKeyword(foodResponse, responseArr[i], 0);
			 if (prefPsn>=0){
				 	String word = responseArr[i];
					String foodPref=foodResponse.substring(prefPsn+5);
					SharonChatBox.print(qArr[ran] + " " + word + " "+foodPref+"?");
			
			 }
		}
	}
	
	public boolean isTriggered(String userInput) {
		if(SharonChatBox.findKeyword(userInput, "food", 0)>= 0)
		{
			return true;
		}
		if(SharonChatBox.findKeyword(userInput, "eat", 0)>= 0)
		{
			return true;
		}
		if(SharonChatBox.findKeyword(userInput, "restaurant", 0)>= 0)
		{
			return true;
		}
		return false;
	}

}
