package groupFiles;

import java.util.*;
public class Raybot {
	static Scanner scan;
	static String user;
	static String response;
	static Topic kristy;
	static Topic ali;
	static Topic iram;
	static boolean inGreetLoop;
	static boolean inIpLoop;
	public static void main(String[] args) {
		createTopics();
		promptName();
		talkForever();
	}
	private static void createTopics() {
		scan = new Scanner(System.in);
		kristy = new KristyIsTriggered();
		ali = new AliTrigger();
		iram = new Iram();
	}
	public static void print(String x){
		System.out.println(x);
	}
	public static int findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim().toLowerCase();
		key.toLowerCase();
		int psn = phrase.indexOf(key);
		while(psn>=0){
			String before = " ";
			String after = " ";
			if(psn+key.length() < phrase.length()){
				after = phrase.substring(psn+key.length(), psn+key.length()+1);
			}
			if(psn>0){
				before = phrase.substring(psn-1, psn).toLowerCase();
			}
			if(before.compareTo("a")<0 && after.compareTo("a")<0){
				if(noNegations(phrase, psn))
				return psn;
			}
			psn = phrase.indexOf(key, psn+1);
		}
		return -1;
	}
	public static void promptName(){
		print("Hello there, student.");
		print("I'd advise you tell me your name before you talk to me.");
		user = scan.nextLine();
		print("Alright...");
		print("I'll call you "+user+".");
	}
	public static String getInput(){
		return scan.nextLine();
	}
	public static void talkForever(){
		inGreetLoop = true;
		int arrayCount = 0;
		String[] userSpeech = new String[100];
		String[] hateComments = {"Don't test me child.",
				"I don't think you are using the right hole for the right task.",
				"It is a pity that you have no shame.",
				"You are just as pitiful as a grain of sand in the hourglass of eternity.",
				"Has anything that has ever made sense come out of your mouth?"};
		while(inGreetLoop){
			print("Hello there, "+user+". Anything you feel like doing?");
			response = getInput();
			if(hasItem(userSpeech, response)){
				print(hateComments[(int)(Math.random()*hateComments.length)]);
			}
			else if(keywordFound(response, "bye")){
				inGreetLoop = false;
				print("Alright, stop talking to me; class is starting.");
			}
			else if(keywordFound(response, "you")){
				print("You want to talk about me? You've made a grave mistake.");
				inGreetLoop = false;
				ipLoop();
			}
			else if(iram.isTriggered(response)){
				print("That is my field of expertise.");
				inGreetLoop = false;
				iram.talk();
			}
			else if(kristy.isTriggered(response)){
				print("I believe it is time for a game...");
				inGreetLoop = false;
				kristy.talk();
			}
			else if(ali.isTriggered(response)){
				print("Time for a quiz!");
				inGreetLoop = false;
				ali.talk();
			}
			userSpeech[arrayCount] = response;
			arrayCount++;
			}
	}
	public static void ipLoop(){
		inIpLoop = true;
		while(inIpLoop){
			int opinionOfYou = randNum(1,5);
			String[] opinionsArray = {"ruined, inconsolable", "inert", "boring", "facetious", "exotic, but alright", "nice"};
			String[] nonchalantArray = {"Does this relate to my class?",
										"Honestly, why do I even bother.",
										"If I were you, I would rethink my question.",
										"Do I even feel like responding?"};
			int rand = randNum(5,10);
			print("What would you like to know about me?");
			response = getInput();
			if(keywordFound(response, "life")){
				if(checkGreater(randNum(0,200),rand)){
					print("I'm warning you; most people don't dig this deep.");
					increment(opinionOfYou, 1);
				}
				else{
					print(nonchalantArray[randNum(0,nonchalantArray.length-1)]);
					decrement(opinionOfYou, 2);
				}
				print("So "+opinionsArray[opinionOfYou]+" , what do you want to know about my life?");
				response = getInput();
				if(keywordFound(response, "job")){
					if(opinionOfYou == 5)
						print("You know, I've always wanted to be a baker.");
					else if(opinionOfYou >= 2){
						print("Being a teacher was always my passion.");
					}
					else
						print("What do you think I'm doing? You "+opinionsArray[opinionOfYou]+" child.");
				}
				else
					print("I'm afraid you're not allowed to know that.");
			}
			else if(keywordFound(response, "family")){
				if(checkGreater(randNum(0,50),rand)){
					print("Oh, are you sure you want to know about them?");
					increment(opinionOfYou, 1);
				}
				else{
					print(nonchalantArray[randNum(0,nonchalantArray.length-1)]);
					decrement(opinionOfYou, 1);
				}
				print("What would you like to know about my family?");
				response = getInput();
				if(keywordFound(response, "kids")){
					if(opinionOfYou >= 2)
						print("Oh, they're doing well; I guess.");
					else
						print("You shouldn't concern yourself with these matters.");
				}
				else if(keywordFound(response, "wife")){
					if(opinionOfYou >= 3)
						print("Uhh, to be honest, I don't know where she went.");
					else
						print("She was arrogant and now, she is gone.");
				}
				else 
					print("Hey, "+opinionsArray[opinionOfYou]+"kid, I'm not answering that.");
			}
			else if(keywordFound(response, "pet") || keywordFound(response, "pets")){
				if(checkGreater(randNum(0,20), rand)){
					print("Do you really believe I care about animals?");
					decrement(opinionOfYou, 1);
				}
				else{
					print("Those are just for sustenance... ha...");
					increment(opinionOfYou, 1);
				}
				print("So what would you like to know about my 'pets'?");
				response = getInput();
				if(keywordFound(response, "dog") || keywordFound(response, "cat")){
					if(opinionOfYou >= 4)
						print("Don't tell anyone, but I'm allergic to them.");
					else if(opinionOfYou >= 2)
						print("Oh, of course I've had those.");
					else
						print("Why should I even tell you?");
				}
				else
					print("Well, I'm not talking about that.");
			}
			else if(keywordFound(response, "nothing")){
				print("Don't bother me with useless questions. Try again.");
				opinionOfYou = 0;
			}
			else if(keywordFound(response, "computer science")){
				print("Oh you "+opinionsArray[opinionOfYou]+" kid, you want to learn computer science?");
				inIpLoop = false;
				ali.talk();
			}
			else if(keywordFound(response, "game")){
				print("Hey you "+opinionsArray[opinionOfYou]+" kid. Yes, you "+user+"... Wanna play a game?");
				inIpLoop = false;
				kristy.talk();
			}
			else if(keywordFound(response, "grammar") || keywordFound(response, "punctuation")){
				print("Hello there, "+opinionsArray[opinionOfYou]+" "+user+". I believe you want to learn some grammar.");
				inIpLoop = false;
				iram.talk();
			}
			else if(keywordFound(response, "start") || keywordFound(response, "greet")){
				print("Ok, let's start over.");
				inIpLoop = false;
				talkForever();
			}
			else {
				print("Do you mind speaking in a language that I can understand?");
			}
		}
	}
	//helpers
	private static int decrement(int num, int amount){
		if(num-amount > 0)
			return num-amount;
		else
			return 0;
	}
	private static int increment(int num, int amount){
		if(num+amount < 5)
			return num+amount;
		else
			return 5;
	}
	private static boolean checkGreater(int first, int second){
		return first > second;
	}
	private static boolean noNegations(String phrase, int index){
		if(index-3 >= 0 && phrase.substring(index-3, index).equals("no ")){
			return false;
		}
		if(index-4 >= 0 && phrase.substring(index-4, index).equals("not ")){
			return false;
		}
		if(index-6 >= 0 && phrase.substring(index-6, index).equals("never ")){
			return false;
		}
		if(index-4 >= 0 && phrase.substring(index-4, index).equals("n't ")){
			return false;
		}
		return true;
	}
	private static boolean hasItem(String[] arr, String find){
		return Arrays.asList(arr).contains(find);
	}
	private static boolean keywordFound(String whole, String keyword){
		return findKeyword(whole, keyword, 0)>=0;
	}
	private static int randNum(int min, int max){
		return (int)(Math.random()*(max-min+1)+min);
	}
}