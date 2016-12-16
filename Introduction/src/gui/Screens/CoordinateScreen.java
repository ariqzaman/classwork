package gui.Screens;



import java.awt.Color;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen {

	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = 
				new TextLabel(20, 200, 500, 40, "button");
		viewObjects.add(text);
		
		Button button = new Button(20, 200, 500, 40,  "Button", Color.BLACK, new Action() {

			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
			
		});
//		viewObjects.add(button);
//		new TextLabel(20, 200, 500, 40,  "Button", Color.BLACK, new Action());
		viewObjects.add(button);
		viewObjects.add(text);
	}


	
	
	
	
	
	
	
	
	
	
	
}