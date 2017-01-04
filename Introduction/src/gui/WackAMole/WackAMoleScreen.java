package gui.WackAMole;

import java.util.ArrayList;

import gui.Screens.ClickableScreen;
import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;

public class WackAMoleScreen extends ClickableScreen implements Runnable{

	 private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;
	
	 
	 
	public WackAMoleScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
		while(timeLeft>0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}

	private void appearNewMole() {
		// TODO Auto-generated method stub
		double chance = .1*(60-timeLeft)/60;
		if(Math.random() < chance){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){

				
				public void act() {
					// TODO Auto-generated method stub
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}});
			addObject(mole);
			moles.add(mole);
		}
		
	}

	private void updateAllMoles() {
		// TODO Auto-generated method stub
		for(int i =0 ; i<moles.size();i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime()-100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime()<= 0){
				remove(m);
				moles.remove(m);
				i--;
			}
			
		}
	}

	private void updateTimer() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft -= .1;
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350, 220, 100, 40, "");
		timeLabel = new TextLabel(360, 40, 80, 40, "30.0");
		//         viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);

	}
	//placeholder until partner finishes players 
	public PlayerInterface getAPlayer() {
		 return null;
	}
	
	public MoleInterface getAMole() {
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		changeText("ready...");
		changeText("set...");
		changeText("G0000000000000000000000000000000000OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		label.setText("");
	}

	private void changeText(String string) {
		// TODO Auto-generated method stub
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
