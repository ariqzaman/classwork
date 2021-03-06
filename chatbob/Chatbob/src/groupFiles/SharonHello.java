package groupFiles;

public class SharonHello implements Topic {
	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	
	//responses are constants(never change, always exist)
	private static String[]calmResponses=
		{"We've already said our hellos. Remember?", "Yes, hello to you too. Let's actually talk."};
	private static String[]angryResponses=
		{"Okay, seriously. This has to stop", "You are beginning to annoy me.","We've SAID HELLO!"};
	
	public SharonHello(){
		helloCount=0;
	}
	public void talk(){
		inHelloLoop=true;
		while(inHelloLoop){  
			helloCount++;
			printResponse();
			helloResponse=SharonChatBox.getInput();
			//! is used for negation.
			if (!isTriggered(helloResponse)){
				inHelloLoop=false;
				SharonChatBox.talkForever();
			}
		}
		
	}
	private void printResponse(){
		int responseIndex=0;
		//calm response
		if (helloCount<5){
			responseIndex=(int)(Math.random()*calmResponses.length);
			SharonChatBox.print(calmResponses[responseIndex]);
		}
		//angry response
		else{
			responseIndex=(int)(Math.random()*angryResponses.length);
			SharonChatBox.print(angryResponses[responseIndex]);
		}
	}
	public boolean isTriggered(String userInput){
	
			if (SharonChatBox.findKeyword(userInput, "hi", 0)>=0){
				return true;
			}
			if (SharonChatBox.findKeyword(userInput, "hello", 0)>=0){
				return true;
			}
			return false;
		
	}
//fuyf
}
