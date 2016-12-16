package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		// TODO Auto-generated constructor stub
	}
	
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    FontMetrics fm = g.getFontMetrics();
		String[] words = getText().split(" ");
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
