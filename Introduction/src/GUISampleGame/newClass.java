package GUISampleGame;

public class newClass {

//	public static void printTF(boolean[][] xd) {
//	for(int i = 0; i<xd.length; i++){
//		for(int j = 0; j<xd.length;j++)
//		if(xd[i][j]){
//			System.out.print("O");
//		}else{
//			System.out.print("X");
//		}
//		
//		}
//	}
	private static boolean[][] grid;
	
	public static void main(String args[]){
		grid = new boolean[5][5];
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
		buttonClick(3,3);
		printGrid(grid);
	}

	private static void buttonClick(int r, int c) {
		// TODO Auto-generated method stub
		if(r>=0 && r<grid.length){
			switchRow(grid[r], c);
		}
		switchColumn(grid,r,c);
		boolean win = true;
		A: for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid[i].length; j++){
				if(grid[i][j]){
					win = false;
					break A;
				}
				
			}
		}
		if(win)System.out.println(" weener ");
	}

	private static void printGrid(boolean[][] grid) {
		// TODO Auto-generated method stub
		for(boolean[] row:grid){
			for(boolean b: row){
				if(b)System.out.print("O");
				else System.out.print("X");
			}
			System.out.print("\n");
		}
	}

	private static void switchRow(boolean[] row, int x) {
		// TODO Auto-generated method stub
//		for(int i = -1; i<2; i++){
//			if(x + i >= 0 && x+i < row.length){
//				row[x+i] = !row[x+i];
//			}
//		}
		if(x>= 0 && x<row.length){
			for(int i = -1; i<2; i++){
				if(x + i >= 0 && x+i < row.length){
					row[x+i] = !row[x+i];
				}
			}
		}
	}
	
	private static void switchColumn(boolean[][] grid, int r, int c) {
		// TODO Auto-generated method stub
		switchIfValid(grid, r-1, c);
		switchIfValid(grid, r+1, c);
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if(r >= 0 && r < grid.length && c >=0 && c<grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}
	
}
