package CaveExplorer;


import java.util.Scanner;

public class mapGrid {
	public static CaveRoom caves[][];


	public static void main(String args[]) {
		
		}
		

		public static void picDrawing(){
			String[][] pic = new String[10][12];
			for(int row = 0; row< pic.length; row++){
				for(int col = 0; col < pic[row].length; col++){
					pic[row][col] = " ";
				}
			}

		
	
		for(int col = 0 ; col < pic[0].length; col++){
			pic[0][col]= "_";
			pic[pic.length-1][col]= "_";
		}
		//left and right col is "|"
		for(int row = 1; row < pic.length; row++){
			pic[row][0]="|";
			pic[row][pic[0].length-1]="|";
		}

	}
	
	public static void printPic(String[][] pic){
		for(int row = 0; row< pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}

}

