package gui.WackAMole;

import gui.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int appearanceTime;
	
	
	
	public Mole(int x, int y) {
		super(x, y, .9, "resources/sampleImages/scooby.jpg");
		// TODO Auto-generated constructor stub
		
	}


	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		// TODO Auto-generated method stub
		appearanceTime = screenTime;
	}

}
