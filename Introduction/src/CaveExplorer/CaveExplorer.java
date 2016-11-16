package CaveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	public static CaveRoom caves[][];
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;

	public static void main(String args[]) {
		caves = new CaveRoom[9][16];
		for (int row = 0; row < caves.length; row++) {
			for (int col = 0; col < caves[row].length; col++) {
				caves[row][col] = new CaveRoom("This cave has coordinates" + row + "," + col);

			}
		}
		
		
		caves[0][2] = new EventRoom("this is the room where hujfg", new GameStartEvent());
		
		
		
		
		
		
		
		
		
		
		
		
		currentRoom = caves[0][1];
		
		currentRoom.enter();
		
		//[0][1] is connected to [0][2]
		caves[0][0].setConnection(CaveRoom.EAST, caves[0][1], new Door());
		caves[0][1].setConnection(CaveRoom.EAST, caves[0][2], new Door());
		caves[0][2].setConnection(CaveRoom.EAST, caves[0][3], new Door());
		
		
		caves[0][0].setConnection(CaveRoom.SOUTH, caves[1][0], new Door());
		caves[1][0].setConnection(CaveRoom.SOUTH, caves[2][0], new Door());
		caves[2][0].setConnection(CaveRoom.SOUTH, caves[3][0], new Door());
		caves[3][0].setConnection(CaveRoom.SOUTH, caves[4][0], new Door());
		caves[4][0].setConnection(CaveRoom.SOUTH, caves[5][0], new Door());
		caves[5][0].setConnection(CaveRoom.SOUTH, caves[6][0], new Door());
		caves[6][0].setConnection(CaveRoom.SOUTH, caves[7][0], new Door());
		caves[7][0].setConnection(CaveRoom.SOUTH, caves[8][0], new Door());
		
		
		
		caves[8][0].setConnection(CaveRoom.EAST, caves[8][1], new Door());
		caves[8][1].setConnection(CaveRoom.EAST, caves[8][2], new Door());
		caves[8][2].setConnection(CaveRoom.EAST, caves[8][3], new Door());
		
		caves[8][3].setConnection(CaveRoom.NORTH, caves[7][3], new Door());
		caves[7][3].setConnection(CaveRoom.NORTH, caves[6][3], new Door());
		
		caves[6][3].setConnection(CaveRoom.WEST, caves[6][2], new Door());
		caves[6][3].setConnection(CaveRoom.EAST, caves[6][4], new Door());
		
		caves[6][2].setConnection(CaveRoom.NORTH, caves[5][2], new Door());
		caves[5][2].setConnection(CaveRoom.NORTH, caves[4][2], new Door());
		caves[4][2].setConnection(CaveRoom.NORTH, caves[3][2], new Door());
		caves[3][2].setConnection(CaveRoom.NORTH, caves[2][2], new Door());
		
		caves[4][0].setConnection(CaveRoom.EAST, caves[4][1], new Door());
		caves[4][1].setConnection(CaveRoom.EAST, caves[4][2], new Door());
		
		caves[0][3].setConnection(CaveRoom.SOUTH, caves[1][3], new Door());
		caves[1][3].setConnection(CaveRoom.SOUTH, caves[2][3], new Door());
		caves[2][3].setConnection(CaveRoom.WEST, caves[2][2], new Door());
		
		caves[6][4].setConnection(CaveRoom.EAST, caves[6][5], new Door());
		caves[6][5].setConnection(CaveRoom.EAST, caves[6][6], new Door());
		caves[6][6].setConnection(CaveRoom.EAST, caves[6][7], new Door());
		caves[6][7].setConnection(CaveRoom.EAST, caves[6][8], new Door());
		caves[6][8].setConnection(CaveRoom.EAST, caves[6][9], new Door());
		caves[6][9].setConnection(CaveRoom.EAST, caves[6][10], new Door());
		caves[6][10].setConnection(CaveRoom.EAST, caves[6][11], new Door());
		caves[6][11].setConnection(CaveRoom.EAST, caves[6][12], new Door());
		caves[6][12].setConnection(CaveRoom.EAST, caves[6][13], new Door());
		
		caves[2][3].setConnection(CaveRoom.EAST, caves[2][4], new Door());
		caves[2][4].setConnection(CaveRoom.EAST, caves[2][5], new Door());
		caves[2][5].setConnection(CaveRoom.EAST, caves[2][6], new Door());
		caves[2][6].setConnection(CaveRoom.EAST, caves[2][7], new Door());
		caves[2][7].setConnection(CaveRoom.EAST, caves[2][8], new Door());
		caves[2][8].setConnection(CaveRoom.EAST, caves[2][9], new Door());
		caves[2][9].setConnection(CaveRoom.EAST, caves[2][10], new Door());
		caves[2][10].setConnection(CaveRoom.EAST, caves[2][11], new Door());
		caves[2][11].setConnection(CaveRoom.EAST, caves[2][12], new Door());
		caves[2][12].setConnection(CaveRoom.EAST, caves[2][13], new Door());
		
		caves[0][5].setConnection(CaveRoom.SOUTH, caves[1][5], new Door());
		caves[1][5].setConnection(CaveRoom.SOUTH, caves[2][5], new Door());
		caves[2][5].setConnection(CaveRoom.SOUTH, caves[3][5], new Door());
		caves[3][5].setConnection(CaveRoom.SOUTH, caves[4][5], new Door());
		caves[4][5].setConnection(CaveRoom.SOUTH, caves[5][5], new Door());
		caves[5][5].setConnection(CaveRoom.SOUTH, caves[6][5], new Door());
		
		caves[4][2].setConnection(CaveRoom.EAST, caves[4][3], new Door());
		caves[4][3].setConnection(CaveRoom.EAST, caves[4][4], new Door());
		caves[4][4].setConnection(CaveRoom.EAST, caves[4][5], new Door());
		
		caves[6][5].setConnection(CaveRoom.SOUTH, caves[7][5], new Door());
		caves[7][5].setConnection(CaveRoom.SOUTH, caves[8][5], new Door());
		
		caves[0][15].setConnection(CaveRoom.SOUTH, caves[1][15], new Door());
		caves[1][15].setConnection(CaveRoom.SOUTH, caves[2][15], new Door());
		caves[2][15].setConnection(CaveRoom.SOUTH, caves[3][15], new Door());
		caves[3][15].setConnection(CaveRoom.SOUTH, caves[4][15], new Door());
		caves[4][15].setConnection(CaveRoom.SOUTH, caves[5][15], new Door());
		caves[5][15].setConnection(CaveRoom.SOUTH, caves[6][15], new Door());
		caves[6][15].setConnection(CaveRoom.SOUTH, caves[7][15], new Door());
		caves[7][15].setConnection(CaveRoom.SOUTH, caves[8][15], new Door());
		
		caves[4][15].setConnection(CaveRoom.WEST, caves[4][14], new Door());
		caves[4][14].setConnection(CaveRoom.WEST, caves[4][13], new Door());
		caves[4][13].setConnection(CaveRoom.WEST, caves[4][12], new Door());
		caves[4][12].setConnection(CaveRoom.WEST, caves[4][11], new Door());
		caves[4][11].setConnection(CaveRoom.WEST, caves[4][10], new Door());
		
		caves[0][10].setConnection(CaveRoom.SOUTH, caves[1][10], new Door());
		caves[1][10].setConnection(CaveRoom.SOUTH, caves[2][10], new Door());		
		caves[2][10].setConnection(CaveRoom.SOUTH, caves[3][10], new Door());
		caves[3][10].setConnection(CaveRoom.SOUTH, caves[4][10], new Door());
		caves[4][10].setConnection(CaveRoom.SOUTH, caves[5][10], new Door());
		caves[5][10].setConnection(CaveRoom.SOUTH, caves[6][10], new Door());
		caves[6][10].setConnection(CaveRoom.SOUTH, caves[7][10], new Door());
		caves[7][10].setConnection(CaveRoom.SOUTH, caves[8][10], new Door());
		
		
		caves[0][5].setConnection(CaveRoom.EAST, caves[0][6], new Door());
		caves[0][6].setConnection(CaveRoom.EAST, caves[0][7], new Door());
		caves[0][7].setConnection(CaveRoom.EAST, caves[0][8], new Door());
		caves[0][8].setConnection(CaveRoom.EAST, caves[0][9], new Door());
		caves[0][9].setConnection(CaveRoom.EAST, caves[0][10], new Door());
		
		caves[8][5].setConnection(CaveRoom.EAST, caves[8][6], new Door());
		caves[8][6].setConnection(CaveRoom.EAST, caves[8][7], new Door());
		caves[8][7].setConnection(CaveRoom.EAST, caves[8][8], new Door());
		caves[8][8].setConnection(CaveRoom.EAST, caves[8][9], new Door());
		caves[8][9].setConnection(CaveRoom.EAST, caves[8][10], new Door());
		
		
		caves[2][7].setConnection(CaveRoom.SOUTH, caves[3][7], new Door());
		caves[2][8].setConnection(CaveRoom.SOUTH, caves[3][8], new Door());
		caves[3][7].setConnection(CaveRoom.EAST, caves[3][8], new Door());
		caves[3][7].setConnection(CaveRoom.SOUTH, caves[4][7], new Door());
		caves[3][8].setConnection(CaveRoom.SOUTH, caves[4][8], new Door());
		caves[4][7].setConnection(CaveRoom.EAST, caves[4][8], new Door());		
		
		caves[0][12].setConnection(CaveRoom.SOUTH, caves[1][12], new Door());
		caves[1][12].setConnection(CaveRoom.SOUTH, caves[2][12], new Door());
		
		caves[0][12].setConnection(CaveRoom.EAST, caves[0][13], new Door());
		caves[0][13].setConnection(CaveRoom.EAST, caves[0][14], new Door());
		caves[0][14].setConnection(CaveRoom.EAST, caves[0][15], new Door());
		
		
		caves[2][13].setConnection(CaveRoom.SOUTH, caves[3][13], new Door());
		caves[3][13].setConnection(CaveRoom.SOUTH, caves[4][13], new Door());
		caves[4][13].setConnection(CaveRoom.SOUTH, caves[5][13], new Door());
		caves[5][13].setConnection(CaveRoom.SOUTH, caves[6][13], new Door());
//		caves[6][13].setConnection(CaveRoom.SOUTH, caves[7][13], new Door());
//		caves[7][13].setConnection(CaveRoom.SOUTH, caves[8][13], new Door());
		
		caves[8][15].setConnection(CaveRoom.WEST, caves[8][14], new Door());
		caves[8][14].setConnection(CaveRoom.WEST, caves[8][13], new Door());
		caves[8][13].setConnection(CaveRoom.WEST, caves[8][12], new Door());
		
		caves[8][12].setConnection(CaveRoom.NORTH, caves[7][12], new Door());
		caves[7][12].setConnection(CaveRoom.NORTH, caves[6][12], new Door());
		
		
		
		inventory = new Inventory();
		in = new Scanner(System.in);
		
		startExploring();
		

		
	}

	private static void startExploring() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("what would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
		
	}

	public static void print(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}
	

	
}
