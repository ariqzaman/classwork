package groupFiles;

public class MakinoonCostume implements Topic {
	private boolean inCostumeLoop;
	private String costumeResponse;
	private String color; //answers
	private String subject; 
	private String politicalParty; 
	private String genre; 
	private String sportCategory; 
	private Costume[] costumeList = new Costume[17]; 
	private String[] positiveAnswers = {"yes", "of course", "sure", "please", "okay", "go ahead"};
	private String[] colors = {"red", "blue", "green", "black"};
	private String[] subjects = {"politics", "sports", "music", "superheroes"};
	private String[] politicParty = {"democrat", "republican"};
	private String[] genres = {"hip-hop", "rap", "pop"}; 
	private String[] sports= {"baskbetball", "soccer"}; 
	
	public void talk() {
		
			makeCostumeList(); 
		
		inCostumeLoop = true;
		
		while (inCostumeLoop){
			MakinoonName.print("So, you want me to pick a costume "
					+ "for you?");
			costumeResponse = MakinoonName.getInput();
			
			boolean containsPositive = false; 
			
			for(int k = 0; k < positiveAnswers.length; k++){
				
	
				
				
				//after finding positive answers, the loop continues
				if(MakinoonName.findKeyword(costumeResponse, positiveAnswers[k], 0) >= 0){
					containsPositive = true; 
					MakinoonName.print("What's your favorite color?");
					String colorResponse =  getResponse(MakinoonName.getInput(), colors);
					System.out.println(colorResponse);
					color = colorResponse; 
					
					
					MakinoonName.print("Do you like politics/sports/music/superheroes?");
					String subjectResponse =  getResponse(MakinoonName.getInput(), subjects);
					subject = subjectResponse; 
					System.out.println(subjectResponse);
						if(subject.equals("politics")){
							MakinoonName.print("Do you prefer a Democrat or Republican?");
							String partyResponse =  getResponse(MakinoonName.getInput(), politicParty);
							System.out.println(partyResponse);
							politicalParty = partyResponse; 
							String costumeName = findCostume();
							MakinoonName.print("The ideal costume for you is " + costumeName + "!");
							MakinoonName.talkForever();
						}
						else if (subject.equals("sports")){
							MakinoonName.print("Do you prefer soccer or basketball?"); 
							String sportResponse =  getResponse(MakinoonName.getInput(), sports);
							sportCategory = sportResponse; 
							System.out.println(sportResponse);
							String costumeName = findCostume();
							MakinoonName.print("The ideal costume for you is " + costumeName + "!");
							MakinoonName.talkForever();
						}
						else if(subject.equals("music")){
							MakinoonName.print("Do you prefer hip-hip, rap or pop?"); 
							
							String genreResponse =  getResponse(MakinoonName.getInput(), genres);
							genre = genreResponse; 
							String costumeName = findCostume();
							MakinoonName.print("The ideal costume for you is " + costumeName + "!");
							MakinoonName.talkForever();
						}
						else if(subject.equals("superheroes")){
							
						
								String costumeName = findCostume();
								MakinoonName.print("The ideal costume for you is " + costumeName + "!");
								MakinoonName.talkForever();
							
						}else{
							inCostumeLoop = false; 
						MakinoonName.talkForever();
						}
						
				}
				
			}
			if (containsPositive == false ){
				inCostumeLoop = false;
				MakinoonName.talkForever();
			}
			
			
			
			
		}
	}
	
	public String getResponse(String input, String[] anyArray){
		String inputSelected = "";
		boolean coninuing = true;
		while(coninuing){
			String options = "";
			//check if the input is any color
			for(int i = 0; i < anyArray.length; i++){
				options += anyArray[i] + " ";
				
				if(MakinoonName.findKeyword(input, anyArray[i], 0) >=0){
					inputSelected = anyArray[i];
					return inputSelected; //ends method
				}	
			}
			if(MakinoonName.findKeyword(input, "stop", 0) >= 0
					||MakinoonName.findKeyword(input, "not interested", 0) >= 0
					||MakinoonName.findKeyword(input, "I don't want to", 0) >= 0
					||MakinoonName.findKeyword(input, "forget it", 0) >= 0
					){
				coninuing = false;
				MakinoonName.talkForever();
			}
			else{
				MakinoonName.print("sorry, I can only match "+ options
						+ "\n Please enter something else");
				
				input = MakinoonName.getInput();
				
			}
		}
		return "stop";
	}
	
	private void makeCostumeList(){
		//politics - categorized by political party 
		Costume trump = new Costume("Donald Trump", "n/a", "politics", "republican", "n/a", "n/a");
		costumeList[0] = trump;
		Costume hillary = new Costume("Hillary Clinton", "n/a", "politics", "democrat", "n/a", "n/a");
		costumeList[1] = hillary;
		//Sports - categorized by jersey colors 
		Costume mj = new Costume("Michael Jordan", "red", "sports", "n/a", "n/a", "basketball");
		costumeList[2] = mj;
		Costume ronaldo = new Costume("Christiano Ronaldo", "red", "sports", "n/a", "n/a", "soccer");
		costumeList[3] = ronaldo;
		
		Costume westbrook = new Costume("Russell Westbrook", "blue", "sports", "n/a", "n/a", "basketball"); 
		costumeList[4] = westbrook;
		Costume messi = new Costume("Lionel Messi", "blue", "sports", "n/a", "n/a", "soccer");
		costumeList[5] = messi;
		
		Costume garnett = new Costume("Kevin Garnett", "green", "sports", "n/a", "n/a", "basketball"); 
		costumeList[6] = garnett;
		Costume howard = new Costume("Tim Howard", "green", "sports", "n/a", "n/a", "soccer"); 
		costumeList[7] = howard;
		
		Costume bosh = new Costume("Chris Bosh", "black", "sports", "n/a", "n/a", "basketball"); 
		costumeList[8] = bosh;
		Costume bale = new Costume("Gareth Bale", "black", "sports", "n/a", "n/a", "soccer"); 
		costumeList[9] = bale;
		
		//music - categorized by genre
		Costume kanye = new Costume("Kanye West", "n/a", "music", "n/a", "hip-hop", "n/a"); 
		costumeList[10] = kanye; 
		Costume tupac = new Costume("Tupac Shakur", "n/a", "music", "n/a", "rap", "n/a"); 
		costumeList[11] = tupac;
		Costume taylor = new Costume("Taylor Swift", "n/a", "music", "n/a", "pop", "n/a"); 
		costumeList[12] = taylor;
		
		//Superheroes -catergorized by color also
		Costume batman = new Costume("Batman", "black", "superheroes", "n/a", "n/a", "n/a"); 
		costumeList[13] = batman;
		Costume flash = new Costume("The Flash", "red", "superheroes", "n/a", "n/a", "n/a"); 
		costumeList[14] = flash;
		Costume captain = new Costume("Captain America", "blue", "superheroes", "n/a", "n/a", "n/a"); 
		costumeList[15] = captain;
		Costume lantern = new Costume("Green Lantern", "green", "superheroes", "n/a", "n/a", "n/a"); 
		costumeList[16] = lantern; 
		
		 
	}
	private String findCostume(){
		
		Costume[] possibleCostume = new Costume[17];
		int numberOfPossibleCostumes = 0; 
		for ( int i = 0; i < costumeList.length; i++ ){
			Costume currentCostume = costumeList[i]; 
			if (currentCostume.color.equals(color) || currentCostume.color.equals("n/a")) { 
				if( currentCostume.subject.equals(subject) || currentCostume.subject.equals("n/a")){
					if( currentCostume.politicalParty.equals(politicalParty) || currentCostume.politicalParty.equals("n/a")){
						if( currentCostume.genre.equals(genre) || currentCostume.genre.equals("n/a")){
							if( currentCostume.sportCategory.equals(sportCategory) || currentCostume.sportCategory.equals("n/a")){
								possibleCostume[numberOfPossibleCostumes] = currentCostume; 
								numberOfPossibleCostumes += 1; 
							}
						}
					}
						
					
				}
			}
		}
		if(numberOfPossibleCostumes == 0 ){
			System.out.println("Sorry I couldn't find your custom");
			MakinoonName.talkForever();
			
		}
		
		String chosenCostume = possibleCostume[0].name; 
		return chosenCostume ;
		
	}
	public boolean isTriggered(String userInput) {
		if(MakinoonName.findKeyword(userInput, "costume", 0) >= 0){
			return true;
		}
		if(MakinoonName.findKeyword(userInput, "outfit", 0) >= 0){
			return true;
		}
		return false;
	}
}


