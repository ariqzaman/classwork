package datatypes;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inloop;
	static String response;

	public static void main(String[] args) {
		createTopics();
		lineCount = 0;
		demonstrateStringMethods();
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
			if (response.indexOf("good")>=0){
				print("im so happy u r good");
			}
			else{
				print("im sorry");
			}
		}
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

	public static void createTopics() {
		input = new Scanner(System.in);
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

}
