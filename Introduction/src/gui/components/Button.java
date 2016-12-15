package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel {
		private Color color;
		private Action action;
		
		
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		// TODO Auto-generated constructor stub
		this.color = color;
		this.action = action; 
		update();
	}
	
	public void update(Graphics2D g) {
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
		g.setColor(Color.pink);
		g.fillRoundRect(0, 0,getWidth()-1,getHeight()-1, 30, 30);
	}


}
