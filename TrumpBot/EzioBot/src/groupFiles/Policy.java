package groupFiles;
//Daniel Goon
public class Policy implements Topic{

	private boolean inPolicyLoop;
	private String res;
	private String resC;
	private int nonI;

	public void talk() {
		inPolicyLoop = true;
		nonI = 0;
		
		String[] nafta = {"NAFTA is ruining America. We need to renegotiate  the terms.","We have to stop outsourcing our jobs"
				+ "and make America great again.","We're going to end this job killing agreement."};
		String[] tReason = {"NAFTA is ruining American. Look, I will make a great plan – and nobody makes plans "
				+ "better than me, believe me – and " + "I’ll make them very well. I will build the greatest plan for our country, "
				+ "and I will make Mexico give our jobs back. Mark my words.","Look, I'm going to bring back our jobs "
						+ "and I'm going to create jobs you never seen before.","My plan will be the best plan, do you think Hillary's sub-optimal plan will work? No! How "
								+ "She is even broadcasting her plans to defeat our enemies to them on her website!"};
		String[] immigration = {"We need to get rid of those illegal immigrants.","We only keep the ones that welcome our way of life.",
				"We're going to enforce our border and stop them from sending their criminals."};
		String[] iReason = {"The reason why I want to get rid of the illegal aliens is because they're bringing their drugs, they're bringing their crime, they're rapists.",
				"The border states along Mexico report great crime when aliens are pouring into our lands."};
		String[] annoyedRes = {"Isn't that what you just said last time?","You better start saying something else.","Speak about NAFTA or immigration or else I will be very,"
				+ " very annoyed",	"If you keep doing this, then you’re disgusting."};
		String[] nonsense = {"Thanks sweetie, that's nice.","You better start making some sense"};
		String[] nonR = {"Hey, I can play this game  too. China", "Benghazi","Small Loan"};
		
		TrumpMain.print("What do you want to know about? NAFTA or Immigration?");
		resC = "";
		
		while(inPolicyLoop){
		res = TrumpMain.getInput();
		if(repeatedWord(resC, res)){
			TrumpMain.print(annoyedRes[chooseResponse(annoyedRes.length)]);
		}else{
			if(exitTopic()){
				inPolicyLoop = false;
				TrumpMain.talkForever();
			}
			
			int statementP = chooseList();
			int whyState = whyChoose();
			int broadState = broadT();
			int alreadyS = 0; 
			
				if(broadState == 1){
					TrumpMain.print(nafta[chooseResponse(nafta.length)]);
					alreadyS = 1;
				}
				if(broadState == 2){
					TrumpMain.print(immigration[chooseResponse(immigration.length)]);
					alreadyS = 1;
				}
				if(statementP == 1){
					TrumpMain.print(nafta[chooseResponse(nafta.length)]);
					alreadyS = 1;
				}
				if(statementP == 2){
					TrumpMain.print(immigration[chooseResponse(immigration.length)]);
					alreadyS = 1;
				}
				if(whyState == 1){
					TrumpMain.print(tReason[chooseResponse(tReason.length)]);
					alreadyS = 1;
				}
				if(whyState == 2){
					TrumpMain.print(iReason[chooseResponse(iReason.length)]);
					alreadyS = 1;
				}
				if(alreadyS == 1){
					
				}
				else if(statementP == -1){
					nonI+=1;
					if(nonI < 4){
						TrumpMain.print(nonsense[chooseResponse(nonsense.length)]);
					}
					if(nonI == 4){
						TrumpMain.print("I can play this game too. China.");
					}
					if(nonI > 4 && nonI < 8){
						TrumpMain.print(nonR[chooseResponse(nonR.length)]);
					}
					if(nonI == 8){
						TrumpMain.print("Look this is getting kind of boring. I have betters things to do, like making millions.");
					}
					if(nonI > 8){
						char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
						String trumpR ="";
						for(int i = 0;i < 8;i++){
							trumpR += alphabet[chooseResponse(alphabet.length)];
						}
						TrumpMain.print(trumpR);
					}
					
				}
				resC = res;
		} 
		}
	}

	public boolean isTriggered(String userInput) {
		String[] keyW = {"nafta", "policy","trade","stance","policies","stances"};
		for(int i = 0;i < keyW.length;i++){
			if(TrumpMain.findKeyword(userInput, keyW[i], 0)>=0){
				return true;
			}
		}
		return false;
	}
	
	public static int chooseResponse(int length) {
		double rand = Math.random();
		int choice = (int) (length * rand);
		return choice;
	}
	public int chooseList(){
			String[] keyT = {"nafta","trade","policy"};
			String[] keyI = {"immigrants","immigrant","border","wall"};
			String[] noun = {"stance","belief","opinion"};
			for(int z = 0; z < noun.length; z++){
				if(TrumpMain.findKeyword(res,"what",0)>=0 && TrumpMain.findKeyword(res, noun[z], 0)>=0){
					for(int i = 0; i < keyT.length; i++){
						if(TrumpMain.findKeyword(res, keyT[i], 0)>=0){
							return 1;
						}
					}
					for(int a = 0; a <keyI.length; a++){
						if(TrumpMain.findKeyword(res, keyI[a], 0)>=0){
							return 2;
						}
					}
					return -1;
				}
			}
			return -1;
		}
	public int whyChoose(){
		String[] keyT = {"nafta","trade","policy"};
		String[] keyI = {"immigrants","immigrant","border","immigration"};
		String[] support = {"dislike","hate"," not support","do not support","against"};
		
			if(TrumpMain.findKeyword(res, "why", 0)>=0){
				for(int b = 0; b < support.length; b++){
					if(TrumpMain.findKeyword(res, support[b], 0)>=0){
						for(int i = 0; i<keyT.length;i++){
							if(TrumpMain.findKeyword(res, keyT[i], 0)>=0){
								return 1;
							}
						}
						for(int a = 0;a<keyI.length; a++){
							if(TrumpMain.findKeyword(res, keyI[a], 0)>=0){
								return 2;
							}
						}
					}
				}
			}
			else{
				return -1;
			}
		return -1;
	}
	public int broadT(){
		if(TrumpMain.findKeyword(res,"why",0)>=0){
			return -1;
		} else {
			if(TrumpMain.findKeyword(res, "nafta", 0)>=0){
	
				return 1;
			}
			if(TrumpMain.findKeyword(res, "immigration", 0)>=0){
				return 2;
			}
		}
		return -1;
	}
	public boolean exitTopic(){
		String[] exitW = {"leave","stop","quit"};
		for(int i = 0; i < exitW.length; i++){
			if(TrumpMain.findKeyword(res, exitW[i], 0)>=0){
				return true;
			}
		}
		return false;
	}
	public boolean repeatedWord(String saved, String newW){
		if(saved.equals(newW)){
			return true;
		}
		return false;
	}
}
