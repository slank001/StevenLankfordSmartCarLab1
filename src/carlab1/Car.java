package carlab1;

public class Car {
	
	private String manufacturer; //name of maunfacturer
	private int height; //height in inches
	private int width; //width in inches
	private int weight; //weight in pounds
	private String color; 
	private String model;
	private int yearManufactured;
	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
