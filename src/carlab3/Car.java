package carlab3;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Car implements SelfCheckCapable {
	
	private CommunicationCenter manufacturer; //name of manufacturer
	private int height; //height in inches
	private Steer width; //width in inches
	private int weight; //weight in pounds
	private Lights color; 
	private String model;
	private int yearManufactured;
	
	
	
	public Car() {
		width = new Steer();
		manufacturer = new CommunicationCenter();
		color = new Lights();
		
		
	}
	
	public float brake() {
		return 1-5; //1=hard brake, 5=light brake, 2-4= varying degrees of braking
	}
	public boolean park() {
		return true; //true = car is in park mode
	}
	public float accelerate() {
		return 1-5; //1=max accelerate, 5=slow accelerate, 2-4= varying degrees of accelerate
	}
	public boolean reverse() {
		return true;//true= car is in reverse mode
	}
	public int turn() {
		return 1-90;// 1-90 are degrees
		
	}
	public float maintainSpeed() {
		return 1-5;
	}
	public boolean ShiftDrive( ) {
		return true;
		
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.runSelfCheck();
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "This is a Test";
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
}
