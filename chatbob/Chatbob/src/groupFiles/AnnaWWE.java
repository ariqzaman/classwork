package groupFiles;

//import chatBox.Anna;

public class AnnaWWE implements Topic{

	private boolean inWWELoop;
	private String WWEResponse;
	
	@Override 
	public void talk() {
		// TODO Auto-generated method stub
		SharonChatBox.print("Do you like wrestling? Please answer with yes or no");
		inWWELoop = true;
		while (inWWELoop){
			WWEResponse = SharonChatBox.getInput();
			if(SharonChatBox.findKeyword(WWEResponse," yes ",0)>=0 || SharonChatBox.findKeyword(WWEResponse," yes.",0)>=0){
				SharonChatBox.print("Do you like WWE? Please answer with yes or no");
				WWEResponse = SharonChatBox.getInput();
				if (SharonChatBox.findKeyword(WWEResponse," yes ",0)>=0 || SharonChatBox.findKeyword(WWEResponse," yes.",0)>=0){
					SharonChatBox.print("You are so cool. Who do you like?");
					String[] divas = {"dean ambrose", "seth rollins", "roman reigns", "aj styles", "kevin owens","chris jericho", "charlotte", "sasha banks", "becky lynch", "bayley", "john cena", "randy orton"};
					WWEResponse = SharonChatBox.getInput();
					for ( int i=0; i<divas.length; i++){
						if (SharonChatBox.findKeyword(WWEResponse,divas[i],0)>=0){
							SharonChatBox.print(divas[i] + " is the best!");
						}
					}
					
				}
				else{
					inWWELoop = false;
					SharonChatBox.talkForever();
				}
				
			}
			else{
				inWWELoop = false;
				SharonChatBox.talkForever();
			}
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		String[] array = {"wrestling","wrestler","wwe","champion"};
		for (int  i = 0; i < array.length; i++){
			if (SharonChatBox.findKeyword(userInput, array[i], 0)>=0){
				return true;
			}
		}
		return false;
	} 

}
