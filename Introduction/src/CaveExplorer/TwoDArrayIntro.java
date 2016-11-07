package CaveExplorer;

import java.util.Scanner;

public class TwoDArrayIntro {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		int roomsY = 10, roomsX = 10;
		int x = 0, y = 0;

		while (true) {
			System.out.println("You are in room " + x + " " + y + ". What do u want to do? Enter:");
			System.out.println("w, a, s, d");
			print(roomsY, roomsX, y, x);
			String input = scanner.nextLine();

			if (input.equals("w") && y + 1 < roomsY) {
				y++;
			} else if (input.equals("a") && x > 0) {
				x--;
			} else if (input.equals("s") && y > 0) {
				y--;
			} else if (input.equals("d") && x + 1 < roomsX) {
				x++;
			}
		}
	}

	public static void print(int roomsX, int roomsY, int posX, int posY) {
		for (int j = 0; j != roomsX; j++) {
			System.out.print("____");
		}
		System.out.println();

		for (int i = 0; i != roomsY; i++) {
			for (int j = 3; j > 0; j--) {
				for (int k = 0; k != roomsX; k++) {
					if (j == 1) {
						System.out.print("|___");
					} else {
						if (j == 2 && i == posX && k == posY) {
							System.out.print("| X ");
						} else {
							System.out.print("|   ");
						}
					}
				}
				System.out.println("|");
			}
		}
	}

}
