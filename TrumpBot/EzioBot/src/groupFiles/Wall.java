package groupFiles;
//Sammyajit Kapuria

public class Wall implements Topic{

	private boolean inWallLoop;
	public String wallResponse;





	public void talk() {
		String trumpWallRes[] = {"Res1","Res2","Res3"};
		inWallLoop = true;
		while(inWallLoop){
			wallResponse = TrumpMain.getInput();
			if(exitTopic(wallResponse)){
				inWallLoop = false;
				TrumpMain.talkForever();
			} else {
			
				int wallPsn = TrumpMain.findKeyword(wallResponse, "wall", 0);
				int wallPsn2 = TrumpMain.findKeyword(wallResponse, "build", 0);
				if (wallPsn >= 0) {
					TrumpMain.print(trumpWallRes[chooseResponse()]);
				}else{
					if (wallPsn2 >= 0) {
						TrumpMain.print(trumpWallRes[chooseResponse()]);
					}
	
					else  {
						TrumpMain.print("I don't understand you.");
					}
				}
			}
		}

	}
	public static int chooseResponse() {
		double rand = Math.random();
		int choice = (int) (3 * rand);
		return choice;
	}
	public boolean isTriggered(String userInput) {
		if (TrumpMain.findKeyword(userInput, "wall", 0) >= 0||TrumpMain.findKeyword(userInput, "build", 0) >= 0) {
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
