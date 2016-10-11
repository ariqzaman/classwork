//Ryan Situ
package groupFiles;

import groupFiles.TrumpMain;

public class Hillary implements Topic {

	private boolean inHillaryLoop;
	private String hillaryComeback;
	private int hillaryCount;
	
	public void hillary(){
		hillaryCount = 0;	
	}

	public void talk() {
		String[] meanComebacks = { 
				"Hillary Clinton? Her health is as weak as my father's and he's dead.", 
				"Hillary Clinton is not going to win. I can guarantee it.",
				"Hillary Clinton would make a terrible president. I know a solution. Vote for me.", 
				"Hillary Clinton can't work her magic. The only magic the Clintons have been working with is fooling around with Magic Johnson.", 
				"Hillary Clinton doesn't even know how to win. I know how to win, so forget about her." 
		};

		String[] cannotUnderstand = { 
				"I'm sorry. I couldn't hear you over my money.", 
				"What was that? I was too busy being fascinated by my fabulous hair.",
				"Can you please speak English? All I'm hearing is gibberish.", 
				"You're not making any sense, just like the immigrant workers that have invaded our country.",
				"Where did you learn English? I dropped out of elementary school and can still speak better than you."
		};

		String[] enoughHillary = {
				"Alright, let's stop talking about that old hag.",
				"You're starting to annoy me. I think I might go talk to another one of my million supporters.",
				"How about I pay you a million dollars to SHUT UP about Hillary?",
				"Enough of Hillary. Even her husband doesn't talk about her THAT much.",
				"You're irritating me more than the immigrants who've overstayed their welcome in the U.S.",
				"I want my lawyer! I'm accusing you of larceny for stealing my precious time!"
		};
		
		String[] despiseHillary = {
				"Ugh. You mentioned Hillary. What about her?",
				"Oh, Hillary? What do you have to say about her?",
				"As much as I despise Hillary, I'll listen to what you have to say. Well? What did you want to say?",
				"I don't have anything good to say about Hillary, but let's hear it.",
				"I'm running out of time, but I'll make an exception. What's your opinion on Hillary?"
		};

		inHillaryLoop = true;

		TrumpMain.print(despiseHillary[chooseResponse()]);
		
		while (inHillaryLoop) {
			hillaryComeback = TrumpMain.getInput();
			int hillaryPos = TrumpMain.findKeyword(hillaryComeback, "hillary", 0);
			int hillaryPos2 = TrumpMain.findKeyword(hillaryComeback, "clinton", 0);
			int hillaryPos3 = TrumpMain.findKeyword(hillaryComeback, "she", 0);
			int hillaryPos4 = TrumpMain.findKeyword(hillaryComeback, "her", 0);

			if(hillaryCount == 5)
			{
				TrumpMain.print(enoughHillary[chooseResponse()]);
				TrumpMain.print("Let's move on and talk about something that's actually going to stay on Earth.");
				inHillaryLoop = false;
				hillaryCount = 0;
				TrumpMain.talkForever();
			}
			if(hillaryCount < 5){
				if (hillaryPos >= 0) {
					TrumpMain.print(meanComebacks[chooseResponse()]);
					askMore();
					hillaryCount++;
				} else {
					if(hillaryPos2 >= 0){
						TrumpMain.print(meanComebacks[chooseResponse()]);
						askMore();
						hillaryCount++;
					}
					else{
						if(hillaryPos3 >= 0){
							TrumpMain.print(meanComebacks[chooseResponse()]);
							askMore();
							hillaryCount++;
						}
						else{
							if(hillaryPos4 >= 0){
								TrumpMain.print(meanComebacks[chooseResponse()]);
								askMore();
								hillaryCount++;
							}
							else{
								TrumpMain.print(cannotUnderstand[chooseResponse()]);
							}
						}
					}
				}
			}
		}
	}
	
	public int chooseResponse() {
		double rand = Math.random();
		int choice = (int) (5 * rand);
		return choice;
	}
	
	public static void askMore(){
		TrumpMain.print("What else do you want to say about her?");
	}

	public boolean isTriggered(String userInput) {
		if (TrumpMain.findKeyword(userInput, "hillary", 0) >= 0||TrumpMain.findKeyword(userInput, "clinton", 0) >= 0||TrumpMain.findKeyword(userInput, "she", 0 ) >= 0 
				||TrumpMain.findKeyword(userInput, "her", 0 ) >= 0){
			return true;
		}
		return false;
	}
}
