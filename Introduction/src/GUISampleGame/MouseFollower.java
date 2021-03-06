package GUISampleGame;

import gui.GUIApplication;
import gui.Screens.CoordinateScreen;
import gui.Screens.MovementScreen;

public class MouseFollower extends GUIApplication {

	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public static CoordinateScreen coordScreen;
	public static MovementScreen moveScreen;
	public static MouseFollower game;
	
	public static void main(String[] args){
		game = new MouseFollower(500, 500);
		Thread app = new Thread(game);
		app.start();
	}
	
	@Override
	public void initScreen() {
		moveScreen = new MovementScreen(getWidth(), 
				getHeight());
		coordScreen = new CoordinateScreen(getWidth(),
				getHeight());
		setScreen(coordScreen);
	}

}