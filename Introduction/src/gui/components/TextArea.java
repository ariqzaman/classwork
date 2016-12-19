package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	private Object String;

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.orange);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 35, 25);
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 35, 25);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		FontMetrics fm = g.getFontMetrics();
		
		if(getText()!= null){
				String[] words = getText().split(" ");
				int linePlacement = fm.getHeight();
				String txt = "";
				while(!words[words.length-1].equals(null))
					g.setColor(Color.white);
					String t = getText();
					int cutoff = t.length();
					
					while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
						cutoff --;
						t = t.substring(0,cutoff); 
					}
					
					g.drawString(t, 1, linePlacement);
					linePlacement+= fm.getHeight();
		}
	}

	
//	public class Sleeper implements Runnable{
//		private int number;
//		private int sleepTime;
//		
//		public static void main(String[] args){
//			Thread one = new Thread(new Sleeper(1));
//			Thread two = new Thread(new Sleeper(2));
//			Thread three = new Thread(new Sleeper(3));
//			Thread four = new Thread(new Sleeper(4));
//			
//			one.start();
//			two.start();
//			three.start();
//			four.start(); 
//		}
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Sleeper(int number){
//		this.number = number;
//		this.sleepTime = (int)(1000*Math.random());
//		
//	}
//
//	public void run(){
//		try{
//			System.out.println("thread num"+ number + " will sleep for " + sleepTime +"ms");
//			Thread.sleep(sleepTime);
//			System.out.println("thread num" + number +"woke up");
//			
//		}catch(InterruptExcetion e){
//		e.printStackTrace();	
//	}
//	}
}
