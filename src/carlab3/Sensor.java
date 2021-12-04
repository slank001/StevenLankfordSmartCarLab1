/**
 * 
 */
package carlab3;

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
	public boolean activateSensor() {
		return true; //true= sensor activated
	}
	public float DeterminePositionofObstacle() {
		return 1-5; //1-5= varying degrees of angle from the sensor
	}
	public float AvoidObstacle() {
		return 1-5; //1-5 = degree of turn needed to avoid obstacle
	}
	public boolean DetectImmobility() {
		return true; //true = immobile; cannot move forward
	}
	public float RepositionVehicle() {
		return 1-5; //1-5  
	}
	public int DetermineDegreeofRotation() {
		return 1-900; // 900 degrees is the typical degrees of rotation on steering wheel
	}
		
				
	
	
}
