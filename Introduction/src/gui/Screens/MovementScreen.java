package gui.Screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUISampleGame.MouseFollower;
import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.ClickableGraphic;
import gui.components.Graphic;
import gui.components.Visible;

public class MovementScreen extends Screen implements MouseMotionListener, MouseListener{

	private ClickableGraphic aurthur;
	private Button back;
	
	public MovementScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		aurthur = new ClickableGraphic(200,200,.25,"resources/sampleImages/aurthur.jpg");
		aurthur.setAction(new Action(){
			public void act(){
				aurthur.setX(aurthur.getX()+20);
				aurthur.setY(aurthur.getY()-20);
			}
		});
		back = new Button(50,50,100,60,"Back", 
				Color.GRAY, new Action() {
			
			public void act() {
				MouseFollower.game.
				setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(aurthur);
		viewObjects.add(back);
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		
	}

	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
		if(aurthur.isHovered(e.getX(), e.getY())){
			aurthur.act();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
}
