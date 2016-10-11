package groupFiles;

import java.util.Random;

public class SharonJokes implements Topic {
	//private boolean inJokesLoop;
	private String jokesResponse;
	private String kkjokeSubjects[] = {"Anime","Yah!","Art"};
	private String kkjokeAnswers[] = {"Are you from Japan? Cause you've got Anime-zing body!\n",
			"Well, thanks, but i'm more of a Google person\n","R2-D2\n"};

		public void talk() {
			String[] puns = {"A guy gets hit by a car and suffers brain damage. I guess you could say he was driven insane",
					"Time flies like an arrow, fruit flies like banana.",
					"If you want to catch a squirrel just climb a tree and act like a nut.",
					"When I get naked in the bathroom, the shower usually gets turned on." };
			int i = new Random().nextInt(puns.length); //draws value between 0(inclusive)-length(exclusive)
			System.out.println("Fun's my middle name.\n"+puns[i]);
			/*String punResponse= */
			SharonChatBox.getInput();
			 /*
			 if (punResponse== "not funny"|| punResponse=="lame") {
				 System.out.println("well then...");
			 };
			 */
				 
			System.out.println("very well...\n"); 
		
			for(int x = 0; x < kkjokeSubjects.length; x++){
				System.out.println("Knock Knock"); //knock knock
				jokesResponse=
				SharonChatBox.getInput(); //whose there
				sayWhosThere();
			System.out.println(kkjokeSubjects[x]); //subject 
			jokesResponse=
			SharonChatBox.getInput(); //subject who?
			saySubjectWho();
			System.out.println(kkjokeAnswers[x]); //answer
			
			
			};
			System.out.println("Well.. that's all i've got.\n");
			SharonChatBox.talkForever();
				
				}
		
//				else{
//					SharonChatBox.print("I don't understand you.");
//				}
		private void sayWhosThere(){
			if (SharonChatBox.findKeyword(jokesResponse,"who's there",0)>=0)
			{
				
			}
			else if (SharonChatBox.findKeyword(jokesResponse,"who's there",0)<=0)
			{
				System.out.println("You were supposed to ask who's there?");
				jokesResponse=
				SharonChatBox.getInput();
				sayWhosThere();
			}
		}
			private void saySubjectWho(){
				if (SharonChatBox.findKeyword(jokesResponse,"who",0)>=0)
				{
					
				}		
				else if (SharonChatBox.findKeyword(jokesResponse,"who",0)<=0)
				{
					System.out.println("You were supposed to who that is");
				jokesResponse=
					SharonChatBox.getInput(); //subject who?
					saySubjectWho();
					
				}		
			
			
		}
		
		
		public boolean isTriggered(String userInput) {
			if(SharonChatBox.findKeyword(userInput, "joke", 0)>= 0)
			{
				return true;
			}
			if(SharonChatBox.findKeyword(userInput, "jokes", 0)>= 0)
			{
				return true;
			}
			if(SharonChatBox.findKeyword(userInput, "funny", 0)>= 0)
			{
				return true;
			}
			return false;
		}
}


