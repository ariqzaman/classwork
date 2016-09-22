package datatypes;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	static int lineCount;
	
	public static void main(String[] args) {
		createAScanner();
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
		while(true){
			promptInput();
		}
	}
	
	private static void promptInput() {
		print(user +" try putting in a string");
		String userInput = input.nextLine();
		print("you typed" + userInput);
		
	}
	
	public static void print(String s){
		lineCount++;
		System.out.println("Line # "+ lineCount+ ": " + s);
	}

	public static void createAScanner() {
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
