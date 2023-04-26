package com.gqt.oopsprojs.package2;
 class RobotApps {
	void speak() {
		System.out.println("Robot is speaking");
		
	}
	void interact() {
		System.out.println("Robot is interacting");
	}
	void walk() {
		System.out.println("Robot is walking");
	}

}
class FighterRobot extends RobotApps {
	void fight() {
		System.out.println("fighter Robot fights");
	}
}
class Teacher extends RobotApps {
	void teach() {
		System.out.println("Robot is teaching " );
	}
	
}
public class Robot{
	public static void main (String[]   args) {
		FighterRobot n = new FighterRobot();
		Teacher t = new Teacher();
		System.out.println("Output of the FighterRobot is:");
		n.speak();
		n.interact();
		n.walk();
		n.fight();
		System.out.println("Output of the Teacher robot is:");
		t.speak();
		t.interact();
		t.walk();
		t.teach();
		
		
		
		
	}
	
}
