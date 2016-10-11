package groupFiles;

public class SharonLike implements Topic{
	public boolean inLikeLoop;
	private String likeResponse;
	
	public void talk(){
		SharonChatBox.print("What are some of the things you like?");
		inLikeLoop=true;
		while(inLikeLoop){
			likeResponse=SharonChatBox.getInput();
			int likePsn=SharonChatBox.findKeyword(likeResponse, "like", 0);
			if (likePsn>=0){
				String thingsLiked=likeResponse.substring(likePsn+5);
				SharonChatBox.print("you are such an interesting person because you like "+thingsLiked);
				if (SharonChatBox.findKeyword(thingsLiked, "school", 0)>=0){
					inLikeLoop=false;
					SharonChatBox.school.talk();
				}
				
				inLikeLoop=false;
				SharonChatBox.talkForever();
			}
			else{
				SharonChatBox.print("I don't understand you.");
			}
		}
	}

		public boolean isTriggered(String userInput){
			
			if (SharonChatBox.findKeyword(userInput, "like", 0)>=0){
				return true;
			}
			return false;
		
			
		}
		
}
