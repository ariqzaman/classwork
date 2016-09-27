package chatbox6;

import java.util.Scanner;

public class AriqMain {

	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inloop;
	static String response;
	static Topic school;
	static Topic like;

	public static void main(String[] args) {
		createTopics();
		lineCount = 0;
		//demonstrateStringMethods();
		promptName();
		talkForever();
	}
	private static void promptName() {
		print("hello human blah blah blach wats ur name?");
		user = input.nextLine();
		print("hello "+ user);

	}
	public static void talkForever(){
		inloop = true; 
		//while(true){
		//	promptInput();
		//}
		while(inloop){
			print("hello"+user+"how are you");
			response = getInput();
			if (findKeyword(response, "good", 0) >= 0){
				print("im so happy u r good");				
				
			}
			else if(findKeyword(response, "like", 0) >=0){
				inloop = false;//exit this loop
				school.talk();
			}
			else{
				print("im sorry");
			}
		}
	}
	
	
	
	private static int findKeyword(String searchString,
			String key,
			int startIndex) {
		String phrase = searchString.trim();
		//set letters to lowercase 
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		
//		System.out.println("the phrase is "+ phrase);
//		System.out.println("the key is "+ key);
		
		
		//find position of key
		int psn = phrase.indexOf(key);
		
//		System.out.println("the position  found is  "+ psn);
		
		
		//keep looking for word till u find right contect
		while (psn >= 0){
			String before = " ";
			String after = " ";
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
//				System.out.println("the character after "+ key + " is "+ after);
				
			}
			if(psn > 0){
				before = phrase.substring(psn-1, psn).toLowerCase();
//				System.out.println("the character before "+ key + " is "+ before);
				
			}
			if(before.compareTo("a")<0 && after.compareTo("a")<0){
//				System.out.println(key +" was found at "+ psn );
				
				
				if(noNegations(phrase, psn)){
					return psn;	
					
				}
				
			}
			
			psn = phrase.indexOf(key, psn+1);
//			System.out.println(key + " was not found "+" checking "+psn);
		}
		
		return -1;
	}
	
	//helper method - a method that contributes functionallity 
	//to another method
	//common when u do the same things repeatedly
	//more readable
	// method is private because it is only used by the method
	private static boolean noNegations(String phrase, int index){
		//check for "no" (3 characters)
		// check to see if there is space for the word "no" to be in front of the index
		if(index - 3 >= 0 && phrase.substring(index-3,index).equals("no ")){
			return false;
		}
		//check for not
		if(index - 4 >= 0 && phrase.substring(index-4,index).equals("not ")){
			return false;
		}
		//never
		if(index - 6 >= 0 && phrase.substring(index-6,index).equals("never ")){
			return false;
		}
		//n't
		if(index - 4 >= 0 && phrase.substring(index-4,index).equals("n't ")){
			return false;
		}
		return true;
		
	}
	
	public static String getInput(){
		return input.nextLine(); 
	}

	private static void promptInput() {
		print(user +" try putting in a string");
		String userInput = input.nextLine();
		print("you typed" + userInput);

	}

	
	
	
	
	
	//public static void print(String s){
	//	lineCount++;
	//	System.out.println("Line # "+ lineCount+ ": " + s);
	//}

	public static void print(String s){
		//create a multi-line string
		String printString = "";
		int cutoff = 35;
		//check to see if there are words to add
		//(Iow. is the length of s > 0 
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and next Word are less
			// than the cutoff AND there r stil words to add,
			//do the following loop
			while (currentLine.length()+nextWord.length() <= cutoff && 
					s.length()>0){
				//add next word to the line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the follwoing word
				int endOfWord = s.indexOf(" ");
				if (endOfWord == -1){
					endOfWord = s.length() - 1;

				}			
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine;
		}

		System.out.println(printString);
	}




	public static void demonstrateStringMethods(){
		//String text = new String ("hello world");
		String text = "hello world";// same as above
		String text2 = "hello ";
		String text3 = "world";
		if (text.equals(text2+text3)){
			System.out.println("these string r equal");
		}

		String word1 = "kek";
		String word2 = "kuk";
		if (word1.compareTo(word2) < 0){
			System.out.println("word1 is b4 word2");
		}
	}
	
	public static void createTopics() {
		input = new Scanner(System.in);
		school = new School();
		like = new AriqLike();
				
	}
		
}