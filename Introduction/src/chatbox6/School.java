package chatbox6;

public class School implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	

	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			AriqMain.print("tell me about school");
			schoolResponse = AriqMain.getInput();
			if(schoolResponse.indexOf("stop")>=0){}
		}
		else{
			AriqMain.print("that is my fav part of school too");
		}

	}

}
