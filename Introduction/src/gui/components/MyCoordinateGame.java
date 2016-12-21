package gui.components;

import gui.GUIApplication;

public abstract class MyCoordinateGame extends GUIApplication {


	public MyCoordinateGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}



	public static MouseCoordinateGame game;
	
	

	public static void main(String[] args){
	
	game = new MouseCoordinateGame(500, 500);
	
	Thread app = new Thread(game);
	
	app.start();
	}
	
}



