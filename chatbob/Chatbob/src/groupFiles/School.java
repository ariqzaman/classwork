package groupFiles;

public class School implements Topic {
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk(){
		inSchoolLoop=true;
		
		while(inSchoolLoop){
			SharonChatBox.print("Tell me about school.");
			schoolResponse=SharonChatBox.getInput();
			if (schoolResponse.indexOf("stop")>=0){
				inSchoolLoop=false;
				SharonChatBox.talkForever();
			}
			else {  
			SharonChatBox.print("That's my favorite part of school too");
			}
		}
	}
	public boolean isTriggered(String userInput){
//		String[] triggers={"school","class","teacher"};
//		you could use a for loop to iterate through an array.
		if (SharonChatBox.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if (SharonChatBox.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}

}
