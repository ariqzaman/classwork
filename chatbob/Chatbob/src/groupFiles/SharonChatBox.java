package groupFiles;

import java.util.Scanner;

public class SharonChatBox {
	
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	
	static Topic hello;
	static Topic food;
	static Topic mean;
	static Topic nice;
	static Topic jokes;
	static Topic sports;




	public static void main(String[] args){
		createTopics();
	
		promptName();
		talkForever();
		
	}
	
	public static void promptName(){
		print("Hello, What is your name?");
				user=input.nextLine();
				print("Nice to meet you, "+user+ " !");
	}
	
	public static void talkForever(){
		inLoop=true;
		while (inLoop){
			print("Greetings, "+user+". Would you like to talk about wrestling, food, or hear some jokes?");
			response=getInput();
			
			/*
			if (findKeyword(response,"good",0)>=0){
				print("I'm so happy you're good.");
			
			}
			else if (findKeyword(response,"terrible",0)>=0){
				print("poor thing! \nlet me tell you a joke :) ");
				inLoop= false;
				jokes.talk();
			
				*/
				if (findKeyword(response,"no",0)>=0)
				{
					inLoop = false;
					print("Well then.\n I guess I will not be a suitable companion. Farewell.");      
				}
				else if (food.isTriggered(response))
				{
					inLoop = false;
					food.talk();      
				}
				
				else if (mean.isTriggered(response))
				{
					inLoop = false;
					mean.talk();      
				}
				else if (nice.isTriggered(response))
				{
					inLoop = false;
					nice.talk();      
				}

				else if (sports.isTriggered(response))
				{
					inLoop = false;
					sports.talk();      
				}
				else if (jokes.isTriggered(response))
				{
					inLoop = false; 
					jokes.talk();

				}
				else 
				{
					print("I do not have the capacity to comprehend this yet.");
				}
		}
		
		}
	public static int findKeyword(String searchString, String key, int startIndex){
		
		//delete the white space
		String phrase=searchString.trim();
		//set all the letters to lowercase
		phrase=phrase.toLowerCase();
		key=key.toLowerCase();
		
		int psn=phrase.indexOf(key); 
		/*
		System.out.println("The position found is "+psn);
		//keep looking for the word until you find the right context.
		*/
		while (psn>=0){
			String before=" ";
			String after=" ";
			if (psn+key.length() <phrase.length()){
				after=phrase.substring(psn+key.length(), psn+key.length()+1).toLowerCase();
				/*System.out.println("the character after "+key+" is "+after);*/
			}
			//if the phrase does not begin with this word
			if(psn>0){
				before=phrase.substring(psn-1,psn).toLowerCase();
				/*System.out.println("the character before "+key+" is "+before);*/
			}
			if (before.compareTo("a")<0 && after.compareTo("a")<0 &&after.compareTo("a")<0){
				/*System.out.println(key+" was found at "+psn);*/
				if (noNegations(phrase,psn)){
					return psn;
				}
				//return psn;
			}
			//in case the keyword was not found yet,check the rest of the string.
			psn=phrase.indexOf(key,psn+1);
			/*System.out.println(key+" was not found. Checking "+psn);*/
		}
				
		return -1;
	}

	public static String getInput(){
		return input.nextLine();
	}
	
	private static boolean noNegations(String phrase, int index){
	
		if (index-3>=0 && phrase.substring(index-3,index).equals("no ")){
			return false;
		}
		//check for "not "
		if (index-4>=0 && phrase.substring(index-4,index).equals("not ")){
			return false;
		}
		//check for "never "
		if (index-6>=0 && phrase.substring(index-6,index).equals("never ")){
			return false;
		}
		//check for "n't "
		if (index-4>=0 && phrase.substring(index-4,index).equals("n't ")){
			return false;
		}
		return true;
		
	}
	public static void promptInput(){
		print("Try inputing a String!");
		String userInput = input.nextLine();
		print(userInput);
	}
	
	public static void print(String s){
		//create a multi-line String
		String printString = "";
		int cutoff= 35;
		while(s.length()>0){
			String currentLine="";
			String nextWord="";
			//while the currentLine and nextWord are less than the cuttoff,
			// and there are still words to add, do the following loop.
		while(currentLine.length()+
				nextWord.length() <= cutoff && s.length()>0){
			//add the next word to the line
			currentLine+=nextWord;
			//then, remove that word
			s=s.substring(nextWord.length());
			//get the following word.
			int endOfWord=s.indexOf(" ");
			//check to see if this is the last word
			if (endOfWord==-1){
				endOfWord= s.length()-1;
			}
			nextWord=s.substring(0,endOfWord+1);
		}
		printString+= currentLine+"\n";
		}
		System.out.println(printString);
	}
	
	public static void createTopics() {
		input=new Scanner(System.in);
		
		hello= new SharonHello();
		mean= new DanielMean();
		food=new JiayanFood();
		nice= new DanielNice();
		jokes= new SharonJokes();
		sports= new AnnaWWE();
	}
	
	

			
}
		
	

