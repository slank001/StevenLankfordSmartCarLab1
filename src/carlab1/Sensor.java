/**
 * 
 */
package carlab1;

/**
 * @author STEEB
 *
 */
public class Sensor {
	private boolean frontSensor;
	private int numberOfSensors;
	private int wheelDiameter;
	private boolean leftSensor;
	private boolean rightSensor;
	private boolean backSensor;
	
	public boolean detectObstacle() {
		return true; //true=obstacle, false=no obstacle
	}
	public boolean alertDriverOfObstacle() {
		return true; 
	}
	public float emergencyBrake() {
		return 1-5; //1=hard brake, 5=light brake, 2-4= varying degrees of braking
	}
	public boolean detectCollision() {
		return true; //true=collision has occurred, 
	}

	

}
