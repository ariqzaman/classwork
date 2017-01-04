/**
 * 
 */
package gui.WackAMole;

import gui.components.Action;
import gui.components.Clickable;

/**
 * @author Student6
 *this is for my partner the enemy designer to implement
 */
public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int screenTime);
	
	void setAction(Action action);

}
