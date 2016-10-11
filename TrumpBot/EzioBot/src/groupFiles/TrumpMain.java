package groupFiles;

//Special Comment by Mr. Nockles
//Matthew Yarmolinsky

import java.util.Scanner;

public class TrumpMain {

	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic million;
	static Topic hillary;
	static Topic policy;
	static Topic wall;

	public static void main(String[] args) {
		createTopics();
		promptName();
		talkForever();
	}

	private static void promptName() {
		print("Hello, citizen of America! It is I, your future president, Donald Trump. What can I call you?");
		user = input.nextLine();
		print("Alright, I'll call you " + user + " then. But don't expect me to remember such a plebeian's name.");
	}

	public static void talkForever() {
		inLoop = true;
		while (inLoop) {
			print("Why, hello. What was your name again? Ah, yes. " + user + ". What do you want to talk about?");
			response = getInput();
			if (million.isTriggered(response)) {
				inLoop = false;
				million.talk();
			}
			if (hillary.isTriggered(response)) {
				inLoop = false;
				hillary.talk();
			}
			if (policy.isTriggered(response)) {
				inLoop = false;
				policy.talk();
			}
			if (wall.isTriggered(response)) {
				inLoop = false;
				wall.talk();
			}
		}
	}

	public static int findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim();
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		int psn = phrase.indexOf(key);
		while (psn >= 0) {
			String before = " ";
			String after = " ";
			if (psn + key.length() < phrase.length()) {
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
			}
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (before.compareTo("a") < 0 && after.compareTo("a") < 0) {
				if (noNegations(phrase, psn)) {
					return psn;
				}
			}
			psn = phrase.indexOf(key, psn + 1);
		}

		return -1;
	}

	private static boolean noNegations(String phrase, int index) {
		if (index - 3 >= 0 && phrase.substring(index - 3, index).equals("no ")) {
			return false;
		}
		if (index - 4 >= 0 && phrase.substring(index - 4, index).equals("not ")) {
			return false;
		}
		if (index - 6 >= 0 && phrase.substring(index - 6, index).equals("never ")) {
			return false;
		}
		if (index - 4 >= 0 && phrase.substring(index - 4, index).equals("n't ")) {
			return false;
		}
		return true;
	}

	public static void promptInput() {
		print(user + "! Try inputting a String!");
		String userInput = input.nextLine();
		print("You typed: " + userInput);
	}

	public static String getInput() {
		return input.nextLine();
	}

	public static void print(String s) {
		String printString = "";
		int cutoff = 35;
		while (s.length() > 0) {
			String currentLine = "";
			String nextWord = "";
			while (currentLine.length() + nextWord.length() <= cutoff && s.length() > 0) {
				currentLine += nextWord;
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				if (endOfWord == -1) {
					endOfWord = s.length() - 1;
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}

		System.out.println(printString);
	}

	public static void createTopics() {
		input = new Scanner(System.in);
		million = new Million();
		hillary = new Hillary();
		policy = new Policy();
		wall = new Wall();
	}
}
