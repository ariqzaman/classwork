package arrays;

import java.util.Random;

public class coolcakes {

	private static final String[] SPECIAL = { "Jack", "Queen", "King", "Ace" };
	private static final String[] TYPES = { "Diamond", "Club", "Heart", "Spades" };

	public static void main(String[] args) {
		int length = 50;
		int[] arr = new int[length];
		
		populate(arr);
		print(arr);

		populateRand(arr);
		print(arr);

		int[] log = new int[13];
		populateDice(arr, log);
		print(arr);
		printLog(log);

		printCards();
		
		System.out.println("blah");
	}

	public static void populate(int[] arr) {
		for (int i = 0; i != arr.length; i++)
			arr[i] = i + 1;
	}

	public static void populateRand(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i != arr.length; i++)
			arr[i] = rand.nextInt(5);
	}

	public static void populateDice(int[] arr, int[] log) {
		Random rand = new Random();
		for (int i = 0; i != arr.length; i++) {
			int num = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
			log[num]++;
			arr[i] = num;
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i != arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void printLog(int[] arr) {
		for (int i = 0; i != arr.length; i++) {
			System.out.println(i + " was ran " + arr[i]);
		}
	}

	public static void printCards() {
		for (int i = 1; i != 14; i++) {
			for (int j = 0; j != 4; j++) {
				if (i < 10) {
					System.out.println(TYPES[j] + " of " + (i + 1));
				} else {
					System.out.println(TYPES[j] + " of " + SPECIAL[i - 10]);
				}
			}
		}
	}
}