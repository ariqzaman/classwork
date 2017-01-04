package gui.WackAMole;

import java.util.ArrayList;

import gui.GUIApplication;
import gui.components.TextLabel;

public class WackAMoleGame extends GUIApplication {
	


	public WackAMoleGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		WackAMoleScreen wams = new WackAMoleScreen(getWidth(), getHeight()); 
		setScreen(wams);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WackAMoleGame wamg = new WackAMoleGame(800,500);
		Thread game = new Thread(wamg);
		game.start();
	}

}
