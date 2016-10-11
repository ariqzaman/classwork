package groupFiles;

public class DanielNice  implements Topic  {

	private boolean inNiceLoop;
	private String niceResponse;
	private int niceCount;
	private static String[] happyResponses = {"Thank you.", "That is very nice of you.", "You are too kind.", "Thanks for all the compliments.", "This is getting kind of weird now.", "You don't have to keep complimenting me!", "OK that's enough!"};
	
	public DanielNice(){
		niceCount = 0;
	}

	@Override
	public void talk() {
		while(inNiceLoop){
			niceCount++;
		}
		printHappyResponse();
		niceResponse = SharonChatBox.getInput();
		if(!isTriggered(niceResponse)){
			inNiceLoop = false;
			SharonChatBox.talkForever();
		}	

	}
	
	private void printHappyResponse(){
		if(niceCount<=8)
			SharonChatBox.print(happyResponses[niceCount]);
		else
		    SharonChatBox.print("Let's talk about you instead.");
					    

	}

	@Override
	public boolean isTriggered(String userInput) {
		String[] niceTriggers = {"smart", "cool", "awesome", "great", "useful", "nice", "intelligent","funny","kind","amazing"};
		if((SharonChatBox.findKeyword(userInput, "you are" , 0)>=0)){
			for(int i = 0; i < niceTriggers.length; i++){

				if(SharonChatBox.findKeyword(userInput, niceTriggers[i] , 0)>=0){
					return true;
				}
			}
		}
		return false ;
	} 

}
