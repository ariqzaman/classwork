package groupFiles;

//Matthew Yarmolinsky

import groupFiles.TrumpMain;

public class Million implements Topic {
	
	private static int response;
	private String richResponse;
	private boolean inRantLoop;
	private String millionDollarResponse;

	public void talk() {
		TrumpMain.print("Let's talk money. (Just don't ask for my tax return.)");
		String[] richResponses = { "Yeah I have plenty of that don't I.", "That's quite a small amount.",
				"My millions will help build the wall.", "Speaking of millions, how rich would you say you are?",
				"What would you really like to have?" };
		inRantLoop = true;
		response = 0;
		while (inRantLoop) {
			millionDollarResponse = TrumpMain.getInput();
			if(exitTopic(millionDollarResponse)){
				inRantLoop = false;
				TrumpMain.talkForever();
			} else{
				boolean million = isTriggered(millionDollarResponse);
				if (million) {
					richResponse = richResponses[chooseResponse()];
					while (richResponse.equals("What would you really like to have?") && response == 0){
						richResponse = richResponses[chooseResponse()];
					}
					TrumpMain.print(richResponse);
					if (richResponse.equals("Speaking of millions, how rich would you say you are?")) {

						String userResponse = TrumpMain.getInput();

						if (TrumpMain.findKeyword(userResponse, "poor", 0) >= 0) {
							response = 1;
							TrumpMain.print("I see, you're one of those");
						} else {
							response = TrumpMain.findKeyword(userResponse, "fine", 0);
							if (response >= 0) {
								response = 2;
								TrumpMain.print("Ah, so not rich, not poor");
							} else {
								response = TrumpMain.findKeyword(userResponse, "rich", 0);
								if (response >= 0) {
									response = 3;
									TrumpMain.print("Well, a fellow richman I see");
								} else {
									TrumpMain.print("I'm sorry, I don't understand.");
								}
							}
						}
					}
					if (richResponse.equals("What would you really like to have?") && response > 0) {
						String temp = TrumpMain.getInput();
						TrumpMain.print(temp);
						if (response == 1) {
							TrumpMain.print("Oh, well unfortunately you're too poor to get that.");
						} else if (response == 2) {
							TrumpMain.print("You might not be poor, but you're clearly not rich enough to get that either.");
						} else if (response == 3) {
							TrumpMain.print(
									"Well, you are rich enough to get that; I'm surprised you haven't already gotten it.");
						}
					}
				} else {
					TrumpMain.print("I'm sorry, I don't understand.");
				}
			}
		}
	}
	
	public static int chooseResponse() {
		double rand = Math.random();
		int choice = (int) (5 * rand);
		return choice;
	}

	public boolean isTriggered(String userInput) {
		if (TrumpMain.findKeyword(userInput, "million", 0) >= 0 || TrumpMain.findKeyword(userInput, "millions", 0) >= 0 || TrumpMain.findKeyword(userInput, "money", 0) >= 0) {
			return true;
		}
		return false;
	}
	
	public boolean exitTopic(String x){
		String[] exitW = {"leave","stop","quit"};
		for(int i = 0; i < exitW.length; i++){
			if(TrumpMain.findKeyword(x, exitW[i], 0)>=0){
				return true;
			}
		}
		return false;
	}

}
