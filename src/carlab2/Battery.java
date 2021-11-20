/**
 * 
 */
package carlab2;

/**
 * @author STEEB
 *
 */
public class Battery {
	private float voltage; //these will be float because the value of the capacity, voltage and charge are not constant, they change over time.
	private float capacity;
	private float charge;
	
	public boolean powerOn() {
		return true; // return true = ON, return false = OFF
	}
	public boolean standBy() {
		return true; //true = standby mode; a mode an intermediary between ON and OFF with the intention of saving battery.
	}
	public boolean charge() {
		return true; //true = charging, false = not charging
	}
	
}
