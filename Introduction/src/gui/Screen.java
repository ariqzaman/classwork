package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {

	private BufferedImage image;
	private ArrayList<Visible> viewObjects;


	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}

	public abstract void 
	initObjects(ArrayList<Visible> viewObjects);

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public BufferedImage getImage(){
		return image;
	}

	public int getWidth(){
		return image.getWidth();
	}

	public int getHeight(){
		return image.getHeight();
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
//		for(int i = 0; i < viewObjects.size(); i++){
//			
//		}
		for(int i= 0; i<viewObjects.size(); i++){
			Visible v = viewObjects.get(i);
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return null;
	}
	
	public MouseListener getMouseListener(){
		return null;
	}

	public void addObject(Visible v) {
		// TODO Auto-generated method stub
		viewObjects.add(v);
	}

	public void remove(Visible v) {
		// TODO Auto-generated method stub
		
		// in this implementation we have  a very simple command: remove v
		// however move is a big deal on the ap exam
		// when an object is removed from a list every other object after that object  is moved up in order
		// therefore all fo there respective indicies change. you must MUST be aware of this
		// here is a CLASSIC EXAMPLE:
		//WRONG: suppose you have a list<interger> with {4,8,7,1} and you want to remove all intergers greater than 5
		//for(int i = 0; i<list.size; i++){ if(list.get(i)>5) list.remove }
		//
		//CORRECT:  
		//for(int i = 0; i<list.size; i++){ while(list.get(i)>5) list.remove }
		//
		//OR
		//for(int i = 0; i<list.size; i++){ if(list.get(i)>5) list.remove(i); i--; }
		//for the same reason this doesnt work:
		//for(interger i:list){ if(i>5) list.remove(i); }
		//
		//ONEMORE NOTE: if you call list.remove(int) it will return the objecrt being removed
		//system.out.p[ritnlmn(list.remopve(0)+was removed);
		//
		viewObjects.remove(v);
	}
	
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(0,v);
		}
	}
		
	public void moveTofront(Visible v){
		if (viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	
	}

}
