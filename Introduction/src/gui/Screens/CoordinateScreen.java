package gui.Screens;



import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener {

	private Button button;
	private TextLabel text;
	private TextArea area; 
	private Graphic aurthur;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
//		TextLabel text = 
//				new TextLabel(20, 200, 500, 40, "button");
//		viewObjects.add(text);
		TextArea assignment = new TextArea(20, 200, 150, 400, "ore BABA hum sup LOOO! xdxdxdxdx dxdxdxxdxdxdxdxdxdxdxdx dxdxdxdxxdxdxdxxxdxd");
		viewObjects.add(assignment);
//		Button button = new Button(20, 200, 500, 40,  "Button", Color.BLACK, new Action() {
//
//			@Override
//			public void act() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		});
//
//		
//		viewObjects.add(button);
		aurthur = new Graphic(30,30, "resources/sampleImages/aurthur.jpg");
		viewObjects.add(aurthur);
	
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();
	//	text.setText("mouse at " + mx + "," + my);
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
}