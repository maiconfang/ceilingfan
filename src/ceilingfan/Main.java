package ceilingfan;

public class Main {

	public static void main(String[] args) {
		Ceiling fan = new CeilingFan();

		System.out.println("Should be at 0: real -> " + fan.getCurrentSpeed());
		fan.increaseSpeed();
		System.out.println("Should be at 1: real -> " + fan.getCurrentSpeed());
		fan.increaseSpeed();
		fan.increaseSpeed();
		fan.increaseSpeed();
		System.out.println("Should be at 0: real -> " + fan.getCurrentSpeed());
		
		fan.increaseSpeed();
		fan.increaseSpeed();
		System.out.println("Should be at 2: real -> " + fan.getCurrentSpeed());

		System.out.println("Reversing speed...");
		fan.reverse();
		System.out.println("Should be at -2: real -> " + fan.getCurrentSpeed());
		
		fan.increaseSpeed();
		fan.increaseSpeed();
		System.out.println("Should be at 0: real -> " + fan.getCurrentSpeed());
	}

}
