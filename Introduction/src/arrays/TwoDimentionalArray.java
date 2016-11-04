package arrays;

import java.util.Scanner;

public class TwoDimentionalArray {

	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	
	public static void main(String[] args) {
		
		
		pic = new String[5][4];//String[a][b] a= length/rows b= length of each array/col
		arr2D = new String[5][4];
		
		for(int row = 0; row < arr2D.length; row++)
		{
			//populate with coordinates
			for(int col = 0; col<arr2D[row].length;col++)
			{
				arr2D[row][col] = "(" + row + "," + col + ")";
					
			}
		}
		
		//Styart positions
		i = 2;
		j = 3;
		
		in = new Scanner(System.in);
		startExploring();

	}


	private static void startExploring() {
			while(true){
				printPic(pic);
				System.out.println("you are in room"+ arr2D[i][j]);
				System.out.println("what do u want to do?");
				String input = in.nextLine();
				while(!isValid(input)){
					System.out.println("pls enter w a s d");
					input = in.nextLine();
				}
				interpretInput(input);
			}
			
		
	}


	public static void printPic(String[][] pic){
		for(int row = 0; row< pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				if(row == i && col == j){
					System.out.print("x");
				} else if (pic[row][col] == null) {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}


	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		if(input.equals("w")&& i>0)i--;
		else if(input.equals("a")&& j>0)j--;
		else if(input.equals("d")&& j+1<arr2D[0].length)j++;
		else if(input.equals("s")&& i+1<arr2D.length)i++;
		if(iOrig == i && jOrig == j){
			System.out.println("u r at the edge of the universe. u can no lo"
					+ "nger to mvoe int hat direction");
		}
	}


	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w","a","s","d"};
		for(String key:keys){
			if(key.equals(lc))return true;
		}
		return false;
	}

}
